package m1.info;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class Producteur {

    @Channel("celcius-out")
    Emitter<Double> emitter;

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final Random random = new Random();

    void onStart(@Observes StartupEvent ev) {

        scheduler.scheduleAtFixedRate(()->{
           double value = random.nextDouble((40.0 - 10.0) +1.0)+ 10.0;
            System.out.println("Celcius > "+value);
           emitter.send(Double.valueOf(value));
        },0,5, TimeUnit.SECONDS);
    }
}

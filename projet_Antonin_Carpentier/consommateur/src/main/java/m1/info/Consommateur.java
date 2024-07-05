package m1.info;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class Consommateur {

    @Incoming("fahrenheit-in")
    public void sink(Double temperature) {
        System.out.println("Fahrenheit > "+temperature);
    }
}

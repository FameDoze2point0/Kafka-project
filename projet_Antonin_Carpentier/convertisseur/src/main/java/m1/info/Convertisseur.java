package m1.info;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

@ApplicationScoped
public class Convertisseur {

    @Incoming("celcius-in")
    @Outgoing("fahrenheit-out")
    public Message<Double> convert(Message<Double> message) {
        return message.withPayload(message.getPayload()*9.0/5.0 + 32.0);
    }
}

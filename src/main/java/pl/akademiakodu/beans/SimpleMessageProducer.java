package pl.akademiakodu.beans;

/**
 * Created by Lenovo on 2016-12-05.
 */
public class SimpleMessageProducer implements MessageProducer {
    @Override
    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}

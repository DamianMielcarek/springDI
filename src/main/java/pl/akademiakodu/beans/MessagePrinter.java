package pl.akademiakodu.beans;

/**
 * Created by Lenovo on 2016-12-05.
 */
public class MessagePrinter {

    private MessageProducer producer;

    public MessagePrinter(){}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print(){
        System.out.println(producer.getMessage());
    }
}

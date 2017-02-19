package pl.akademiakodu.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Lenovo on 2016-12-05.
 */
@Primary
@Component
public class AdvancedMessage implements Message {
    @Override
    public void printEmployee(Employee employee) {
        System.out.println("Super Employee "+employee.getSurname()+" "+employee.getName());
    }
}

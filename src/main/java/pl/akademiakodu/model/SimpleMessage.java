package pl.akademiakodu.model;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessage implements Message {

    public SimpleMessage(){}

    @Override
    public void printEmployee(Employee employee) {
        System.out.println(employee.getName()+" "+employee.getSurname()+" "+employee.getSalary());
    }
}

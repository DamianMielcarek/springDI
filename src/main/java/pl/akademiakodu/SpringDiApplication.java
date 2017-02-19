package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import pl.akademiakodu.beans.MessagePrinter;
import pl.akademiakodu.model.Employee;

@SpringBootApplication
@ImportResource("classpath:beans-config.xml")
public class SpringDiApplication {

	public static void main(String[] args) {
        /*
        ĆWICZENIE 1 SPRING

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		MessagePrinter printer = ctx.getBean(MessagePrinter.class);
		System.out.println("DZIAŁA");
		printer.print();
		System.out.println("Haha:) "+printer.getName());
		ctx.close();
        */


        ConfigurableApplicationContext ctx = SpringApplication.run(SpringDiApplication.class,args);
        Employee employee = ctx.getBean(Employee.class);
        employee.setName("Damian");
        employee.setSurname("Mielcarek");
        employee.setSalary(5000);
        employee.getMessage().printEmployee(employee);
        ctx.close();

        //SpringApplication.run(SpringDiApplication.class,args);
	}
}

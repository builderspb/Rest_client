package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employeeById = communication.getEmployeeById(1);
//        System.out.println(employeeById);

       Employee employee = new Employee("5","1", "HR",1000);
 //      employee.setId(1);
       communication.saveEmployee(employee);
        System.out.println(employee);

//        communication.deleteEmployee(1);

    }
}

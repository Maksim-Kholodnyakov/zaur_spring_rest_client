package com.maksprofff.spring.rest;

import com.maksprofff.spring.rest.configuration.MyConfig;
import com.maksprofff.spring.rest.entity.Employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication =
                context.getBean("communication", Communication.class);
//        List<Employee> allEmp =
//                communication.getAllEmployee();
//        System.out.println(allEmp);

//        Employee employee = communication.getEmployee(4);
//        System.out.println(employee);

//        Employee employee = new Employee("Test2","Testov2","HR",343);
//        employee.setId(8);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(8);

    }
}

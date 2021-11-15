package com.dailycodechallenge.swagerdemo.swagger_demo.service;

import com.dailycodechallenge.swagerdemo.swagger_demo.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees()
    {
        Employee employee1 = new Employee(1l,"Kiran",32);
        Employee employee2 = new Employee(2l,"Manu",30);
        Employee employee3 = new Employee(3l,"Sanju",32);

        return Arrays.asList(employee1,employee2,employee3);
    }
}

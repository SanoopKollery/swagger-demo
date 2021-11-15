package com.dailycodechallenge.swagerdemo.swagger_demo.controller;

import com.dailycodechallenge.swagerdemo.swagger_demo.Entity.Employee;
import com.dailycodechallenge.swagerdemo.swagger_demo.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Sucess"),
            @ApiResponse(code=401,message = "Unauthorized"),
            @ApiResponse(code=403,message = "Forbidden"),
            @ApiResponse(code=404,message = "")
    })
    @GetMapping("/getAllEmployees")
    @ApiOperation(value = "Getting All Employee Details",response = Employee.class)
    public List<Employee> getAllEmployee()
    {
        return  employeeService.getAllEmployees();
    }


    @GetMapping("/getAge/{name}")
    public List<Integer> getAge(@PathVariable("name") String name)
    {
        List<Integer> age =  employeeService.getAllEmployees().stream()
                .filter(emp -> name.equalsIgnoreCase(emp.getEmployeeName()))
                .map(Employee::getEmployeeAge)
                .collect(Collectors.toList());
        return age;

    }
}

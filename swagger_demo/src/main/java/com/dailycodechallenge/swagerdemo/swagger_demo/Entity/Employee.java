package com.dailycodechallenge.swagerdemo.swagger_demo.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

@ApiModel(description = "Employee Data")
public class Employee {

    @ApiModelProperty(notes = "Employee ID",name = "Employee ID",required = true,
    value = "123456")
    private Long employeeID;
    @ApiModelProperty(notes = "Employee Name",name = "Employee Name",required = true,
            value = "Sanju")
    private String employeeName;
    @ApiModelProperty(notes = "Employee Age",name = "Employee Age",required = true,
            value = "30")
    private int employeeAge;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                '}';
    }


    public Employee(Long employeeID, String employeeName, int employeeAge) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }
}

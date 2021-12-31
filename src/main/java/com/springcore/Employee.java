package com.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private int employeeId;
    private List<String> employeeAddresses;
    private Set<String> employeePhones;
    private Map<String, String> employeeCourses;
    private Properties employeeProperties;

    public Employee(int employeeId, List<String> employeeAddresses, Set<String> employeePhones, Map<String, String> employeeCourses, Properties employeeProperties) {
        this.employeeId = employeeId;
        this.employeeAddresses = employeeAddresses;
        this.employeePhones = employeePhones;
        this.employeeCourses = employeeCourses;
        this.employeeProperties = employeeProperties;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeAddresses=" + employeeAddresses +
                ", employeePhones=" + employeePhones +
                ", employeeCourses=" + employeeCourses +
                ", employeeProperties=" + employeeProperties +
                '}';
    }

    public Employee() {
    }

    public Properties getEmployeeProperties() {
        return employeeProperties;
    }

    public void setEmployeeProperties(Properties employeeProperties) {
        this.employeeProperties = employeeProperties;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public List<String> getEmployeeAddresses() {
        return employeeAddresses;
    }

    public void setEmployeeAddresses(List<String> employeeAddresses) {
        this.employeeAddresses = employeeAddresses;
    }

    public Set<String> getEmployeePhones() {
        return employeePhones;
    }

    public void setEmployeePhones(Set<String> employeePhones) {
        this.employeePhones = employeePhones;
    }

    public Map<String, String> getEmployeeCourses() {
        return employeeCourses;
    }

    public void setEmployeeCourses(Map<String, String> employeeCourses) {
        this.employeeCourses = employeeCourses;
    }

}

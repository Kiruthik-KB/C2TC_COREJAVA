package com.kiruthik.assignment.utilities;

import com.yourname.assignment.employees.Employee;

/**
 * EmployeeUtilities provides utility methods for employees.
 */
public class EmployeeUtilities {

    /**
     * Displays basic information about an employee.
     * @param employee The Employee object.
     */
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Updates the salary of an employee.
     * @param employee The Employee object.
     * @param newSalary The new salary to be set.
     */
    public static void updateEmployeeSalary(Employee employee, double newSalary) {
        employee.setSalary(newSalary);
        System.out.println("Updated Salary: " + employee.getSalary());
    }
}

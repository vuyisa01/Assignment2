package za.ac.cput;

import java.util.Objects;

/**
 * Author: Vuyisa Nkangana(218192215)
 */
public class Employee {
    private String firstName, lastName;
    private int employeeID;
    private Double Salary;

    public Employee(int employeeID) {

    }

    public Employee(String firstName) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }

    public Employee(String firstName, int employeeID) {
        this.firstName = firstName;
        this.employeeID = employeeID;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getEmployeeID() {

        return employeeID;
    }

    public void setEmployeeID(int employeeID) {

        this.employeeID = employeeID;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {

        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }
}

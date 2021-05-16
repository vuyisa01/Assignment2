package za.ac.cput;

/**
 * Author: Vuyisa Nkangana(218192215)
 */
public class Employee {
    private String firstName, lastName;
    private int employeeID;
    private Double Salary;

    public Employee(String firstName) {
        this.firstName = firstName;
    }
    public Employee(int employeeID) {
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

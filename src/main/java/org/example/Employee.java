package org.example;

public class Employee {

    private String id;
    private String username;
    private String salary;



    public Employee() {
        super();
    }
    public Employee(String id, String username, String salary) {
        super();
        this.id = id;
        this.username = username;
        this.salary = salary;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee ID=" + id + ", Username=" + username + ", salary=" + salary;
    }


}

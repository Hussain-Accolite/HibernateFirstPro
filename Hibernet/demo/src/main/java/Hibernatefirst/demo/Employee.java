package Hibernatefirst.demo;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
//@Builder
@Entity
public class Employee {
    @Id
    private int Emp_id;

    private String Name;
    private Double salary;
    private String location;

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Emp_id=" + Emp_id +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}

package entity;

import base.BaseEntity;

import java.sql.Date;
import java.time.LocalDate;

public class Employee<T> extends BaseEntity<T> {
    private  String firstName;
    private String lastName;
    private String EmployeeID;
    private LocalDate birth;
    private WorkUnit workUnit;

    public Employee(T id, String firstName, String lastName, String employeeID, LocalDate birth, WorkUnit workUnit) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        EmployeeID = employeeID;
        this.birth = birth;
        this.workUnit = workUnit;
    }

    public Employee(T id) {
        super(id);
    }

    public Employee() {
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

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public WorkUnit getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(WorkUnit workUnit) {
        this.workUnit = workUnit;
    }
}

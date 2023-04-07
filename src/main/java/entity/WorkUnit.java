package entity;

import base.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class WorkUnit extends BaseEntity {
    private String workName;
    private String phoneNumber;
    List<Employee> employeeList=new ArrayList<>();
  //  Employee[] employees=new Employee[5];


    public WorkUnit(Object id, String workName, String phoneNumber, List<Employee> employeeList) {
        super(id);
        this.workName = workName;
        this.phoneNumber = phoneNumber;
        this.employeeList = employeeList;
    }



    public WorkUnit() {
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


}

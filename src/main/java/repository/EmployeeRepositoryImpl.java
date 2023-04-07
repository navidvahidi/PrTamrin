package repository;

import base.BaseEntity;
import base.repository.BaseRepository;
import dataBase.HikariDataSource;
import entity.Employee;
import entity.WorkUnit;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl<I,E extends BaseEntity<I>>  implements BaseRepository<I,E>{


    @Override
    public void save(E entity) {
        Employee employee=(Employee)entity;
        String query="insert into employee(employee_firstname, employee_lastname, employee_personnelId, employee_birth,employee_workUnit_Id) values (?,?,?,?,?)";
        try {
            Connection connection = HikariDataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,employee.getFirstName());
            preparedStatement.setString(2,employee.getLastName());
            preparedStatement.setString(3,employee.getEmployeeID());
            preparedStatement.setDate(4, Date.valueOf(employee.getBirth()));
            preparedStatement.setObject(5, employee.getWorkUnit().getId());
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<E> Select() {
        List<Employee> employees=new ArrayList<>();
        String query="SELECT * from Employee";
        try {
            Connection connection = HikariDataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Employee employee=new Employee();
                employee.setId(resultSet.getObject(1));
                employee.setFirstName(resultSet.getString(2));
                employee.setLastName(resultSet.getString(3));
                employee.setEmployeeID(resultSet.getString(4));
                employee.setBirth(resultSet.getDate(5).toLocalDate());
                employee.setWorkUnit((WorkUnit) resultSet.getObject(6));
                employees.add(employee);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return (List<E>) employees;
    }

    @Override
    public E selectID(I Id) {
        return null;
    }

    @Override
    public void edit(E entity) {

    }

    @Override
    public void delete(E entity) {

    }
}

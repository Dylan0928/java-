package com.example.model;

public class EmployeeDAOFactory {
    public EmployeeDAO createEmployeeDAO(){
        return new EmployeeDAOMemoryImpl() ;
    }
}

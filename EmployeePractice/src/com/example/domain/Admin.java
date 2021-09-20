package com.example.domain;

import com.example.domain.Employee;

public class Admin extends Employee{

    public Admin(String name, String ssn, double salary) {
        super(name, ssn, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"正在寫報告！");
    }
    
    

}

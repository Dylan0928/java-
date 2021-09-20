package com.example.domain;

import com.example.domain.RegularStaff;
import java.util.ArrayList;

public class Manager extends Employee implements RegularStaff{    
    private String deptName;
    private ArrayList employees;
    private double baseBonus = 100000;

    public Manager(String name, String ssn, double salary, String deptName) {
        super(name, ssn, salary);
        this.deptName = deptName;
        this.employees = new ArrayList();
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"正在開會！");
    }

    @Override
    public double getBonus() {
        return baseBonus*calcPerMultiplier();
    }
    
    
    
    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(employees.size()>0){
            sb.append("管理員工: ");
            for(Object obj : employees){
                Employee e = (Employee)obj;
                sb.append(e.getName()+", ");
            }
            sb.append("\n");
        }        
        return super.toString() +"部門: " + this.deptName+"\n"+ sb;
    }

    public boolean addEmployee(Employee e){
        if(employees.contains(e)){
            System.out.println("員工"+e.getName()+"已存在");
            return false;
        } else {
            employees.add(e);
            System.out.println("員工"+e.getName()+"加入"+this.deptName+"部門");
            return true;
        }
    }
    
    public boolean removeEmployee(Employee e){
        if(employees.contains(e)){
            employees.remove(e);
            System.out.println("員工"+e.getName()+"離開"+this.deptName+"部門");
            return true;
        } else {
            System.out.println("員工"+e.getName()+"不存在");
            return false;
        }
    }
    
    public void printStaffDetails(){
        System.out.print(this.getName()+"管理員工: ");
        for(Object obj:employees){
            if(obj instanceof Employee){
                Employee emp = (Employee)obj;
                System.out.print(emp.getName()+", ");
            }
        }
        System.out.println("");
    }
}

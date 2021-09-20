package com.example.domain;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public abstract class Employee {
    private static int nextId=1;
    private int empId;
    private String name;
    private String ssn;
    double salary;
    protected NumberFormat formatter;
    
    public Employee(String name, String ssn, double salary){
        this.empId = nextId++;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
        formatter = NumberFormat.getCurrencyInstance();
    }
    
    public abstract void work();
    
    public int getEmpId(){
        return this.empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }    

    public void setName(String name) {
        if(name!=null && name.trim().length()>0){
            this.name = name;            
        } else {
            System.out.println("姓名未輸入!");
        }
    }
    
    public void raiseSalary(double increase){
        if(increase>0){
            this.salary += increase;
        } else {
            System.out.println("加薪金額需大於0");
        }
    }

    @Override
    public String toString() {
        return "======員工資料======\n" +
                "編號: "+this.empId+"\n" +
                "姓名: "+this.name+"\n" +
                "SSN: "+this.ssn+"\n"+
                "薪水: "+formatter.format(this.salary)+"\n";
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.empId;
        hash = 29 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.empId != other.empId) {
            return false;
        }
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }
    
    

}

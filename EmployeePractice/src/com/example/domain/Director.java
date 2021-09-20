package com.example.domain;

import com.example.domain.Manager;

public class Director extends Manager{
    
    private double budget;
    private double baseBonus = 150000;
    
    public Director(String name, String ssn, double salary, String deptName, double budget) {
        super(name, ssn, salary, deptName);
        this.budget = budget;
    }
    
    @Override
    public void work() {
        System.out.println(this.getName()+"正在審預算！");
    }

    @Override
    public double getBonus() {
        return baseBonus*calcPerMultiplier();
    }
    
    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return super.toString() + "預算: " + formatter.format(budget)+"\n";
    }

    
}

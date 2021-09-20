package com.example.domain;

import com.example.domain.RegularStaff;

public class Engineer extends Employee implements RegularStaff{
    private String[] skills;
    private int skillCount;
    
    public Engineer(String name, String ssn, double salary) {
        super(name, ssn, salary);
        skills = new String[5];
        skillCount = 0;
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"正在修電腦！");
    }

    @Override
    public double getBonus() {
        return salary*calcPerMultiplier();
    }
    
    
    public void addSkill(String skill){
        if(skillCount<skills.length)
            skills[skillCount++] = skill;
    }
    
    private String getAllSkills(){
        StringBuilder output = new StringBuilder();
        for(int i=0; i<skillCount; i++){
            output.append(skills[i]+" ");
        }
        return output.toString();
    } 

    @Override
    public String toString() {
        String output = super.toString();        
        if(skillCount>0)
            output+= "技能: "+ this.getAllSkills()+"\n";
        return output;
    }
    
}

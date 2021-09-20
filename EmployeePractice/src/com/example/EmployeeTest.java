package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import com.example.domain.RegularStaff;

public class EmployeeTest {

    public static void main(String[] args) {        
        Employee emp1 = new Admin("Sean", "A123456789", 50000.00);
        emp1.setName("Sean Cheng");
        emp1.raiseSalary(1000);
        
        Admin emp2 = new Admin("David", "F134567890", 60000);        
        Engineer emp3 = new Engineer("Louis", "B234567890", 55000);
        Manager emp4 = new Manager("Amy", "A298765432", 80000, "Sales");
        Director emp5 = new Director("Bob", "F1987654222", 100000, "Global Sales", 10000000);  
        emp3.addSkill("Java");
        emp3.addSkill("Android");        
        
        emp4.addEmployee(emp1);
        emp4.addEmployee(emp2);
        emp4.addEmployee(emp3);
        emp5.addEmployee(emp4);
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);
        
        emp1.work();
        emp2.work();
        emp3.work();
        emp4.work();
        emp5.work();
        System.out.println();
        
        RegularStaff[] staffs = new RegularStaff[3];
        staffs[0] = emp3;
        staffs[1] = emp4;
        staffs[2] = emp5;
        
        for(RegularStaff staff:staffs){
            System.out.printf("%s得到年終獎金：%.0f%n", ((Employee)staff).getName(), staff.getBonus());
            System.out.printf("得到的尾牙獎品：%s%n",  RegularStaff.getLuckyDraw());
        }
    }
}

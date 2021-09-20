package com.example;

import java.util.Calendar;

public class SingletonBankingMain {

    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        initializeCustomers(bank);

        // run the customer report
        CustomerReport report = new CustomerReport();
        Bank bank2 = Bank.getInstance();
        Bank bank3 = Bank.getInstance();
        if(bank == bank2)
            System.out.println("bank與bank2為相同物件");
        else
            System.out.println("bank與bank2為不同物件");
        initializeCustomers(bank2);
        
        report.setBank(bank);
        report.generateReport();
        CustomerReport report2 = new CustomerReport();
        report2.setBank(bank2);
        report2.generateReport();
        
        
    }

    private static void initializeCustomers(Bank bank) {
        Customer customer;
        
        //180 day term
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 180);
        
        // Create several customers and their accounts
        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomer(0);
        customer.addAccount(new TimeDepositAccount(500.00, DepositLength.ONE_YEAR));
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomer(1);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomer(2);
        customer.addAccount(new TimeDepositAccount(1500.00, DepositLength.THREE_MONTHS));
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomer(3);
        // Maria and Tim have a shared checking account
        customer.addAccount(bank.getCustomer(2).getAccount(1));
        customer.addAccount(new TimeDepositAccount(150.00, DepositLength.SIX_MONTHS));
    }
}
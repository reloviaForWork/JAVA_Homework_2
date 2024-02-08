package org.example;

import entities.*;

public class Main {
    public static void main(String[] args) {
        // Instance creation
        // classes and interfaces are reference types!
        Customer customer = new Customer(1,"Ankara") ;
        CreditManager creditManager = new CreditManager();
        Company company = new Company("Company 96", "10458");
        Person person = new Person("Yunus Emre", "Civan","12345678901");
        // IoC Container
        CustomerManager customerManager = new CustomerManager(new Person(), new CarCreditManager());
        customerManager.giveCredit();

        // Getter -> Read
        System.out.println("ID: " + customer.getId() +
                "\nFirst Name: " + person.getFirstName() +
                "\nLast Name: " + person.getLastName() +
                "\nNational Identity: " + person.getNationalIdentity() +
                "\nCity: " + customer.getCity() +
                "\nCompany Name: " + company.getCompanyName() +
                "\nTax Number: " + company.getTaxNumber()
        );

        customerManager.save();
        customerManager.delete();


    }
}
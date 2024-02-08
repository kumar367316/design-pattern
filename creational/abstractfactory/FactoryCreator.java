package com.designpattern.creational.abstractfactory;

class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        throw new RuntimeException("Now Htc provide loan and bank facility");
    }
}
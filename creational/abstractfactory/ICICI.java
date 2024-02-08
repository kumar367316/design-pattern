package com.designpattern.creational.abstractfactory;

class ICICI implements Bank{
       private final String bankName;
       ICICI(){
            bankName = "ICICI BANK";
        }  
        public String getBankName() {  

           return bankName;
       }  
}  
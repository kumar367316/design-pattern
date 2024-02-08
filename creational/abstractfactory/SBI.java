package com.designpattern.creational.abstractfactory;

class SBI implements Bank{
      private final String bankName;
      public SBI(){
          bankName = "SBI BANK";
        }  
       public String getBankName(){  

          return bankName;
       }  
} 
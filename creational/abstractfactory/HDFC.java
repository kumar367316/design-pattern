package com.designpattern.creational.abstractfactory;

class HDFC implements Bank{
         private final String bankName;
         public HDFC(){
             bankName = "HDFC BANK";
        }  
        public String getBankName() {  
                  return bankName;
        }  
}
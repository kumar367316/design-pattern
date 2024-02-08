package com.designpattern.structural.proxy;

public class ProxyPatternClient {
    public static void main(String[] args)   
    {  
        OfficeInternetAccess access = new ProxyInternetAccess("Bikash");
        access.grantInternetAccess();  
    }  
}  
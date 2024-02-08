package com.designpattern.structural.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeName;
    private RealInternetAccess realaccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realaccess = new RealInternetAccess(employeeName);
            realaccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    public int getRole(String employeeName) {
        // Check role from the database based on Name and designation
        // return job level or job designation.
        Map<String,Integer> employeeDetails = new HashMap<>();
        employeeDetails.put("Bikash",4);
        employeeDetails.put("Kumar",6);
        employeeDetails.put("Bunny",2);
        employeeDetails.put("Durga",12);
        employeeDetails.put("Funny",8);
        if(Objects.isNull(employeeName))
            throw new RuntimeException("employee name is mandatory for internet access");
        return employeeDetails.get(employeeName);
    }
}  
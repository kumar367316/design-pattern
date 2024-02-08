package com.designpattern.creational.factorymethod;

import java.util.Objects;

class GetPlanFactory {

    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType) {
        if (Objects.isNull(planType)) {
            throw new RuntimeException("Please provide some plans");
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InternationalPlan();
        }
        throw new RuntimeException("This facility is not available");
    }
}
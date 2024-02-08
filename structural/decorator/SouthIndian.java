package com.designpattern.structural.decorator;

public class SouthIndian extends FoodDecorator{

    public SouthIndian(Food newFood){
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood()+ "Biriyani with sambar";
    }

    public double price(){
        return super.foodPrice()+210.00;
    }
}

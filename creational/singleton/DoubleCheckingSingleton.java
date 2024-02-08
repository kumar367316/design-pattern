package com.designpattern.creational.singleton;

import lombok.Synchronized;

import java.util.Objects;

public class DoubleCheckingSingleton {

    public static DoubleCheckingSingleton instance;
    private DoubleCheckingSingleton() {
    }

    public static DoubleCheckingSingleton getInstance() {
        if(Objects.isNull(instance)){
            synchronized(DoubleCheckingSingleton.class){
                if(Objects.isNull(instance)){
                    instance = new DoubleCheckingSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this class is not allowed");
    }
    protected Object readResolve() {
        return instance;
    }
}



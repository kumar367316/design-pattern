package com.designpattern.creational.singleton;

import java.lang.reflect.Constructor;

public class SingletonTest {

    public static void main(String[] args) {
        //RunTime, BusinessDelegate, ServiceLocator
        try {
            DoubleCheckingSingleton doubleCheckingSingleton = DoubleCheckingSingleton.getInstance();
            DoubleCheckingSingleton doubleCheckingSingleton2 = DoubleCheckingSingleton.getInstance();
            System.out.println(doubleCheckingSingleton.hashCode());
            System.out.println(doubleCheckingSingleton2.hashCode());
            Constructor<DoubleCheckingSingleton> doubleCheckingSingletonConstructor = DoubleCheckingSingleton.class.getConstructor();

            DoubleCheckingSingleton doubleCheckingSingleton6 = (DoubleCheckingSingleton)doubleCheckingSingleton.clone();
            System.out.println(doubleCheckingSingleton6.hashCode());

            DoubleCheckingSingleton doubleCheckingSingleton5 = doubleCheckingSingletonConstructor.newInstance();
            System.out.println(doubleCheckingSingleton5.hashCode());

            Class<DoubleCheckingSingleton> singletonClass =
                    (Class<DoubleCheckingSingleton>) Class.forName("com.designpattern.creational.singleton.DoubleCheckingSingleton");
            DoubleCheckingSingleton doubleCheckingSingleton3 = singletonClass.newInstance();
            System.out.println(doubleCheckingSingleton3.hashCode());

            DoubleCheckingSingleton doubleCheckingSingleton4 = DoubleCheckingSingleton.class.newInstance();
            System.out.println(doubleCheckingSingleton4.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

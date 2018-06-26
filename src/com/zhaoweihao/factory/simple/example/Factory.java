package com.zhaoweihao.factory.simple.example;

public class Factory {
    //静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
        }

        if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
        }

        return product;
    }
}

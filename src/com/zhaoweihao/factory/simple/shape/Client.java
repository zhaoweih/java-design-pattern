package com.zhaoweihao.factory.simple.shape;

public class Client {
    public static void main(String args[]) {
        Shape shape;
        shape = ShapeFactory.getShape("circle");
        shape.draw();
        shape.erase();
    }
}

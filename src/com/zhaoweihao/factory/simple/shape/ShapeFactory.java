package com.zhaoweihao.factory.simple.shape;

interface Shape {
    void draw();
    void erase();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }

    @Override
    public void erase() {
        System.out.println("擦除矩形");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}

class ShapeFactory {
    public static Shape getShape(String arg) {
        Shape shape = null;
        if (arg.equalsIgnoreCase("circle")) {
            shape = new Circle();
            System.out.println("初始化圆形");
        }

        if (arg.equalsIgnoreCase("rectangle")) {
            shape = new Rectangle();
            System.out.println("初始化矩形");
        }

        if (arg.equalsIgnoreCase("triangle")) {
            shape = new Triangle();
            System.out.println("初始化三角形");
        }

        return shape;
    }

}

package com.zhaoweihao.strategy;

class MovieTicket {
    private double price;
    private Discount discount;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return discount.calculate(this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

interface Discount {
    public double calculate(double price);
}

class StudentDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("学生票八折");
        return price * 0.8;
    }
}

class VIPDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("VIP五折，加积分");
        return price * 0.5;
    }
}

class ChildrenDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("儿童减10块");
        if (price > 20) return price - 10;
        return price;
    }
}

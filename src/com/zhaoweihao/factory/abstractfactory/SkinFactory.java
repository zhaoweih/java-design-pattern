package com.zhaoweihao.factory.abstractfactory;


// abstract product
interface Button {
    public void display();
}

// concrete product
class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("display green button");
    }
}

// concrete product
class SummerButton implements Button {

    @Override
    public void display() {
        System.out.println("display blue button");
    }
}

// abstract product
interface TextField {
    public void display();
}

// concrete product
class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("display green text field");
    }
}

// concrete product
class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("display blue text field");
    }
}

// abstract product
interface Combo {
    public void display();
}

// concrete product
class SpringCombo implements Combo {

    @Override
    public void display() {
        System.out.println("display green combo");
    }
}

// concrete product
class SummerCombo implements Combo {

    @Override
    public void display() {
        System.out.println("display blue combo");
    }
}

// abstract factory
interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public Combo createCombo();
}

// con product
class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public Combo createCombo() {
        return new SpringCombo();
    }
}

// con product
class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public Combo createCombo() {
        return new SummerCombo();
    }
}



package com.zhaoweihao.factory.abstractfactory;


public class Client {
    public static void main(String args[]) {
        SkinFactory factory;
        Button button;
        TextField textField;
        Combo combo;
        factory = (SkinFactory) XMLUtil.getBean();
        button = factory.createButton();
        textField = factory.createTextField();
        combo = factory.createCombo();
        button.display();
        textField.display();
        combo.display();
    }
}

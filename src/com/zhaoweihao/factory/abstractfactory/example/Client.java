package com.zhaoweihao.factory.abstractfactory.example;

public class Client {
    public static void main(String args[]) {
        GameFactory factory;
        OperationController operationController;
        InterfaceController interfaceController;
        factory = (GameFactory) XMLUtil.getBean();
        operationController = factory.createOperCon();
        interfaceController = factory.createInterCon();
        operationController.control();
        interfaceController.control();
    }
}

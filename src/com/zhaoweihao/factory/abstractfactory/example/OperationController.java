package com.zhaoweihao.factory.abstractfactory.example;

interface OperationController {
    public void control();
}

class AndroidOperationController implements OperationController {

    @Override
    public void control() {
        System.out.println("provide android oper control");
    }
}

class IOSOperationController implements OperationController {

    @Override
    public void control() {
        System.out.println("provide IOS oper control");
    }
}

interface InterfaceController {
    public void control();
}

class AndroidInterfaceControl implements InterfaceController{

    @Override
    public void control() {
        System.out.println("provide android interface control");
    }
}

class IOSInterfaceControl implements InterfaceController {

    @Override
    public void control() {
        System.out.println("provide IOS interface control");
    }
}

interface GameFactory {
    public OperationController createOperCon();
    public InterfaceController createInterCon();
}

class AndroidGameFactory implements GameFactory {

    @Override
    public OperationController createOperCon() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterCon() {
        return new AndroidInterfaceControl();
    }
}

class IOSGameFactory implements GameFactory {

    @Override
    public OperationController createOperCon() {
        return new IOSOperationController();
    }

    @Override
    public InterfaceController createInterCon() {
        return new IOSInterfaceControl();
    }
}

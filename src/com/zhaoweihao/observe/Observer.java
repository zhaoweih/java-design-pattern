package com.zhaoweihao.observe;

import java.util.ArrayList;

// abs observe class
interface Observer {
    public void setName(String name);
    public String getName();
    public void help();
    public void beAttacked(AllyControlCenter acc);
}

// con observe class
class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void help() {
        System.out.println("hold on " + name + "is coming");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println("oops! " + name + " being attacked!!!");
        acc.notifyObserver(name);
    }
}

// abs subject class
abstract class AllyControlCenter {
    protected String allyName; // Ally's name
    protected ArrayList<Observer> observers = new ArrayList<Observer>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return allyName;
    }

    // attach method
    public void join(Observer observer) {
        System.out.println(observer.getName() + "has joined !!!");
        observers.add(observer);
    }

    // detach method
    public void quit(Observer observer) {
        System.out.println(observer.getName() + "has quited!!!");
        observers.remove(observer);
    }

    // define abs notidy method
    public abstract void notifyObserver(String name);

}

// con subject class
class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "team has built!!!");
        System.out.println("------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + " informed : " + "Ally " + name + "has been attacked!!!");
        for (Object obs : observers) {
            if (!(((Observer)obs).getName().equalsIgnoreCase(name))) {
                ((Observer)obs).help();
            }
        }
    }
}



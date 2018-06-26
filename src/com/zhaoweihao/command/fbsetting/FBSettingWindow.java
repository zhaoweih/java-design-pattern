package com.zhaoweihao.command.fbsetting;


import java.util.ArrayList;

class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }

    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (Object obj : functionButtons) {
            System.out.println(((FunctionButton)obj).getName());
        }
        System.out.println("--------------------------");
    }
}

class FunctionButton {
    private String name;
    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        System.out.println("点击功能键：");
        command.execute();
    }
}

abstract class Command {
    public abstract void execute();
}

class HelpCommand extends Command {

    private HelpHandler hhObj;

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    @Override
    public void execute() {
        hhObj.display();
    }
}

class MinimizeCommand extends Command {

    private WindowHandler whObj;

    public MinimizeCommand() {
        whObj = new WindowHandler();
    }

    @Override
    public void execute() {
        whObj.minimize();
    }
}

class HelpHandler {
    public void display() {
        System.out.println("显示帮助文档");
    }
}


class WindowHandler {
    public void minimize() {
        System.out.println("缩小窗口");
    }
}


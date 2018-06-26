package com.zhaoweihao.command.fbsetting;

public class Client {
    public static void main(String[] args) {
        FBSettingWindow fbw = new FBSettingWindow("功能键设置");

        FunctionButton fb1, fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        Command command1,command2;
        command1 = (Command) XMLUtil.getBean(0);
        command2 = (Command) XMLUtil.getBean(1);

        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbw.addFunctionButton(fb1);
        fbw.addFunctionButton(fb2);

        fbw.display();

        fb1.onClick();
        fb2.onClick();
    }
}

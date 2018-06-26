package com.zhaoweihao.command.calculator;

public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();

        AddCommand command = new AddCommand();

        form.setCommand(command);

        form.execute(1);
        form.execute(10);
        form.execute(15);

        form.undo();
        form.undo();
    }
}

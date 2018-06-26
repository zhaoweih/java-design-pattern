package com.zhaoweihao.command.calculator;

class Adder {
    private int num = 0;

    public int add(int value) {
        num += value;
        return num;
    }
}

abstract class AbstractCommand {
    public abstract int execute(int value);

    public abstract int undo();
}

class AddCommand extends AbstractCommand {

    private Adder adder = new Adder();

    private int value;

    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}

class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void execute(int value) {
        int i = command.execute(value);
        System.out.println("执行运算，结果为：" + i);
    }

    public void undo() {
        int i = command.undo();
        System.out.println("执行运算，结果为：" + i);
    }
}



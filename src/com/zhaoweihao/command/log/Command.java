package com.zhaoweihao.command.log;

import com.sun.corba.se.impl.io.OutputStreamHook;

import java.io.*;
import java.util.ArrayList;

abstract class Command implements Serializable {
    protected String name;
    protected String args;
    protected ConfigOperator configOperator;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    public abstract void execute(String args);
    public abstract void execute();
}

class InsertCommand extends Command {

    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }

    @Override
    public void execute() {
        configOperator.insert(this.args);
    }
}

class ModifyCommand extends Command {

    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        configOperator.modify(this.args);

    }
}

class DeleteCommand extends  Command {

    public DeleteCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.delete(args);
    }

    @Override
    public void execute() {
        configOperator.delete(this.args);
    }
}

class ConfigOperator implements Serializable {

    public void insert(String args) {
        System.out.println("增加新节点:" + args);
    }

    public void modify(String args) {
        System.out.println("修改节点：" + args);
    }

    public void delete(String args) {
        System.out.println("删除节点：" + args);
    }
}

class ConfigSettingWindow {
    private ArrayList<Command> commands = new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(String args) {
        command.execute(args);
        commands.add(command);
    }

    public void save() {
        FileUtil.writeCommands(commands);
    }

    public void recover() {
        ArrayList list;
        list = FileUtil.readCommands();

        for(Object obj : list) {
            ((Command)obj).execute();
        }
    }
}

class FileUtil {
    public static void writeCommands(ArrayList commands) {
        try {
            FileOutputStream file = new FileOutputStream("config.log");
            ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(file));
            objout.writeObject(commands);
            objout.close();
        } catch (Exception e) {
            System.out.println("命令保存失败");
            e.printStackTrace();

        }
    }

    public static ArrayList readCommands() {
        try {
            FileInputStream file = new FileInputStream("config.log");
            ObjectInputStream objin = new ObjectInputStream(new BufferedInputStream(file));
            ArrayList commands = (ArrayList) objin.readObject();
            objin.close();
            return commands;
        } catch (Exception e) {
            System.out.println("读取命令失败");
            e.printStackTrace();
            return null;
        }
    }
}



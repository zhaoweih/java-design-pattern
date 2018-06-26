package com.zhaoweihao.singleton;

public class TaskManager {

    private static TaskManager tm = null;

    private TaskManager() {

    }

    public void displayProcess() {

    }

    public void displayServices() {

    }

    public static TaskManager getInstance() {
        if (tm == null) {
            return new TaskManager();
        }

        return tm;
    }

}

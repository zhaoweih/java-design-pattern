package com.zhaoweihao.singleton;

public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {

        //第一重判定
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判定
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}

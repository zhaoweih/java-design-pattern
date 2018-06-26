package com.zhaoweihao.factory.method.example;

public class Client {
    public static void main(String args[]) {
        ReaderFactory factory;
        factory = (ReaderFactory) XMLUtil.getBean();
        factory.read();
    }
}

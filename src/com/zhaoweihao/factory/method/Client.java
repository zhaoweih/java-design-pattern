package com.zhaoweihao.factory.method;

public class Client {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger product;

        factory = (LoggerFactory) XMLUtil.getBean();
        product = factory.createLogger();

        product.writeLog();
    }

}

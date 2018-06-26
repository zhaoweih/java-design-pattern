package com.zhaoweihao.factory.method;

interface Logger {
    public void writeLog();
}

class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("生成数据库日志");
    }
}

class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("生成文件日志");
    }
}

interface LoggerFactory {
    public Logger createLogger();
}

class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}

class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}

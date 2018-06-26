package com.zhaoweihao.factory.method.example;


interface Reader {
    public void read();
}

class JPEGReader implements Reader {

    @Override
    public void read() {
        System.out.println("读取JPEG图片");
    }
}

class GIFReader implements Reader {

    @Override
    public void read() {
        System.out.println("读取GIF图片");
    }
}

abstract class ReaderFactory {

    public void read() {
        Reader reader = this.createReader();
        reader.read();
    }

    public abstract Reader createReader();
}

class JPEGReaderFactory extends ReaderFactory {

    @Override
    public Reader createReader() {
        Reader reader = new JPEGReader();
        return reader;
    }
}

class GIFReaderFactory extends ReaderFactory{

    @Override
    public Reader createReader() {
        Reader reader = new GIFReader();
        return reader;
    }
}

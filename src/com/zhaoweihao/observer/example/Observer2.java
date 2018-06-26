package com.zhaoweihao.observer.example;

public class Observer2 implements Observer {

	private Subject subject;

	public Observer2 (Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(String msg) {
		System.out.println("Observer2得到的号码是： " + msg + "我要告诉舍友们");
	}
}
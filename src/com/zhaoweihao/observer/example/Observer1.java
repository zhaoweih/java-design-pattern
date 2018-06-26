package com.zhaoweihao.observer.example;

public class Observer1 implements Observer {

	private Subject subject;

	public Observer1(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(String msg) {
		System.out.println("Observer1得到的号码是: " + msg + " 我要记下来");
	};

}
package com.zhaoweihao.observer.java;

import java.util.Observable;

public class SubjectForSSQ extends Observable {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		setChanged();
		notifyObservers();
	}
}
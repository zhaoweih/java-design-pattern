package com.zhaoweihao.observer.example;

public class Test {
	public static void main(String[] args) {
		ObjectFor3D subjectFor3D = new ObjectFor3D();

	    Observer1 observer1 = new Observer1(subjectFor3D);
	    Observer2 observer2 = new Observer2(subjectFor3D);

	    subjectFor3D.setMsg("20180616期的号码为299");
	    subjectFor3D.setMsg("201806617期的号码为288");

	}
}
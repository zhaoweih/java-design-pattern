package com.zhaoweihao.observer.java;

public class Test {
	public static void main(String[] args) {
		SubjectFor3d subjectFor3d = new SubjectFor3d();
		SubjectForSSQ subjectForSSQ = new SubjectForSSQ();

		Observer1 observer1 = new Observer1();

		observer1.registerSubject(subjectFor3d);
		observer1.registerSubject(subjectForSSQ);

		Observer2 observer2 = new Observer2();
		observer2.registerSubject(subjectFor3d);
		observer2.registerSubject(subjectForSSQ);

		subjectFor3d.setMsg("hello 3'd num is 110");

		observer2.removeSubject(subjectFor3d);

        subjectFor3d.setMsg("hello 3'd num is 111");
		subjectForSSQ.setMsg("ssq'nums : 22 , 33, 44");

	}
}
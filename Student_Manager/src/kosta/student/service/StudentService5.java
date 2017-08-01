package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class StudentService5 implements StudentService {
	// 5. 통계
	//		5.1 성별별 그룹핑
	//		5.2 반별 성적 평균
	//		5.3 주소별 성적 평균
	//		5.4 학년별 키 평균
	@Override
	public void start(Scanner scan) {
		// TODO Auto-generated method stub
		StudentManager sm = new StudentManager();
		
		System.out.println("1. 성별별 그룹핑, 2. 반별 성적 평균, 3. 주소별 성적 평균, 4. 학년별 키 평균");
		switch (scan.nextInt()) {
		case 1:
			sm.service5();
			
			break;

		default:
			break;
		}
		
	}

}

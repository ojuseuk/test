package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class StudentService2 implements StudentService {

	@Override
	public void start(Scanner scan) {
		// TODO Auto-generated method stub
		StudentManager sm = new StudentManager();
		
		System.out.println("학생번호와 점수를 입력하세요");
		int a=sm.service2(scan.nextInt(), scan.nextInt());
		
		if(a==1){
			System.out.println("추가");
		}else{
			System.out.println("실패");
		}
		
	}

}

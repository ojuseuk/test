package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

public class StudentService1 implements StudentService {

	@Override
	public void start(Scanner scan) {
		// TODO Auto-generated method stub
		// 1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학점)
		Student student = new Student();
		StudentManager sm = new StudentManager();
		
		System.out.println("학생정보 입력");
		
		System.out.println("번호를 입력하세요.");
		student.setNum(scan.nextInt());
		System.out.println("이름을 입력하세요.");
		student.setName(scan.next());
		System.out.println("주소를 입력하세요.");
		student.setAddr(scan.next());
		System.out.println("성별를 입력하세요.");
		student.setGender(scan.next());
		System.out.println("반을 입력하세요.");
		student.setBan(scan.next());
		System.out.println("키를 입력하세요.");
		student.setHeight(scan.nextDouble());
		System.out.println("나이를 입력하세요.");
		student.setAge(scan.nextInt());
		System.out.println("학년을 입력하세요.");
		student.setYear(scan.nextInt());
		
		if(sm.service1(student)){
			System.out.println("추가됨");
		}else{
			System.out.println("실패");
		}
		
	}
	
	
	
}

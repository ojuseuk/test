package kosta.student.service;

import java.util.List;
import java.util.Scanner;

import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

public class StudentService4 implements StudentService{
	// 4. 학생 정보 검색
	//		4.1 주소검색
	//		4.2 이름검색
	@Override
	public void start(Scanner scan) {
		// TODO Auto-generated method stub
		StudentManager sm = new StudentManager();
		System.out.println("1번 주소검색, 2번 이름 검색");
		
		switch (scan.nextInt()) {
		case 1:
			List<Student> list1=sm.service4Name(scan.next());
			
			System.out.println(list1.toString());
			
			
			break;
		case 2:
			List<Student> list2=sm.service4Name(scan.next());
			
			System.out.println(list2.toString());
			
			break;
		default:
			break;
		}
	}

}

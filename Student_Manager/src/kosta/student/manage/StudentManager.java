package kosta.student.manage;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import kosta.student.vo.Student;

/**
 * Student 관련 데이터 처리하는 클래스
 * 입 출력 불가능        
 */
public class StudentManager {

	List<Student> list = new LinkedList<>();
	
	public StudentManager() {
		// TODO Auto-generated constructor stub
	}

	public boolean service1(Student s){
		
		return list.add(s);
	}
	
	public void service3(){
		
	}
	
}

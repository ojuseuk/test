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
		list.add(new Student(1, "홍", "서울", "남", "A", 150, 15, 60, 1));
		list.add(new Student(2, "오", "부산", "여", "A", 140, 12, 70, 2));
		list.add(new Student(3, "김", "인천", "남", "B", 50, 6, 120, 2));
		list.add(new Student(4, "이", "인천", "남", "B", 170, 17, 40, 1));
		list.add(new Student(5, "박", "부산", "여", "C", 60, 4, 90, 2));
		list.add(new Student(6, "최", "대전", "남", "A", 180, 20, 100, 3));
	}

	public boolean service1(Student s){
		
		return list.add(s);
	}
	
	public List<Student> service3(){
		
		return list;
		
	}
	
}

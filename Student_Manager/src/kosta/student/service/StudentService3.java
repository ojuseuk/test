package kosta.student.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

public class StudentService3 implements StudentService{

	@Override
	public void start(Scanner scan) {
		// TODO Auto-generated method stub
		
		StudentManager sm = new StudentManager();
		List<Student> list = sm.service3();
		
		System.out.println("1.이름순 출력, 2.성적순 출력");
		switch (scan.nextInt()) {
		case 1:
			
			Collections.sort(list, new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {

					return o1.getName().compareTo(o2.getName());
				}
			});
			
			for (Student student : list) {
				System.out.println(student.toString());
			}
			break;
		case 2:
			
			list.stream()
			.sorted((a, b)->a.getScore()-b.getScore())
			.forEach((t)->System.out.println(t));
			
			break;
		default:
			break;
		}
	}
	
}

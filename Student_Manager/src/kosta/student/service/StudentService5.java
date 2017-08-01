package kosta.student.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

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
			List<Student> list = sm.service5Gender();
			
			for (Student s : list) {
				System.out.println(s.toString());
			}
			
			break;
		case 2:
			Map<String, Integer> map = sm.service5Ban();

			Set<String> keySet = map.keySet();
			for (String s : keySet) {
				int avg = map.get(s);
				System.out.println(s + ":" + avg);
			}
		case 3:
			
			break;
		default:
			break;
		}
		
	}

}

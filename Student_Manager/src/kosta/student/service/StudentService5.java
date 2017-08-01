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
			Map<String, Integer> mapB = sm.service5Ban();

			Set<String> keySet = mapB.keySet();
			for (String s : keySet) {
				int avg = mapB.get(s);
				System.out.println(s + ":" + avg);
			}
			break;
		case 3:
			
			Map<String, Double> mapA = sm.service5Addr();
			Set<String> keySetA = mapA.keySet();
			for (String s : keySetA) {
				Double avg = mapA.get(s);
				System.out.println(s + ":" + avg);
			}
			
			break;
		case 4:
			Map<Integer, Double> mapY = sm.service5Year();
			Set<Integer> keySetY = mapY.keySet();
			for (Integer s : keySetY) {
				Double avg = mapY.get(s);
				System.out.println(s + ":" + avg);
			}
			
			
			break;
		default:
			break;
		}
		
	}

}

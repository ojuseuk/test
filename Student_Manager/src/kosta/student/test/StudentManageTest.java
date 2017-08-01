package kosta.student.test;

import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class StudentManageTest {
	public static void main(String[] args) {
		
		// 1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학년)
		// 2. 성적정보 추가(번호입력-> 성적입력
		// 3. 학생 리스트 출력
		//		3.1 이름순 오름차순 정렬
		//		3.2 성적순 내림차순 정렬
		// 4. 학생 정보 검색
		//		4.1 주소검색
		//		4.2 이름검색
		// 5. 통계
		//		5.1 성별별 그룹핑
		//		5.2 반별 성적 평균
		//		5.3 주소별 성적 평균
		//		5.4 학년별 키 평균
		// 0. 종료
		Scanner scan = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		
		switch (scan.nextInt()) {
		case 1:
			sm.service1(scan);
			
			break;
		case 3:
			
			break;

		default:
			break;
		}
	}
}

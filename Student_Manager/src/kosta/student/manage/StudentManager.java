package kosta.student.manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import kosta.student.vo.Student;

/**
 * Student 관련 데이터 처리하는 클래스
 * 입 출력 불가능        
 */
public class StudentManager {

	private static List<Student> list;
	
	public StudentManager() {
		// TODO Auto-generated constructor stub
		if(list == null){
			list = new LinkedList<>();
			list.add(new Student(1, "홍", "서울", "남", "A", 150, 15, 60, 1));
			list.add(new Student(2, "오", "부산", "여", "A", 140, 12, 70, 2));
			list.add(new Student(3, "김", "인천", "남", "B", 50, 6, 120, 2));
			list.add(new Student(4, "이", "인천", "남", "B", 170, 17, 40, 1));
			list.add(new Student(5, "이", "부산", "여", "C", 60, 4, 90, 2));
			list.add(new Student(6, "최", "대전", "남", "A", 180, 20, 100, 3));
		}

	}

	public boolean service1(Student s){
		
		return list.add(s);
	}
	
	public int service2(int num, int score){
		
		for (Student s : list) {
			if(s.getNum() == num){
				s.setScore(score);
				return 1;
			}
		}
		return 0;
		
	}
	
	public List<Student> service3(){
		
		return list;
		
	}
	
	public List<Student> service4Name(String string){
		
		List<Student> list2 = new LinkedList<>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(string)){
				list2.add(list.get(i));
//				return list.get(i);
			}
			if(list.get(i).getAddr().equals(string)){
				list2.add(list.get(i));
			}
		}
		return list2;
	}

	
	public List<Student> service5Gender(){
		
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getGender().compareTo(o2.getGender());
			}
		});
		
		return list;
		
	}
	
	public Map<String, Integer> service5Ban(){
		
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> cnt = new HashMap<>();	//cnt
		
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()) {
			Student s = (Student) it.next();
			
			if(map.containsKey(s.getBan())){
				map.replace(s.getBan(), map.get(s.getBan()) + (s.getScore()));
				cnt.replace(s.getBan(), cnt.get(s.getBan())+1);
			}else{
				map.put(s.getBan(), (s.getScore()));
				cnt.put(s.getBan(), 1);
			}
			
			if(!it.hasNext()){
				
			}
			
		}
			
		Set<String> keySet = cnt.keySet();
		
		for (String s : keySet) {
			int cnt2 = cnt.get(s);
			map.replace(s, (map.get(s)/cnt2));
		}
		
		
		return map;
	}
	
	public Map<String, Double> service5Addr(){
		
		Map<String, Double> map = list.stream()
		.collect(Collectors.groupingBy(t->t.getAddr(), 
				Collectors.averagingDouble(t->t.getScore())));
		
		
		return map;
	}
	
	public Map<Integer, Double> service5Year(){
		
		Map<Integer, Double> map = list.stream()
		.collect(Collectors.groupingBy(t->t.getYear(), 
				Collectors.averagingDouble(t->t.getHeight())));
		
		
		return map;
	}
}

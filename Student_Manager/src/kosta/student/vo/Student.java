package kosta.student.vo;

public class Student {
	private int num;
	private String name;
	private String addr;
	private String gender;
	private String ban;
	private double height;
	private int age;
	private int score;
	private int year;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int num, String name, String addr, String gender, String ban, double height, int age, int score,
			int year) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.gender = gender;
		this.ban = ban;
		this.height = height;
		this.age = age;
		this.score = score;
		this.year = year;
	}

	public Student(int num, String name, String addr, String gender, String ban, double height, int age, int year) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.gender = gender;
		this.ban = ban;
		this.height = height;
		this.age = age;
		this.year = year;
	}
	
	public Student(int num, int score) {
		super();
		this.num = num;
		this.score = score;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", addr=" + addr + ", gender=" + gender + ", ban=" + ban
				+ ", height=" + height + ", age=" + age + ", score=" + score + ", year=" + year + "]";
	}

	//학점 반환 A/B/C/D/F
	public String getGrade() {
		
		return null;
	}
}

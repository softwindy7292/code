package day_2024_08_01_PM;

import java.util.InputMismatchException;
import java.util.Scanner;

class Person{
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
	}
}

class Student extends Person{
	private String college;
	private String department;
	private int classNum;
	
	public Student(String name, int age, String address, String college, String department, int classNum) {
		super(name, age, address);
		this.college = college;
		this.department = department;
		this.classNum = classNum;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("학교: " + college);
		System.out.println("학과: " + department);
		System.out.println("학번: " + classNum);
	}
	
	public void average() {
		double[] arrGrade = new double[8];
		double sum = 0;
		
		System.out.println("8학기 학점을 순서대로 입력하세요");
		
		for(int i = 0;i < arrGrade.length;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print((i + 1) + "학기 학점 → ");
			
			try {
				arrGrade[i] = sc.nextDouble();
				sum += arrGrade[i];
			} catch (InputMismatchException e) {
//				e.printStackTrace();
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;
			}
		}
			
		System.out.println("8학기 총 평균평점은 " + (sum / 8) + "점 입니다.");
	}
}

public class TryCatchAvr {

	public static void main(String[] args) {
        Student stu = new Student("김다정", 20, "서울시", "동양서울대학교", "전산정보학과", 20132222);
        stu.showInfo();
        stu.average();
	}

}

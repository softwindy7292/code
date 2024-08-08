package day_2024_08_08_PM;

import java.util.HashSet;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name.hashCode());
		System.out.println(name.hashCode());
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(name.equals(((Person)obj).name) && age == ((Person)obj).age) {
			return true;
		}else
			return false;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
}

public class SetQuest {

	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
	}

}

package day_2024_08_08;

import java.util.HashSet;
import java.util.Set;

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
}

public class HashSetMain {

	public static void main(String[] args) {
		Set<Person> personSet = new HashSet<>();
		
		personSet.add(new Person("홍길동", 11));
		personSet.add(new Person("바둑이", 12));
		personSet.add(new Person("홍길동", 51));
		
		System.out.println(personSet.size());
	}

}

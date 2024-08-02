package day_2024_08_02_PM;

class Person{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(this.name == ((Person)obj).name)
			return true;
		else
			return false;
	}
}

public class PersonEquals {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최명태")));
	}

}

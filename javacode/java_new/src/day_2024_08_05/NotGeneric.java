package day_2024_08_05;

class Apple1 {
	public String toString() {
		return "I am an apple";
	}
}

class Orange1 {
	public String toString() {
		return "I am an orange";
	}
}

class Box1 {
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

public class NotGeneric {

	public static void main(String[] args) {
		Box1 aBox = new Box1();
		Box1 oBox = new Box1();
		
		aBox.set(new Apple1());
		oBox.set(new Orange1());
		
		Apple1 ap = (Apple1)aBox.get();
		Orange1 og = (Orange1)oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}

}

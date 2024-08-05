package day_2024_08_05;

class Apple {
	public String toString() {
		return "I am an apple";
	}
}

class Orange {
	public String toString() {
		return "I am an orange";
	}
}

class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class Generic {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<>();
		Box<String> sBox = new Box<>();
		Box<Integer>iBox = new Box<>();
		Box<Double>dBox = new Box<>();
		
		aBox.set(new Apple());
		Apple ap = aBox.get();
		
		System.out.println(ap);	
		
		oBox.set(new Orange());
		Orange og = oBox.get();		
	
		System.out.println(og);
		
		sBox.set("해킹 안됨");
		String str = sBox.get();
		
		System.out.println(str);
		
		iBox.set(100);
		int num = iBox.get();
		
		System.out.println(num);
		
		dBox.set(100.5);
		double num2 = dBox.get();
		
		System.out.println(num2);
	}

}

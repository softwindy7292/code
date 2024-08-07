package day_2024_08_06_PM;

class Box<T> {
	private T obj;

	public void set(T t) {
		obj = t;
	}

	public T get() {
		return obj;
	}
}

public class GenericQuest {

	public static <T> boolean compBox(Box<T> b, T t) {
		if(b.get().equals(t))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(24);

		Box<String> box2 = new Box<>();
		box2.set("Poly");

		if (compBox(box1, 25))
			System.out.println("상자 안에 25 저장");
		if (compBox(box2, "Moly"))
			System.out.println("상자 안에 Moly 저장");

		System.out.println(box1.get());
		System.out.println(box2.get());
	}

}

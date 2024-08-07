package day_2024_08_06;

class Box1<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class BoxFactory {

	public static <T> Box1<T> makeBox(T o) {
		Box1<T> box = new Box1<T>();
		box.set(o);
		return box;
	}

	public static <T> T makeBox1(T o) {
		return o;
	}
}

public class GenericBox {

	public static void main(String[] args) {
		Box1<String> sbox = BoxFactory.<String>makeBox("sweet");
		System.out.println(sbox.get());

		Box1<Integer> ibox = BoxFactory.<Integer>makeBox(1);
		System.out.println(ibox.get());

		Integer i = BoxFactory.<Integer>makeBox1(1);
		System.out.println(i);
		
		Double d = BoxFactory.<Double>makeBox1(2.0);		
		System.out.println(d);
	}

}

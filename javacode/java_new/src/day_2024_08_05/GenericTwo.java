package day_2024_08_05;

class DoubleBox<L, R> {
	private L left;
	private R right;
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	public String toString() {
		return left + " & " + right;
	}
}

public class GenericTwo {

	public static void main(String[] args) {
		DoubleBox<String, Integer> box = new DoubleBox<>();
		
		box.set("사과", 10);
		System.out.println(box);
	}

}

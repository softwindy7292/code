package day_2024_08_06_AM;

class Box<T>{
	private T num;
	
	public void set(T x) {
		num = x;
	}
	
	public T get() {
		return num;
	}
}

class DBox<L, R>{
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	public String toString() {
		return left + "&" + right;
	}
}

public class Generic {

	public static void main(String[] args) {
        Box<Integer> ibox = new Box<>();
        Box<Double> dbox = new Box<>();
        
        dbox.set(2.0);
        double dNum = dbox.get();               
        System.out.println(dNum);

        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box);        
	}

}

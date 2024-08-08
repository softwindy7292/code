package day_2024_08_08_PM;

class DBox<L, R>{
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	public String toString() {
		return left + " & " + right + "개";
	}
}

public class GenericBox {

	public static void main(String[] args) {
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box);        
	}

}

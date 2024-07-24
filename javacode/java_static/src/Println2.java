class Out{
	public Out(){
		System.out.println("Out생성");
	}
	
	public void println() {
		System.out.println("???");
	}
}

class System2{
	static Out out = new Out();
}

public class Println2 {

	public static void main(String[] args) {
		System2.out.println();
		System2.out.println();
		System2.out.println();
	}

}
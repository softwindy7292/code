class Gugudan{
	void printGuGu(int max) {
		for(int i = 1;i <= max;i++) {
			System.out.println(i + "단");
			for(int j = 1;j < 10;j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + " ");			
			}
			System.out.print("\n");
		}
	}
}
public class ClassGugudan {

	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();

		gugudan.printGuGu(10);
		gugudan.printGuGu(20);
	}

}

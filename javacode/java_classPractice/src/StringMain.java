
public class StringMain {
	public static void printString(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String name1 = "김선우"; //String = 참조형
		String name2 = new String("aaaaaaaaaaaa");
		
		printString(name1);
		printString(name2);
	}

}

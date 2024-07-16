
public class WhileForEx {

	public static void main(String[] args) {
		int count = 0;
		
		while(count < 5) {
			System.out.println(count + "번: 안녕");
			count++;
		}
		
		////////////////////////////
		
		count = 0;
		
		do {
			System.out.println(count + "번: 안녕?");
			count++;
		} while(count < 5);
		
		/////////////////////////////
		
		for(count = 0;count < 5;count++) {
			System.out.println(count + "번: 안녕?!");
		}
	}
	
}

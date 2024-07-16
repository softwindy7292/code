
public class WhileForQ {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1;i <= 100;i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 " + sum);
		
		/////////////////////////////////////////////////////////
		
		for(int dan = 1;dan < 10;dan++) {
			System.out.println(dan + "단");
			for(int num = 1;num < 10;num++) {
				System.out.print(dan + "*" + num + "=" + (dan*num) + " ");			
			}
			System.out.print("\n");
		}
		
		/////////////////////////////////////////////////////////
		
		for(int i = 1;i < 51;i++) {
			System.out.print(2*i - 1 + " ");
			if(i % 10 == 0) {
				System.out.print("\n");
			}
		}
		
		/////////////////////////////////////////////////////////
		
		for(int i = 1;i < 51;i++) {
			System.out.print(102 - i * 2 + " ");
			if(i % 10 == 0) {
				System.out.print("\n");
			}
		}
		
		/////////////////////////////////////////////////////////
		
		sum = 0;
		
		for(int i = 0;i <= 100;i++) {
			if(i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		/////////////////////////////////////////////////////////
		
		int i = 0;
		sum = 0;
		while(i < 100) {
			if(i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
	
}

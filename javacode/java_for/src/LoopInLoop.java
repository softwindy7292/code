
public class LoopInLoop {

	public static void main(String[] args) {
		for(int i = 1;i < 10;i++) {
			System.out.println(i + "단");
			for(int j = 1;j < 10;j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + " ");			
			}
			System.out.print("\n");
		}
		
		/////////////////////////////////////////
		
		for(int i = 1;i < 10;i++) {
			if(i % 2 != 0)
				continue;
			System.out.println(i + "단");
			for(int j = 1;j < 10;j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + " ");			
			}
			System.out.print("\n");
		}
		
		////////////////////////////////////////
		
		for(int i = 1;i < 10;i++) {
			System.out.println(i + "단");
			for(int j = 1;j < 10;j++) {
				if(i*j % 2 == 0)
					continue;
				System.out.print(i + "*" + j + "=" + (i*j) + " ");			
			}
			System.out.print("\n");
		}
	}

}

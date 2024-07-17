
public class Test_0717 {

	public static void main(String[] args) {
		int dan = 3;
		
		System.out.println(dan + "단");
		for(int i = 1;i < 10;i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
		/////////////////////////////////////////
		
		int sum = 0;
		
		for(int i = 1;i <= 100;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		////////////////////////////////////////
		
		int i = 1;
		sum = 0;
		
		while(i <= 100) {
			if(i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		///////////////////////////////////////
		
		int kor = 90, math = 80, eng = 70;
		int max = kor;
		
		max = (math > kor && math > eng)? math:max;
		max = (eng > kor && eng > math)? eng:max;
		
		System.out.println(max);
	}

}

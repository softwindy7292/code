class Sum{
	int sum = 0;
	
	int sumNum(int num) {
		for(int i = 1;i <= num;i++) {
			sum += i;
		}
		
		return sum;
	}
}
public class MakeSum {

	public static void main(String[] args) {
		Sum sum = new Sum();
		
		System.out.println(sum.sumNum(10));
	}

}

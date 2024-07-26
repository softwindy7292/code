package day_2024_07_26;

public class ArrayRotto {

	public static void main(String[] args) {
		int[] lottoNum = new int[6];
		
		for(int i = 0;i < lottoNum.length;i++) {
			lottoNum[i] = (int) (Math.random()*45+1);
			for(int j = 0;j < i;j++) {
				while(lottoNum[i] == lottoNum[j]) {
					System.out.println("중복번호!! " + (j + 1) + "번째 번호와 동일한 숫자인 " + lottoNum[i] + "가 나왔습니다. ");
					lottoNum[i] = (int) (Math.random()*45+1);
				}
			}
			System.out.print(lottoNum[i] + " ");
		}
	}

}
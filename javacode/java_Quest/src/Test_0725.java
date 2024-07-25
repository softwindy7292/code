class InstCnt{
	static int num = 0;
	
	InstCnt(){
		num++;
		System.out.println("인스턴스 생성: " + num);
	}
}

class System2{
	static Out out = new Out();
}

class Out{
	public Out(){
		System.out.println("Out 생성");
	}
	public void println(){
		System.out.println("메롱");
	}
}
public class Test_0725 {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
		System.out.println("===============================");
		
		System2.out.println();
		System2.out.println();
		System2.out.println();
	}

}
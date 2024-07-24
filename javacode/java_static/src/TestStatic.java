class InstCnt{
	public static int instNum = 0;
	int a = 0;
	
	public InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
	
	public static void A() {
		System.out.println("스태틱 메소드를 객체없이 소환!");
//		System.out.println(a);
	}
}

public class TestStatic {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		cnt1.instNum++;
		InstCnt.instNum++;
		InstCnt cnt2 = new InstCnt();
		
//		i = 1;
//		int i;
		
		InstCnt.A();
	}

}

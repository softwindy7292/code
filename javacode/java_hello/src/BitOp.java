
public class BitOp {

	public static void main(String[] args) {
		byte n1 = 5;  //00000101
		byte n2 = 3;  //00000011
		byte n3 = -1; //11111111
		
		byte r1 = (byte)(n1 & n2);  // AND
		byte r2 = (byte)(n1 | n2);	// OR
		byte r3 = (byte)(n1 ^ n2);	// XOR
		byte r4 = (byte)(~n3);		// 반전
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}

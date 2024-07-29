package day_2024_07_29;

class Box {
	private int boxNum;
	private String boxStr;

	public Box(int num, String str) {
		boxNum = num;
		boxStr = str;
	}
	
	public String toString() {
		return boxStr;
	}

	public int getBoxNum() {
		return boxNum;
	}
}

public class ArrayMakeBox {

	public static void main(String[] args) {
		Box[] ar = new Box[5];
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, "Fairy-tale book");
		
		for(Box e: ar) {
			if(e.getBoxNum() == 505)
				System.out.println(e);
		}
	}

}

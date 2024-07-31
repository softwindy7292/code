package day_2024_07_31;

class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}

public class Instanceof {

	public static void wrapBox(Box box) {
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox) box).goldWrap();
		} else if (box instanceof PaperBox) {
			((PaperBox) box).paperWrap();
		} else {
			box.simpleWrap();
		}
	}
	
	public static void wrapBox2(Box box) {
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox) box).goldWrap();
		}
		
		if (box instanceof PaperBox) {
			((PaperBox) box).paperWrap();
		}
		
		if (box instanceof Box){
			box.simpleWrap();
		}
	}

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new PaperBox();
		Box box3 = new GoldPaperBox();
		
		PaperBox box4 = new PaperBox();
		PaperBox box5 = new GoldPaperBox();
		
		GoldPaperBox box6 = new GoldPaperBox();
		
//		wrapBox(box1);
//		wrapBox(box2);
//		wrapBox(box3);

//		wrapBox2(box1);
		
//		wrapBox2(box2);
		
//		wrapBox2(box3);
		
//		wrapBox2(box4);
		
//		wrapBox2(box5);
		
//		wrapBox2(box6);
	}

}

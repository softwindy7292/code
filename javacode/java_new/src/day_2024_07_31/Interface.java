package day_2024_07_31;

interface Printable {
	public void print(String doc);
}

//삼성전자 개발자
class SprinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

//LG전자 개발자
class LprinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

public class Interface {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";

		Printable prn = new SprinterDriver();
		prn.print(myDoc);

		prn = new LprinterDriver();
		prn.print(myDoc);

	}
}
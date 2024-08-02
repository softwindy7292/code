package day_2024_08_01_AM;

interface Printable {
    public void print(String doc);
}

class SPrinterDriver implements Printable{
	public void print(String doc) {
		System.out.println(doc + "삼성");
	}
}

class LPrinterDriver implements Printable{
	public void print(String doc) {
		System.out.println(doc + "LG");
	}
}

public class InterfacePrint {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// LG 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}

}

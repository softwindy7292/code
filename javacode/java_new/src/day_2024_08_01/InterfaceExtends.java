package day_2024_08_01;

interface Printable {
    public void print(String doc);
}

interface ColorPrintable extends Printable{
	public void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable{
	
    public void print(String doc) {
    	System.out.println("흑백" + doc);
    }
    
	public void printCMYK(String doc) {
		System.out.println("컬러" + doc);
	}
}

public class InterfaceExtends {

	public static void main(String[] args) {
        ColorPrintable colorPrn = new Prn909Drv();
        colorPrn.print("???");
        colorPrn.printCMYK("???");
	}

}

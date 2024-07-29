package day_2024_07_29;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	protected int getColor() {
		return color;
	}
	
	public void printProperty() {
		System.out.println(getSize() + " 인치 " + color + " 컬러");
	}
}

class IPTV extends ColorTV{
	private String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	protected String getIp() {
		return ip;
	}
	
	public void printProperty() {
		System.out.println(getIp() + " 주소에 " + getSize() + " 인치 " + getColor() + " 컬러");
	}
}

public class ExtendsTV {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		iptv.printProperty();
	}

}

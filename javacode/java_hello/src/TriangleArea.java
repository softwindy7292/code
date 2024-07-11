
public class TriangleArea {

	public static void main(String[] args) {
		double width = 100, height = 85;
		double Area = width * height / 2;
		
		System.out.print("가로: " + width);
		System.out.print("  높이: " + height);
		System.out.println("  넓이: " + Area);
		System.out.println("20보다 크나요?\n"+ (20 < Area));
	}
}

import violation.Rectangle;
import violation.Square;

public class MainForViolation {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());

		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		useRectangle(square);
	}

	public static void useRectangle(Rectangle rectangle) {
		rectangle.setWidth(30);
		rectangle.setHeight(20);
		
		assert rectangle.getHeight() == 20 : "Height not equal to 20";
		assert rectangle.getWidth() == 30 : "Width not equal to 30";
		
		
	}
}

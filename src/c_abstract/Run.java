package c_abstract;

public class Run {
	
	public static void main(String[] args) {
		Figure[] figures = new Figure[] {new Rectangle(5, 5), new Circle(5)};
		for (Figure figure : figures) {
			System.out.println(figure.calArea());
		}
	}
}

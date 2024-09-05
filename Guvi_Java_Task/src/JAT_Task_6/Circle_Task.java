package JAT_Task_6;

public class Circle_Task {

	private double radius;

	public Circle_Task() {
		radius = 1.0;
	}

	public Circle_Task(double radius) {
		this.radius = radius;
	}

	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {

		Circle_Task circle1 = new Circle_Task();
		System.out.println("Circumference of circle1: " + circle1.calculateCircumference());

		Circle_Task circle2 = new Circle_Task(8.0);
		System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
	}
}

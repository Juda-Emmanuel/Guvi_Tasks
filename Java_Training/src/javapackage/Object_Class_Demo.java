package javapackage;

public class Object_Class_Demo {

	int b = 200; // Global Variable

	static int c = 300; // Static Variable

	public static void main(String[] args) {

		int a = 100; // Local Variable

		System.out.println(" Local Variable Output is " + a);

		Object_Class_Demo obj = new Object_Class_Demo();

		System.out.println(" Global Variable Output is " + obj.b); // Global variable needs to be called with an object.

		System.out.println(" Local Variable Output is " + c);

	}
}

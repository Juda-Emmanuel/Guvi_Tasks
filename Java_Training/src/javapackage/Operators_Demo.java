package javapackage;

public class Operators_Demo {

	public static void main(String[] args) {
		
		// Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical Operators
        System.out.println("true && false: " + (true && false));
        System.out.println("true || false: " + (true || false));
        System.out.println("!true: " + (!true));

        // Bitwise Operators
        System.out.println("5 & 3: " + (5 & 3));
        System.out.println("5 | 3: " + (5 | 3));
        System.out.println("5 ^ 3: " + (5 ^ 3));
        System.out.println("~5: " + (~5));
        System.out.println("5 << 1: " + (5 << 1));
        System.out.println("5 >> 1: " + (5 >> 1));
        System.out.println("-5 >>> 1: " + (-5 >>> 1));

        // Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        
        System.out.println(c);
        
	}
}

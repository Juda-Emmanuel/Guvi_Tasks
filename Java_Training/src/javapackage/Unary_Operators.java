package javapackage;

public class Unary_Operators {

	public static void main(String[] args) {
		
		int a =6;
		int b = 7;
		
        // Unary Plus
        b = +a; // b is 5
        System.out.println("Unary Plus: " + b);
        
        // Unary Minus
        b = -a; // b is -5
        System.out.println("Unary Minus: " + b);
        
        // Increment
        b = ++a; // a is 6, b is 6 (pre-increment)
        System.out.println("Pre-Increment: a = " + a + ", b = " + b);
         
        b = a++; // a is 7, b is 6 (post-increment)
        System.out.println("Post-Increment: a = " + a + ", b = " + b);
        
        // Decrement
        b = --a; // a is 6, b is 6 (pre-decrement)
        System.out.println("Pre-Decrement: a = " + a + ", b = " + b);
        
        b = a--; // a is 5, b is 6 (post-decrement)
        System.out.println("Post-Decrement: a = " + a + ", b = " + b);
	}
}

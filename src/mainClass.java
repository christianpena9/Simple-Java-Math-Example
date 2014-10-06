/**
 * @author cpena
 * @version 10/6/2014
 * @detail This project deals with classes and methods.
 * */

/*
 * The mainClass is used to just call all of the other methods that is
 * found in the class algorithmClass. The way that this is possible
 * is because mainClass extends algorithmClass which means that mainClass
 * knows all of the methods that is contained in algorithmClass.
 * */
public class mainClass extends algorithmClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Printing the first method from the class algorithmClass.java - Addition*/
		System.out.println("Your addition answer is: " + addition(5,5));
		
		/*Printing the second method from the class algorithmClass.java - Subtraction*/
		System.out.println("Your subtraction answer is: " + subtraction(5,5));
		
		/*Printing the third method from the class algorithmClass.java - Multiplication*/
		System.out.println("Your multiplication answer is: " + multiplication(5,5));
		
		/*Printing the forth method from the class algorithmClass.java - Division*/
		System.out.println("Your division answer is: " + division(5,5));
	}

}

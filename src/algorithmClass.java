/**
 * @author cpena
 * @version 10/6/2014
 * @detail simple class that holds a few methods for doing some math
 * */
public class algorithmClass {
	
	/*
	 * This method does only addition
	 * */
	public static int addition(int x, int y) {
		return x+y;
	}
	
	/*
	 * This method does only subtraction
	 * */
	public static int subtraction(int x, int y) {
		return x-y;
	}
	
	/*
	 * This method does only multiplication
	 * */
	public static int multiplication(int x, int y) {
		return x*y;
	}
	
	/*
	 * This method does only division
	 * Decided to use float because I don't really
	 * need precision answers. Double would take
	 * up more bites on running the program.
	 * */
	public static float division(float x, float y) {
		return x/y;
	}
	
}

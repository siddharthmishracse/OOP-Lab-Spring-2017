/**
 * In the program fields.java, trying to leave the fields
 * fields uninitialized and print out their values.Try the same with a
 * local variable and see what kind of compiler errors you can produce.
 * Becoming familiar with common compiler errors will make it easier to
 * recognize bugs in your code.
 */
 
 
 public class fields {
 	public static void main(String[] args) {
		
		//Declaring & Initializing Variables
		
		int integer ;
		float floating = 5.0f;
		double floatingDouble = 5.0;
		String stringType = "This is a string type";
		byte byteType = 1;
		short shortType = 2;
		char character = 'A';
		boolean b = true;
		
		//For a local variable
		
		if(integer > 0)
		{
			int newVar ;
			System.out.println(newVar);
		}
		
		System.out.println("Interger:" + integer + "\nFloating(float):"
			+ floating + "\nfloating(double): " + floatingDouble 
			+ "\nString:" + stringType + "\nByte:" + byteType 
			+ "\nShort:" + shortType + "\nCharacter:" + character 
			+ "\nBoolean:" + b);
			
		}
	}
	
	
/**
 * # Bugs Found
 * ## On not initializing any type fileds : 
 * fields.java:25: error: variable *DATA_TYPE might not have been initialized
 * ## On not initializing a local variable
 * fields.java:29: error: variable *VAR_NAME not have been initialized
 */


package n2exercici1;

import java.util.*;
public class Input {

	static Scanner input = new Scanner(System.in);
	
	//READ BYTE
	public static byte readByte(String message) {
		
		boolean correct = false;
		byte finalByte = 0;
		
		//It will keep asking for a byte until the type of data is correctly typed.
		do {
			try {
				
			System.out.println(message);
			finalByte = input.nextByte();
			correct = true;
			
			}catch(InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto.");
				input.nextLine(); //We clean the buffer so we can introduce the data again.
			}
		}while(!correct);
			
		return finalByte;
	}
	
	//READ INT
	public static int readInt(String message) {
		
		boolean correct = false;
		int finalInt = 0;
		
		//It will keep asking for an integer until the type of data is correctly typed.
		do {
			try {
				
			System.out.println(message);
			finalInt = input.nextInt();
			correct = true;
			
			}catch(InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto.");
				input.nextLine(); //We clean the buffer so we can introduce the data again.
			}
		}while(!correct);
			
		return finalInt;
	}
	
	//READ FLOAT
	public static float readFloat(String message) {
		
		boolean correct = false;
		float finalFloat = 0;
		
		//It will keep asking for a float until the type of data is correctly typed.
		do {
			try {
				
			System.out.println(message);
			finalFloat = input.nextFloat();
			correct = true;
			
			}catch(InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto.");
				input.nextLine(); //We clean the buffer so we can introduce the data again.
			}
		}while(!correct);
			
		return finalFloat;
	}
	
	//READ DOUBLE
		public static double readDouble(String message) {
			
			boolean correct = false;
			double finalDouble = 0;
			
			//It will keep asking for a double until the type of data is correctly typed.
			do {
				try {
					
				System.out.println(message);
				finalDouble = input.nextDouble();
				correct = true;
				
				}catch(InputMismatchException e) {
					System.out.println("El tipo de dato introducido no es correcto.");
					input.nextLine(); //We clean the buffer so we can introduce the data again.
				}
			}while(!correct);
				
			return finalDouble;
		}
	
		
	
}

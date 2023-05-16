package n2exercici1;

public class App {

	public static void main(String[] args) {
		/*
		//Input.readByte test
		System.out.println("Tiene usted..."+Input.readByte("Introduzca su edad.")+" años");
		
		//Input.readInt test
		int num1 = Input.readInt("Introduzca el primer número");
		int num2 = Input.readInt("Introduzca el segundo número");
		
		System.out.println("La suma de ambos números es "+(num1+num2)+".");
		
		//Input.readFloat test
		float base = Input.readFloat("Introduzca la base del rectángulo.");
		float height = Input.readFloat("Introduzca la altura del rectángulo.");
		
		System.out.println("El áera del rectángulo es "+base*height+".");
		
		//Input.readDouble test
		double price = Input.readDouble("Introduzca el precio del kg de naranjas.");
		double ammount = Input.readDouble("Introduzca la cantidad de kg de naranjas.");
		
		System.out.println("La cantidad a pagar será de "+price*ammount+"€.");
		
		//Input.readChar test
		System.out.println("La primera letra de su nombre es... "+Input.readChar("Introduzca su nombre"));
		*/
		//Input.readString test
		String dni = Input.readString("Introduzca su DNI: ");
		System.out.println("Su DNI es: "+dni);
		
		//Input.YesOrNo test
		Input.readYesOrNo("¿Te gusta programar? Y/N");
		
	}

}

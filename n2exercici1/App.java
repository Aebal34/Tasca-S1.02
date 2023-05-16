package n2exercici1;

public class App {

	public static void main(String[] args) {
		
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
		
	}

}

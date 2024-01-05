package entornos;
import java.util.Scanner;

public class Ejercicio1 {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Introduce el lado del triangulo: ");
		int lado1 = sc.nextInt();
		System.out.println("Introduce el segundo lado");
		int lado2 = sc.nextInt();
	
		double area = calcularArea(lado1, lado2);
		verResultado(area);
	}
	
	public static double calcularArea(int lado1, int lado2) {
		
		return 0.5 * lado1 * lado2;
	}
	
	public static void verResultado(double area) {
		System.out.println("El área del triangulo es: " + area);
	}

}

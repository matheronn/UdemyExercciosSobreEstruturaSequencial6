import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double triangulo = (a * c) / 2.0;
		double circulo = (c * c) * 3.14159;
		double trapezio = (a + b) / 2.0 * c;
		double quadrado = b * b;
		double retangulo = a * b;
		
		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.printf("circulo: %.3f%n", circulo);
		System.out.printf("trapezio: %.3f%n", trapezio);
		System.out.printf("quadrado: %.3f%n", quadrado);
		System.out.printf("retangulo: %.3f%n", retangulo);
		
		sc.close();
	}
}

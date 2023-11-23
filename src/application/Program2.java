package application; 

import java.util.Locale;
import java.util.Scanner;

import util.Calculator; 

public class Program2 {
	
	/*
	 * Os métodos da classe Calculator2 ao serem chamados, não precisarão de um objeto
	 * instanciado, basta o nome da classe.nome_do_método ou classe.variável.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); Scanner 
		
		sc = new Scanner(System.in);
		
		System.out.print("Enter radius: "); 
		
		Calculator calc = new Calculator(); 
		
		double radius = sc.nextDouble();
		double c = calc.circumference(radius); 
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c); 
		System.out.printf("Volume da esfera: %.2f%n", v); 
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close(); 
		}
}
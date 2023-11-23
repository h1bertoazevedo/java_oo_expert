package application; 

import java.util.Locale;
import java.util.Scanner;

import util.Calculator2; 

/*
 * Os métodos da classe Calculator2 ao serem chamados, não precisarão de um objeto
 * instanciado, basta o nome da classe.nome_do_método ou classe.variável.
 */

public class Program3 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); Scanner 
		
		sc = new Scanner(System.in);
		
		System.out.print("Enter radius: "); 
		
		//Calculator calc = new Calculator(); //Desnecessário porque os métodos dessa classe são estáticos
		
		double radius = sc.nextDouble();
		double c = Calculator2.circumference(radius); 
		double v = Calculator2.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c); 
		System.out.printf("Volume da esfera: %.2f%n", v); 
		System.out.printf("PI value: %.2f%n", Calculator2.PI);
		
		sc.close(); 
		}
}
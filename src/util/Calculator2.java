package util;

public class Calculator2 {
	
	/*
	 * Uma vez que tanto a variável PI quanto o os métodos circumference e volume
	 * não se alteram em função da instãncia (sempre terão o mesmo valor se tiverem
	 * o mesmo raio) eles podem ser declarados como estáticos. Neste caso, no
	 * program principal, ao serem chamados, não precisarão de um objeto
	 * instanciado, basta o nome da classe.nome_do_método ou classe.variável.
	 */
	
	public static double PI = 3.14159; //os nomes de constantes precisam estar tudo em maíusculos
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return (4.0 * PI * Math.pow(radius,3))/ 3.0;
	} 
}
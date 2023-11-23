package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramaCurrencyConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); Scanner 
		
		sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar? R$ ");
		CurrencyConverter.dollarHoje = sc.nextDouble();
		System.out.print("Qual o valor do IOF? (%) ");
		CurrencyConverter.iof = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		double qtdDollars = sc.nextDouble();
		System.out.printf("Valor a ser pago em reais R$ %.2f%n", CurrencyConverter.compra(qtdDollars));
		
		sc.close();

	}

}

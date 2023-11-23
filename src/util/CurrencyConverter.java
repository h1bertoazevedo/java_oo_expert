package util;

public class CurrencyConverter {
	
	public static double dollarHoje;
	public static double iof;

	public static double compra(double qtdDollar) {
		
		return (dollarHoje * qtdDollar)+((dollarHoje * qtdDollar)*iof/100);
	} 

}

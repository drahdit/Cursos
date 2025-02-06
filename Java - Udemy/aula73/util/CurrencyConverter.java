package aula73.util;

public class CurrencyConverter {
	public static double dolar;
	public static double bought;
	
	public static double reais() {
		double iof = (dolar * bought) * 0.06;
		return dolar * bought + iof;
	}
}

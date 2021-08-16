package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// Formula (F - 32) x 5/9 = C
		double temperaturaFahrenheit = 10;
		final int ajuste = 32;
		double fatorMultiplicativo = 5.0/9.0;
		final double temperaturaCelsius = (temperaturaFahrenheit - ajuste) * fatorMultiplicativo;
		System.out.println(temperaturaCelsius);
	}
}

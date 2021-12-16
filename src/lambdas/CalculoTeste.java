package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		Calculo calc = (x,y) -> {
			return x + y;
		};
		
		calc.executar(1, 2);
		
		calc = (x,y) -> x * y;

	}

}

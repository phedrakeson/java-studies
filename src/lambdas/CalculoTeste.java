package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste {

	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x,y) -> {
			return x + y;
		};
		
		calc.apply(1.0, 2.0);
		
		calc = (x,y) -> x * y;
		
	}

}

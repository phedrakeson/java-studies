package controle;

public class For {

	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 20; contador+= 2) {
			System.out.printf("i = %d\n", contador);
		}
		
		int x = 0;
		for(; x < 10; x++) {
			System.out.println("x = " + x);
		}
		
//		for(;;) {
//			System.out.println("laço infinito");
//		}
		
		for(int i = 10; i >= 0; i -= 2) {
			System.out.println(i);
		}
	}

}

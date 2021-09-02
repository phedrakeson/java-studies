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
		
		for(int y = 0; x < 10; x++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", y, j);
			}
		}
	}

}

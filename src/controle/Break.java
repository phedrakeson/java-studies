package controle;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i == 5) 
				break;
			
			System.out.println(i);
		}
		
		externo: for (int i = 0; i < 3; i++) {
			interno: for (int j = 0; j < 3; j++) {
				if(i == 1) break externo;

				System.out.printf("%d %d", i, j);
			}
			System.out.println();
		}
		
		System.out.println("Fim");

	}

}

package controle;

public class SwitchSemBrake {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) 
		{
			case "preta":
				System.out.println("Sei o Bassai-Dai...");
			case "marrom":
				System.out.println("Sei o Tekki Shodan...");
			case "roxa":
				System.out.println("Sei o Heian Godan...");
			case "verde":
				System.out.println("Sei o Heian Yodan...");
			case "laranja":
				System.out.println("Sei o Heian Sandan...");
			default:
				System.out.println("N�o sei de nada...");
		}
		)
	}

}

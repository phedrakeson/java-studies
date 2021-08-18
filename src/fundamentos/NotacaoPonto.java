package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!!");
		
		System.out.println(s);
		
		String y = "Boa noite X";
		System.out.println(y
				.replace("X", "Pulga")
				.concat("!!!!!!")
				.toLowerCase()
				);
	}

}

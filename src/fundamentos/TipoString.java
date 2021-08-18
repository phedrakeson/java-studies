package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		String s = "Boa Tarde";
		s = s.toUpperCase();
		s = "Bom dia";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		var nome = "Pedro";
		var idade = 23;
		var sobrenome = "Souza";
		var salario = 123455.33;
		
		System.out.println("Nome: " + nome + "\nIdade:" + idade);
		System.out.printf("Sobrenome: %s Salario: %s", sobrenome, salario);
		System.out.printf("O senhor %s %s tem %d anos. E ganha R$%.2f"
				, nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos. E ganha R$%.2f"
				, nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}

}

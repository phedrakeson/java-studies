package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56783;
		long pontosAcumulados = 3_234_845_223L;
		
		// tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_763_134.01;
		
		// tipo booleano
		boolean estaDeFerias = false;
		estaDeFerias = true;
		
		// tipo caractere
		char status = 'A'; // ativo
		char interrogacao = '?';
		char unicode = '\u0010';
		
		// dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// numero de viagens
		System.out.println(numerosDeVoos / 2);
		
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha > " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}

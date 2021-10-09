package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		Carro c1 = new Carro();
		
		System.out.println(c1.estaLigado());
		c.girarChave();
		System.out.println(c.estaLigado());
		c.acelerar();
		c.frear();
		c.frear();
		System.out.println(c.motor.giros());
		
	}

}

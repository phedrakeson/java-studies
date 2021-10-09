package oo.composicao;

public class Carro {
	
	Motor motor = new Motor();
	
	void acelerar() {
		if(motor.fatorInjecao < 0.5) {
			motor.fatorInjecao += 0.4;
		}	
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void girarChave() {
		motor.ligado = !motor.ligado;
		if(motor.ligado) {
			System.out.println("Carro ligado!");
		} else {
			System.out.println("Carro desligado!");
		}
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}

}

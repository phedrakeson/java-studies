package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Classe {
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Classe(String nome) {
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}

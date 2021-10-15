package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String nome;
	final List<Classe> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	Classe obterCursoPorNome(String nome) {
		
		for(Classe curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome))
				return curso;
		}
		
		return null;
	}
	
	void adicionarCurso(Classe curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}

package br.com.alura.ed.vetor;

import java.util.Arrays;

public class Vetor {
	Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	public void garanteEspaco() {
		if (this.alunos.length == this.totalDeAlunos) {
			Aluno[] novaLista = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++)
				novaLista[i] = alunos[i];
			alunos = novaLista;
		}
	}

	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	public boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeAlunos;
	}

	public void adiciona(Aluno aluno) {
		garanteEspaco();
		alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}

	public void adiciona(int posicao, Aluno aluno) {
		if (!posicaoValida(posicao))
			throw new IllegalArgumentException("Você está tentando inserir numa posição inválida.");
		garanteEspaco();
		for (int i = totalDeAlunos - 1; i >= posicao; i--)
			alunos[i + 1] = alunos[i];
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Você está tentando pegar uma posição que não está ocupada.");
		return alunos[posicao];
	}

	public void remove(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Você está tentando remover uma posição que não está ocupada.");
		for (int i = posicao; i < totalDeAlunos; i++)
			alunos[i] = alunos[i + 1];
		totalDeAlunos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalDeAlunos; i++)
			if (alunos[i].equals(aluno))
				return true;
		return false;
	}

	public int tamanho() {
		return this.totalDeAlunos;
	}

	public String toString() {
		return Arrays.toString(this.alunos);
	}
}

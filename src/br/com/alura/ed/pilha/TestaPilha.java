package br.com.alura.ed.pilha;

public class TestaPilha {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.empilha("Mauricio");
		pilha.empilha("Marcelo");
		pilha.desempilha();
		pilha.empilha("Guilherme");
		pilha.empilha("Paulo");
		pilha.desempilha();
		pilha.empilha("João");

		System.out.println(pilha);
	}
}

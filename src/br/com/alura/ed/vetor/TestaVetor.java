package br.com.alura.ed.vetor;

public class TestaVetor {
	public static void main(String[] args) {
		Vetor lista = new Vetor();
		
		Aluno a1 = new Aluno("Thiago");
		Aluno a2 = new Aluno("Joao");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("Robson");
		Aluno aluno = new Aluno("Jose");
		
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(0, a4);
		
		System.out.println(lista);
		
//		lista.remove(2);
		
//		System.out.println(lista);
		
//		lista.remove(0);

//		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		System.out.println(lista.contem(aluno));
		System.out.println(lista.contem(a4));
	}
}

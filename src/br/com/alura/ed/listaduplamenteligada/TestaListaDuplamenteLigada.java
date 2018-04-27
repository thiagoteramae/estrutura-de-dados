package br.com.alura.ed.listaduplamenteligada;

public class TestaListaDuplamenteLigada {
	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		
		lista.adicionaNoComeco("Thiago");
		System.out.println(lista);
		lista.adicionaNoComeco("Joao");
		System.out.println(lista);
		lista.adicionaNoComeco("Mario");
		System.out.println(lista);
		
		lista.adiciona("Flavio");
		System.out.println(lista);
		
		lista.adiciona(1, "Ronaldo");
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
		lista.remove(3);
		System.out.println(lista);
		
		System.out.println(lista.contem("Rafa"));
		
		System.out.println(lista.contem("Mario"));
	}
}

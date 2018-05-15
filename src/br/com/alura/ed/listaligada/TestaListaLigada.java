package br.com.alura.ed.listaligada;

public class TestaListaLigada {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		lista.adicionaNoComeco("Thiago");
		System.out.println(lista);
		
		lista.adiciona("Maria");
		System.out.println(lista);
		
		lista.adiciona("Reinaldo");
		System.out.println(lista);
		
		lista.adiciona(1, "Joaquim");
		System.out.println(lista);
		
		lista.removeDoFim();
		System.out.println(lista);
		
		lista.remove(2);
		System.out.println(lista);
		
		
		System.out.println(lista.pegaCelula(1).getElemento());
		System.out.println(lista.pegaCelula(1).getProxima().getElemento());
	}
}

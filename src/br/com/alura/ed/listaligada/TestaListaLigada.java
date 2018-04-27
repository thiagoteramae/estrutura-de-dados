package br.com.alura.ed.listaligada;

public class TestaListaLigada {
	public static void main(String[] args) {
		ListaLigada listaLigada = new ListaLigada();

		listaLigada.adicionaNoComeco("Thiago");
		System.out.println(listaLigada);
		listaLigada.adicionaNoComeco("Joao");
		System.out.println(listaLigada);
		listaLigada.adicionaNoComeco("Mario");
		System.out.println(listaLigada);

		listaLigada.adiciona("Flavio");
		System.out.println(listaLigada);

		listaLigada.adiciona(1, "Ronaldo");
		System.out.println(listaLigada);
		
		listaLigada.removeDoComeco();
		System.out.println(listaLigada);
		listaLigada.removeDoComeco();
		System.out.println(listaLigada);
		listaLigada.removeDoComeco();
		System.out.println(listaLigada);
		listaLigada.removeDoComeco();
		System.out.println(listaLigada);
		listaLigada.removeDoComeco();
		System.out.println(listaLigada);
	}
}

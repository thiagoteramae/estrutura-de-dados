package br.com.alura.ed.listaduplamenteligada;

public class TestaListaDuplamenteLigada {
	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		
		lista.adiciona("Thiago");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Joao");
		System.out.println(lista);
		
		System.out.println("Proximo do ultimo:" + lista.pegaCelula(lista.tamanho() - 1).getProxima().getElemento());
		System.out.println("Anterior do primeiro:" + lista.pegaCelula(0).getAnterior().getElemento());
		
		lista.adiciona(1, "Rafa");
		System.out.println(lista);
		
		lista.adiciona("Joaquim");
		System.out.println(lista);
		
		System.out.println("Proximo do ultimo:" + lista.pegaCelula(lista.tamanho() - 1).getProxima().getElemento());
		System.out.println("Anterior do primeiro:" + lista.pegaCelula(0).getAnterior().getElemento());
		
		lista.removeDoComeco();
		System.out.println(lista);
		
		System.out.println("Proximo do ultimo:" + lista.pegaCelula(lista.tamanho() - 1).getProxima().getElemento());
		System.out.println("Anterior do primeiro:" + lista.pegaCelula(0).getAnterior().getElemento());
		
		lista.remove(0);
		System.out.println(lista);
		System.out.println("Proximo do ultimo:" + lista.pegaCelula(lista.tamanho() - 1).getProxima().getElemento());
		System.out.println("Anterior do primeiro:" + lista.pegaCelula(0).getAnterior().getElemento());
	}
}

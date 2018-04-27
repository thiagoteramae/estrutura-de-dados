package br.com.alura.ed.pilha;

import br.com.alura.ed.listaduplamenteligada.ListaDuplamenteLigada;

public class Pilha {
	ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
	
	public void empilha(Object elemento) {
		lista.adiciona(elemento);
	}
	
	public void desempilha() {
		lista.removeDoFim();
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}
}

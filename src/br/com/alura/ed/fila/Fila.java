package br.com.alura.ed.fila;

import br.com.alura.ed.listaduplamenteligada.ListaDuplamenteLigada;

public class Fila {
	ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
	
	public void adiciona(Object elemento) {
		lista.adiciona(elemento);
	}
	
	public void remove() {
		lista.removeDoComeco();
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}
}

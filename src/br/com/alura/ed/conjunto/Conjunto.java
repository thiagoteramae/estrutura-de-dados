package br.com.alura.ed.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

	private List<LinkedList<String>> lista = new ArrayList<LinkedList<String>>();

	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			LinkedList<String> listaDentroDaLista = new LinkedList<>();
			lista.add(listaDentroDaLista);
		}
	}

	public int calculaIndice(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26;
	}

	public LinkedList pegaLista(String palavra) {
		int indice = calculaIndice(palavra);
		LinkedList<String> listaDaLista = lista.get(indice);
		return listaDaLista;
	}

	public void adiciona(String palavra) {
		LinkedList listaDaLista = pegaLista(palavra);

		if (!listaDaLista.contains(palavra))
			listaDaLista.add(palavra);
	}

	public void remove(String palavra) {
		LinkedList listaDaLista = pegaLista(palavra);

		if (listaDaLista.contains(palavra))
			listaDaLista.remove(palavra);
	}

	@Override
	public String toString() {
		return lista.toString();
	}
}

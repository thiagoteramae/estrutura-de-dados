package br.com.alura.ed.listaligada;

public class ListaLigada {
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, this.primeira);
		this.primeira = nova;
		if (totalDeElementos == 0)
			this.ultima = primeira;
		this.totalDeElementos++;
	}

	public void adiciona(Object elemento) {
		Celula nova = new Celula(elemento, null);
		if (totalDeElementos == 0)
			adicionaNoComeco(nova);
		ultima.setProxima(nova);
		ultima = nova;
		this.totalDeElementos++;
	}

	public void adiciona(int posicao, Object elemento) {
		if (totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == totalDeElementos) {
			adiciona(elemento);
		} else {
			Celula anterior = pegaCelula(posicao - 1);
			Celula nova = new Celula(elemento, anterior.getProxima());
			anterior.setProxima(nova);
			totalDeElementos++;
		}
	}

	public Celula pegaCelula(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Posicao inválida");
		Celula atual = primeira;
		for (int i = 0; i < posicao; i++)
			atual = atual.getProxima();
		return atual;
	}

	public Object pega(int posicao) {
		return pegaCelula(posicao).getElemento();
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeElementos;
	}

	public void removeDoComeco() {
		if (this.totalDeElementos == 0)
			throw new IllegalArgumentException("A lista está vazia.");

		this.primeira = this.primeira.getProxima();
		totalDeElementos--;

		if (this.totalDeElementos == 0)
			this.ultima = null;
	}

	public void removeDoFim() {
		if (totalDeElementos == 0)
			throw new IllegalArgumentException("A lista está vazia.");
		else if (totalDeElementos == 1)
			removeDoComeco();
		else {
			Celula penultima = pegaCelula(totalDeElementos - 2);
			
			penultima.setProxima(null);
			ultima = penultima;
			
			totalDeElementos--;
		}
	}

	public void remove(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Posicao inválida");
		else if (posicao == 0) {
			removeDoComeco();
		} else {
			Celula anterior = pegaCelula(posicao - 1);
			Celula vaiSerRemovida = pegaCelula(posicao);
			anterior.setProxima(vaiSerRemovida.getProxima());
			totalDeElementos--;
		}
	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		if (this.totalDeElementos == 0)
			throw new IllegalArgumentException("A lista está vazia");

		Celula atual = this.primeira;

		for (int i = 0; i < totalDeElementos; i++) {
			if (atual.getElemento() == elemento)
				return true;
			atual = atual.getProxima();
		}

		return false;
	}

	@Override
	public String toString() {
		if (this.totalDeElementos == 0)
			return "[]";

		Celula atual = primeira;

		StringBuilder stringBuilder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			stringBuilder.append(atual.getElemento() + ", ");
			atual = atual.getProxima();
		}

		stringBuilder.append("]");

		return stringBuilder.toString();
	}

}

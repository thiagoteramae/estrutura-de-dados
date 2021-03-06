package br.com.alura.ed.listaduplamenteligada;

public class ListaDuplamenteLigada {
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		if (totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = this.primeira;
		} else {
			Celula nova = new Celula(elemento, this.primeira);
			nova.setAnterior(this.ultima);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
			this.ultima.setProxima(this.primeira);
		}
		this.totalDeElementos++;
	}

	public void adiciona(Object elemento) {

		if (totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento, this.primeira);
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.primeira.setAnterior(this.ultima);

			this.totalDeElementos++;
		}

	}

	public void adiciona(int posicao, Object elemento) {
		if (totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == totalDeElementos) {
			adiciona(elemento);
		} else {
			Celula anterior = pegaCelula(posicao - 1);

			Celula nova = new Celula(elemento, anterior.getProxima());

			Celula proxima = anterior.getProxima();

			anterior.setProxima(nova);
			nova.setAnterior(anterior);
			proxima.setAnterior(nova);

			totalDeElementos++;
		}
	}

	public void removeDoComeco() {
		if (this.totalDeElementos == 0)
			throw new IllegalArgumentException("Não há o que remover.");

		this.primeira = this.primeira.getProxima();
		this.primeira.setAnterior(this.ultima);
		this.ultima.setProxima(this.primeira);
		totalDeElementos--;

		if (this.totalDeElementos == 0)
			this.ultima = null;
	}

	public void removeDoFim() {
		if (totalDeElementos == 0)
			throw new IllegalArgumentException("A lista está vazia!");
		else if (totalDeElementos == 1)
			removeDoComeco();
		else {
			Celula penultima = ultima.getAnterior();
			penultima.setProxima(this.primeira);
			this.ultima = penultima;
			this.primeira.setAnterior(this.ultima);
			totalDeElementos--;
		}
	}

	public void remove(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Posicao inválida");
		else if (posicao == 0) {
			removeDoComeco();
		} else if (posicao == totalDeElementos - 1) {
			removeDoFim();
		} else {
			Celula vaiSerRemovida = pegaCelula(posicao);
			Celula anterior = vaiSerRemovida.getAnterior();
			Celula proxima = vaiSerRemovida.getProxima();

			proxima.setAnterior(anterior);
			anterior.setProxima(proxima);

			totalDeElementos--;
		}
	}

	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeElementos;
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

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		Celula atual = this.primeira;

		for (int i = 0; i < totalDeElementos; i++) {
			if (atual.getElemento() == elemento) {
				return true;
			}

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

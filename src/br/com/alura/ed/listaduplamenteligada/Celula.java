package br.com.alura.ed.listaduplamenteligada;

public class Celula {
	private Object elemento;
	private Celula anterior;
	private Celula proxima;

	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	public Celula(Object elemento, Celula proxima) {
		this.elemento = elemento;
		this.proxima = proxima;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Object getElemento() {
		return elemento;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

}

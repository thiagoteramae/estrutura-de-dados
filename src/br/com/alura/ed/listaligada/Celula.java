package br.com.alura.ed.listaligada;

public class Celula {
	private Object elemento;
	private Celula proxima;

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

}

package br.com.alura.ed.fila;

public class TestaFila {
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adiciona("Thiago");
		fila.adiciona("Joao");
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
	}
}

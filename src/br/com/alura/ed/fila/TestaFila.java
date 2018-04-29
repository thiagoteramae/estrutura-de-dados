package br.com.alura.ed.fila;

public class TestaFila {
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adiciona("Mauricio");
		fila.adiciona("Paulo");
		fila.adiciona("Guilherme");
		
		fila.remove();
		
		fila.adiciona("Joao");
		
		fila.remove();
		
		System.out.println(fila);
	}
}

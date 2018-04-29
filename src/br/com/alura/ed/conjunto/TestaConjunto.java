package br.com.alura.ed.conjunto;

public class TestaConjunto {
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Mauricio");
		conjunto.adiciona("Mauricio");
		conjunto.adiciona("Guilherme");
		conjunto.adiciona("Paulo");
		conjunto.remove("Guilherme");
		
		System.out.println(conjunto);
		
//		conjunto.adiciona("Thiago");
//		System.out.println(conjunto);
//		
//		conjunto.adiciona("Tadeu");
//		System.out.println(conjunto);
//		
//		conjunto.adiciona("Mauricio");
//		System.out.println(conjunto);
//		
//		conjunto.adiciona("Marcelo");
//		System.out.println(conjunto);
//		
//		conjunto.remove("Thiago");
//		System.out.println(conjunto);
//		
//		conjunto.remove("Tadeu");
//		System.out.println(conjunto);
//
//		conjunto.remove("Mauricio");
//		System.out.println(conjunto);
//
//		conjunto.remove("Marcelo");
//		System.out.println(conjunto);
	}
}

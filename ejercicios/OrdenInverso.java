package ejercicios;

import java.util.Stack;

public class OrdenInverso {

	public Stack<Character> invertir(String cadena) {
	Stack<Character> pila = new Stack<Character>();
	Stack<Character> pilaInvertida = new Stack<Character>();
	
		for (int i=0; i<cadena.length(); i++) {
			pila.push(cadena.charAt(i));
		}
		
		
		while (!pila.empty()) {
			pilaInvertida.push(pila.pop());
		}

		 return pilaInvertida;

	}

	public static void main(String[] args) {
		OrdenInverso cadenainvertida = new OrdenInverso();
		System.out.println(cadenainvertida.invertir("Oso"));
		System.out.println(cadenainvertida.invertir("osO"));
	}
}

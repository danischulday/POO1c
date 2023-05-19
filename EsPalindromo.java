package ejercicios;

import java.util.Stack;

public class EsPalindromo {
	public boolean palindromear(String cadena) {
	Stack<Character> pila = new Stack<Character>();
	String s = "";
		for (int i=0; i<cadena.length(); i++) {
			pila.push(cadena.charAt(i));
		}
		
		
		
		while (!pila.empty()) {
		s += pila.pop();
		}

	

		 return cadena.equals(s);
		 //compara el contenido de dos objetos

	}

	public static void main(String[] args) {
		EsPalindromo cadena = new EsPalindromo();
		System.out.println(cadena.palindromear("oso"));
	}

}

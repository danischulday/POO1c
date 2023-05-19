package ejercicios;

import java.util.ArrayDeque;
import java.util.Queue;


public class ColasContinuas {

private Queue<Integer> cola1 = new ArrayDeque<Integer>();
private Queue<Integer> cola2 = new ArrayDeque<Integer>(); 

	public Queue<Integer> construirCola () {
		Queue<Integer> colaNueva = new ArrayDeque<Integer>();
		while (!cola1.isEmpty()) {
			colaNueva.offer(cola1.poll());
		}
		while (!cola2.isEmpty()) {
			colaNueva.offer(cola2.poll());
		}
		return colaNueva;
	}
	public void ponerEnLaCola1(Integer enCola) {
		cola1.offer(enCola);
	}
	public void ponerEnLaCola2(Integer enCola) {
		cola2.offer(enCola);
	}
	public static void main(String[] args) {
		ColasContinuas colita = new ColasContinuas();
		colita.ponerEnLaCola1(1);
		colita.ponerEnLaCola1(2);
		colita.ponerEnLaCola1(3);
		colita.ponerEnLaCola2(4);
		colita.ponerEnLaCola2(5);
		colita.ponerEnLaCola2(6);
		System.out.println(colita.construirCola());
		
	
	}

}

package ejercicios;

import java.util.ArrayDeque;
import java.util.Queue;

public class ColaContinua {
	
	public Queue<Integer> dosColasEnUna (Queue<Integer> q1, Queue<Integer> q2) {
		Queue<Integer> cc = new ArrayDeque<Integer>();
		
		while(!q1.isEmpty()) {
			cc.offer(q1.poll());
		}
		while(!q2.isEmpty()) {
			cc.offer(q2.poll());
		}
		return cc;
	}

}

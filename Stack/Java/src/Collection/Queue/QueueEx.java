package Collection.Queue;

import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq= new PriorityQueue();
		/*pq.add("Sunny");
		pq.add("Deepa");
		pq.add("Poola");
		pq.add("Nallapu");
		pq.add("Nallapu");
		System.out.println(pq);//Duplicates allowed,insertion order not preserved and heterogeneous not allowed
		System.out.println(pq.element());
		System.out.println(pq.peek());*/
		pq.add(10);
		pq.add(40);
		pq.add(20);
		pq.add(5);
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq.peek());

	}

}

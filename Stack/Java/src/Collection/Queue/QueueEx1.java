package Collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
       pq.add(50);
       pq.add(10);
       pq.add(30);
       pq.add(20);
       System.out.println(pq);
       System.out.println(pq.poll());
       System.out.println(pq);
       /*for(Object val:pq) {
    	   System.out.println(val);
       }*/
       Iterator itr=pq.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
       
	}
}
//add and offer - adding elements
//element and peek - reading elements
//remove and poll - removing element from queue

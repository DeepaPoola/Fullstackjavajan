package Collection.Treeset;

import java.util.SortedSet;
import java.util.TreeSet;

//second highest number
public class Treeset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet s = new TreeSet();//parent can hold child because we use methods from sortedset
		int[] salary= {65000,72000,87000,24000,34000,34000,72000,99009};
		for(int sal:salary) {
			s.add(sal);
		}
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		s.remove(s.last());
		System.out.println(s);
		System.out.println(s.last());
		s.remove(s.first());
		System.out.println(s.first());

	}

}

package Collection.Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //TreeSet t = new TreeSet();
      TreeSet t = new TreeSet(new MyComp());
      t.add("Sunny");
      t.add("Deepa");
      t.add("Nallapu");
      System.out.println(t);
	}
}
class MyComp implements Comparator{
	public int compare(Object o1,Object o2) {
		System.out.println(o1);
		String s1=(String) o1;
		String s2=(String) o2;
		return s2.compareTo(s1);
	}
}

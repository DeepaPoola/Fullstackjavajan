package Collection.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //TreeMap t = new TreeMap();
      TreeMap t = new TreeMap(new MyComp());
      t.put("id", 101);
      t.put("name", "sunny");
      t.put("sal", 30000);
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



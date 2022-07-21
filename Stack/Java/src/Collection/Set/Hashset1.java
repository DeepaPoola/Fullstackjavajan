package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet hs = new HashSet(50,0.50f);//50-initial capacity, .50 load factor
      HashSet hs = new HashSet();//initial capacity 100, fill ratio or load factor .75
      HashSet<String> hs1 = new HashSet<String>();
      hs.add(10);
      hs.add(20);
      hs.add("Sunny");
      hs.add("Deepa");
      hs.add(30);
      hs1.add("Nallapu");
      hs1.add("Poola");
      hs.addAll(hs1);
      //System.out.println(hs);
      //System.out.println(hs1);
      System.out.println(hs.isEmpty());//get and set methods are not there because insertion order is not there
      /*for(Object val:hs)
      {
    	  System.out.println(val);
      }*/
      Iterator i=hs.iterator();
      while(i.hasNext()) {
    	  System.out.println(i.next());
      }
	}

}

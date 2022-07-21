package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList al = new ArrayList();
      al.add(10);
      al.add(20);
      al.add("Sunny");
      al.add("Deepa");
      al.add(true);
      System.out.println(al.size());
      System.out.println(al);
      System.out.println(al.isEmpty());
      System.out.println(al.contains(20));
      System.out.println(al);
      al.remove(1);
      System.out.println(al);
      System.out.println(al.get(1));
      al.clear();
      System.out.println(al);
      /*ArrayList<Integer> al1=new ArrayList<Integer>();//intial capacity 10 and allowed heretegeneous elements
      ArrayList<String> al2=new ArrayList<String>();
      al1.add(20);
      al1.add(10);
      al2.add("Sunny");
      System.out.println(al1);
      System.out.println(al2);
      Collections.sort(al1);
      System.out.println(al1);*/
      
	}

}

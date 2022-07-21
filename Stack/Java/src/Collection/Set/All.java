package Collection.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
public class All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList al=new ArrayList();
     HashSet hs = new HashSet();
     LinkedList l=new LinkedList();
     LinkedHashSet lh = new LinkedHashSet();
     al.add(10);
     al.add(20);
     al.add(5);
     hs.add(30);
     hs.add(10);
     hs.add(20);
     hs.add("Sunny");
     hs.add(10);
     l.add(50);
     l.add(40);
     //l.add("Deepa");
     l.add(30);
     lh.add(40);
     lh.add(30);
     lh.add("Nallapu");
     lh.add(4);
     //System.out.println(al);
     //System.out.println(hs);
     //System.out.println(l);
     //System.out.println(lh);
     Iterator i =hs.iterator();
     while(i.hasNext()) {
    	 System.out.println(i.next());
     }
	}

}

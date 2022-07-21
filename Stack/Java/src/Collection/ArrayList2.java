package Collection;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList al = new ArrayList();
    al.add(10);
    al.add(10);
    al.add(20);
    al.add(30);
    al.add(40);
    /*for(int i =0;i<=al.size()-1;i++) {
    	System.out.println(al.get(i));
    }*/
    /*for(Object val:al) {
    	System.out.println(val);
    }*/
    Iterator i = al.iterator();
    while(i.hasNext()) {
    	System.out.println(i.next());
    }
	}

}

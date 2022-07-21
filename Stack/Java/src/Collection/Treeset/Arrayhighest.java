package Collection.Treeset;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayhighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] numbers= {65,73,87,25,34,3,73,99};
     ArrayList al = new ArrayList();
     for(int num:numbers)
     {
    	 al.add(num);
     }
     System.out.println(al);
     Collections.sort(al);
     System.out.println(al);
     System.out.println(al.get(al.size()-2));
	}

}

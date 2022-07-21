package Collection.Treeset;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("twenty");
		HashSet hs = new HashSet();//sorting is applied
		hs.addAll(al);
		System.out.println(hs);
		System.out.println(al);
	}

}

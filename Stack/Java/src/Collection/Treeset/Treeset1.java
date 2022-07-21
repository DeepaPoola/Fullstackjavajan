package Collection.Treeset;

import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeSet t1=new TreeSet();//default natural sorting order applied
    t1.add(20);
    t1.add(10);
    t1.add(40);
    t1.add(30);
    System.out.println(t1);
    TreeSet t2=new TreeSet();
    t2.add("Sunny");
    t2.add("Deepa");
    t2.add("Nallapu");
    t2.add("Poola");
    System.out.println(t2);
	}

}

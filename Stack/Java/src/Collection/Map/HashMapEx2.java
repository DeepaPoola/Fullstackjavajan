package Collection.Map;

import java.util.HashMap;
import java.util.TreeMap;


public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashMap hm = new HashMap();
		//TreeMap hm = new HashMap();//cannot convert hashmap to treemap
	      hm.put(101,"Sunny");
	      hm.put(102,"Deepa");
	      hm.put(103, "Nallapu");
	      hm.put(104, "Poola");
	      //hm.put("null", "null");
	      //hm.put(null, null);
	      System.out.println(hm);
	      //hm.remove(null);//it removes null-removes key:value entry	
	      //hm.remove("null");//it removes string null
	      System.out.println(hm.keySet());
	      System.out.println(hm.values());
	      for(Object key:hm.keySet()) {
	    	  System.out.println(hm.get(key));
	    	  
	      }
	}

}

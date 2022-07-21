package Collection.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm= new HashMap();
       hm.put("id", 101);
       hm.put("name", "Sunny");
       hm.put("sal", 30000);
       Set s= hm.entrySet();//iterator is not there in hashmap so we used set
       Iterator itr = s.iterator();
       while(itr.hasNext())
       {
    	   Map.Entry entry =(Map.Entry) itr.next();
    	   System.out.println(entry.getKey()+":"+entry.getValue());
       }
	}

}

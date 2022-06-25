package Lang.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		/*String s = "1000";
		boolean flag = true;
		Boolean b = flag;  //autoboxing*/
		int price=1000;
        Integer i = Integer.valueOf(price);
        String String = Integer.toString(price);
        Float f= Float.valueOf(price);
        System.out.println(i.toString());
        System.out.println(String);
        System.out.println(f);
        Boolean b= Boolean.valueOf(false);
        System.out.println(b);
	}

}

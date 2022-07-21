package ExceptionH;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("hello,Gm");
      /*System.out.println(10/0);
      System.out.println("GN");*/
      try {
    	  System.out.println(10/0); 
      }
      catch(Exception e) {
    	  System.out.println(e);
      }
      System.out.println("GN");
	}

}

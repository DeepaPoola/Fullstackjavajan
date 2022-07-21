package ExceptionH;

public class Demo3 {

	public static void main(String[] args) {
		getData();
	}
	public static void getData() {
		// TODO Auto-generated method stub
        try {
        	System.out.println(10/0);
        }
        catch(ArithmeticException e){
        	e.printStackTrace();
        	//System.out.println(e.toString());
        	//System.out.println(e.getMessage());
        }
	}
	

}

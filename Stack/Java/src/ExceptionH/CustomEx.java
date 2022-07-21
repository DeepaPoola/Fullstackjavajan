package ExceptionH;
class MyException extends RuntimeException{
	MyException(String s){
		super(s);
	}
}

public class CustomEx {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
       int a =100;
       if(a>100)
       {
    	   System.out.println("Hello! GM");
       }
       else {
    	   throw new MyException("Hello! GA");
       }
	}

}

//runtime exception accept only string
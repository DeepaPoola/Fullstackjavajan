package ExceptionH;

public class ThrowEx {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
     //System.out.println(10/0);//AE object created internally
		System.out.println("Hello");
     throw new ArithmeticException("/by zero");//we are creating one AE and handover to jvm
     
	}

}
//throw : to handover Excption object to the JvM manually

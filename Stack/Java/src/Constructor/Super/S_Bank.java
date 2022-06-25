package Constructor.Super;

public class S_Bank extends Bank {
	S_Bank(){
		System.out.println("Child constructor");
	}
	double min_Bal=1000;
	public void getMinBal() {
		
		System.out.println(super.min_Bal);
		System.out.println(min_Bal);
	} 
	public void cal_Bal() {
		super.cal_Bal();
		 System.out.println("Child - cal-Bal()method");
	 }
	public static void main(String args[])
	{
		S_Bank s=  new S_Bank();
		s.getMinBal();
		s.cal_Bal();
	}
	

}

package Oops;

public class AccountEx1 {
	static int acc_Id =10;
	public String acc_Name="Sunny";
	private double acc_Bal=25000.00;
	public void cal_Bal() {
	 System.out.println("Calculate Balance - non static");	
	}
	public static void acc_Service() {
		System.out.println("Account Service - static ");
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountEx1 ac=new AccountEx1();
        System.out.println(ac.acc_Id);
        System.out.println(AccountEx1.acc_Id);
        System.out.println(acc_Id);
        System.out.println(ac.acc_Name);
        System.out.println(ac.acc_Bal);
        ac.cal_Bal();
        ac.acc_Service();
        AccountEx1.acc_Service();
        acc_Service();
	}

}

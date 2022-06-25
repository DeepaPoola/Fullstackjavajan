package Constructor;

public class SavingsAccount extends Account2 {
	double acc_Bal;

	public SavingsAccount(int a, String b,double c) {
		super(a, b);
		this.acc_Bal=c;
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		SavingsAccount s = new SavingsAccount(10,"Sunny",50000.00);
		System.out.println(s.acc_Id);
		System.out.println(s.acc_Name);
		System.out.println(s.acc_Bal);
	}

}

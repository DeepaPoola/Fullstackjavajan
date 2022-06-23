package Oops.Poly;

public class Savingsaccount extends Account {
	private int min_Bal;

	public int getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(int min_Bal) {
		this.min_Bal = min_Bal;
	}
   public void cal_Bal() {
	   double bal = getAcc_Bal();
	   bal = bal - getMin_Bal();
	   System.out.println("Available Balance :"+bal);
   }
}

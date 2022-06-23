package Oops.Poly;

public class Currentaccount extends Account {
	private int total_Bal;
	private int min_Bal;

	public int getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(int min_Bal) {
		this.min_Bal = min_Bal;
	}

	public int getTotal_Bal() {
		return total_Bal;
	}

	public void setTotal_Bal(int total_Bal) {
		this.total_Bal = total_Bal;
	}
	 public void cal_Bal() {
		   double bal = getAcc_Bal();
		   bal = bal - getMin_Bal();
		   System.out.println( "Available Balance :"+bal);

}
}

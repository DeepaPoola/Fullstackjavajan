package Constructor;

public class Account {
	Account(){
		System.out.println("Constructor - Account");
	}
	void Account(){
		System.out.println("Normal - Account");
	}
	public void cal_Bal() {
		System.out.println("Calculate balance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a= new Account();
        a.cal_Bal();
        a.Account();
	}

}

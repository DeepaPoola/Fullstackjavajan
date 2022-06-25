package Constructor;

public class Account1 {
	int acc_Id;
	String acc_Name;
	Account1(int a ,String b){
		this.acc_Id=a;
		this.acc_Name=b;
		//System.out.println(a);
		//System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account1 a1 = new Account1(10,"Sunny");
      
      Account1 a2 = new Account1(20,"Deepa");
      System.out.println(a1.acc_Id);
      System.out.println(a2.acc_Id);
      System.out.println(a1.acc_Name);
      System.out.println(a2.acc_Name);
	}

}

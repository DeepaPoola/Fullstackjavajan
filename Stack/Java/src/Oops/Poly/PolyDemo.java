package Oops.Poly;

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savingsaccount a1=new Savingsaccount();
		a1.setAcc_Id(10);
		a1.setName("Gandhi");
		a1.setMin_Bal(1000);
		a1.setAcc_Bal(50000);		
		//a1.cal_Bal();
		
		//System.out.println("Account Name:"+a1.getName() +"Account Id :"+a1.getAcc_Id()+"Minimum balance :"+a1.getMin_Bal());
		Currentaccount a2=new Currentaccount();
		
		a2.setAcc_Id(20);
		a2.setName("Rahul");
	    a2.setTotal_Bal(5000);
	    a2.setAcc_Bal(40000);
	    a2.setMin_Bal(500);
	    //a2.cal_Bal();
		//System.out.println("Account Name:"+a2.getName() + "Account Id :"+a2.getAcc_Id()+ "minimum balance :"+a2.getMin_Bal());
       Accountservices.showDetails(a1);
       Accountservices.showDetails(a2);;
	}

}

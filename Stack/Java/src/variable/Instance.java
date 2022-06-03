package variable;

public class Instance {
	int a=10;//instance variable if we want to access then use object.variable
	static int b=20;//static variable can be accessed by static method only
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance I =new Instance();
	System.out.println(I.a);
	System.out.println(b);
 
	}

}

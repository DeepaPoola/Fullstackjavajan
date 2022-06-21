package operators;

public class Incr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		//int b=20++; //it shows compile time error
		/*int c=a++;//first assign then increment
		System.out.println(a);//11
		System.out.println(c);//10*/
		int c=++a;//increment and assign
		System.out.println(a);//11
		System.out.println(c);//11
		

	}

}

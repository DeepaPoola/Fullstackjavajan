package variables;
class  Local{
	//int a=10;//instance variable if we want to access then use object.variable
	//static int b=20;//static variable can be accessed by static method only
	void m1(){
		int c=30;
		System.out.println(c);
	}
	public static void main(String[] args){
		Local s=new Local();
		//System.out.println(s.a);
		//System.out.println(b);
		s.m1();
		
	}
}


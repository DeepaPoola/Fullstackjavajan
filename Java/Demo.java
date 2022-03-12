class  Demo{
	int a=10;//instance variable if we want to access then use object.variable
	static int b=20;//static variable can be accessed by static method only
	public static void main(String[] args){
		Demo s=new Demo();
		System.out.println(s.a);
		System.out.println(b);
		
	}
}

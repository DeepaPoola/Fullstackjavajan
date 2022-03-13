class Incre{
	public static void main(String args[]){
		int a = 10;
		//int c = 20++;
		/*int b = a++;//first assign then increment
		System.out.println(b);//10
		System.out.println(a);//11*/
		int b = ++a;//increment and assign
		System.out.println(a);//11
		System.out.println(b);//11
		//System.out.println(c);//it shows error at compile time
	}
}
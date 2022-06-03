class Instance{
    	int a=10;//instance variable if we want to access then use object.variable
	static int b=20;//static variable can be accessed by static method only
    public static void main(String []args)
    {
        Instance I=new Instance();
        System.out.println(b);
        System.out.println(I.a);
    }
}
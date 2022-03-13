class Reverse{
	public static void main(String args[])
	{
		int a=201;
        int rem;
        int sum=0;
      while(a>0)
     {
        rem=a%10;
        sum=sum*10+rem;
        a=a/10;
    }
      System.out.println(sum);
	}
}
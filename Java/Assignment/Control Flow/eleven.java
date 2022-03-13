class Armstrong{
	public static void main(String args[])
	{
		int i=153;
        int r=0;
        int s=0;
		int n;
        n=i;
while(i>0)
{
    r=i%10;
    s=s+r*r*r;
    i=i/10;
}
if(s==n)
{
    System.out.println("armstrong");
}
else{
    System.out.println("not armstrong");
}
	}
}
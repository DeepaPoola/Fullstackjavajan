class Fibonocci{
 public static void main(String args[])
 {
   int f1=0;
   int f2=1;
   int f3;
   int n=8;
   int i=1;
   while(i<=n-2)
   {
      f3=f1+f2;
     System.out.println(f3);
      f1=f2;
      f2=f3;
      i++;
    }
 }	 
}
class Ascending{
 public static void main(String args[]){
   int[] a={10,1,5,16,15};
   int temp,i,j;
   for(i=0;i<5;i++)
{
    for(j=i+1;j<5;j++)
    {
        if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
    }
}
for(i=0;i<5;i++)
{
  System.out.println(a[i]);
}   
   
 }	 
}
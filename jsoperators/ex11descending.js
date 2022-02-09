var a=[5,10,2,60,7]
var temp,i,j
for(i=0;i<5;i++)
{
    for(j=i+1;j<5;j++)
    {
        if(a[i]<a[j])
        {
            temp=a[i]
            a[i]=a[j]
            a[j]=temp
        }
    }
}
for(i=0;i<5;i++)
{
    console.log(a[i])
}
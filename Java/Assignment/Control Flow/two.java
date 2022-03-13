class Sum{
	public static void main(String args[]){
		int sum=0;
		/*for(int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);*/
		int i=1;
		/*while(i<=10)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);*/
		do{
			sum=sum+i;
			i++;
		}while(i<=10);
		System.out.println(sum);
	}
}
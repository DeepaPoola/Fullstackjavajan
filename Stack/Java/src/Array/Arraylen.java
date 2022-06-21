package Array;

public class Arraylen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] size = {10,20,30,40};
        String name="Sunny";
        System.out.println(size.length);
        System.out.println(name.length());
        for(int i=0;i<=size.length-1;i++)
        {
        	System.out.println(size[i]);
        }
        for(int s:size)//foreach loop
        	
        {
        	System.out.println(s);
        }
        
	}

}

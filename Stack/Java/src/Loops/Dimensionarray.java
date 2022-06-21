package Loops;

public class Dimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{10,20,30},{40,50,60}};
         for(int []x:a) {
        	 for(int y:x) {
        		 System.out.println(y);
        	 }
         }
	}

}

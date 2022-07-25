package DateTime;

import java.time.Year;

public class YearEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int year=2022;
     Year y=Year.of(year);
     if(y.isLeap()) {
    	 System.out.println("Yes,Leap year");
     }
    	 else
    	 {
    		 System.out.println("No,Leap year");
    	 }
     
	}

}

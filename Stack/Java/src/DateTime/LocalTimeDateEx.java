package DateTime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalTimeDateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LocalDateTime dt=LocalDateTime.now();
       LocalDateTime dt1=LocalDateTime.of(2015,10, 11, 10, 10);
       System.out.println(dt);//2022-07-24T21:08:29.112509800
       System.out.println(dt1);//2015-10-11T10:10
    		   
	}

}

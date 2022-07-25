package DateTime;

import java.time.LocalDate;
import java.time.Period;

public class CalAge {

	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1998, 2, 2);
		LocalDate dob1 = LocalDate.of(2000, 9, 18);
		LocalDate today= LocalDate.now();
		Period p= Period.between(dob, today);
		Period p1= Period.between(dob1, today);
		Period p2= Period.between(dob, dob1);
		System.out.println("No of Years:" +p.getYears());
		System.out.printf("My Age is : %d Years %d Months and %d days", p.getYears(), p.getMonths(), p.getDays());
        
		System.out.println("No of Years:" +p1.getYears());
		System.out.printf("My Age is : %d Years %d Months and %d days", p1.getYears(), p1.getMonths(), p1.getDays());
	
		System.out.println("No of Years gap:" +p2.getYears());
	}

}

//Period class  - used to calcualte represent - quantity of time
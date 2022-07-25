package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateEx {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);//2022-07-24
		LocalTime time=LocalTime.now();
		System.out.println(time);//21:02:06.115688700
		int year=date.getYear();
		Month month=date.getMonth();
		int month1=date.getMonthValue();
		int dd=date.getDayOfMonth();
		System.out.println(dd+":"+month1+":"+year);//24:7:2022
		System.out.println(dd+"/"+month1+"/"+year);//24/7/2022
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int n=time.getNano();
		System.out.printf("%d:%d:%d:%d",h,m,s,n);//21:2:6:115688700
	}

}

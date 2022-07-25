package DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ZoneId zone=ZoneId.systemDefault();
       System.out.println(zone);//Asia/Calcutta
       
       ZoneId india=ZoneId.of("Asia/Calcutta");
       ZonedDateTime indiaZoneDateTime=ZonedDateTime.now(india);
       System.out.println(indiaZoneDateTime);//2022-07-24T21:23:09.436975200+05:30[Asia/Calcutta]
       
       ZoneId ca=ZoneId.of("America/Los_Angeles");
       ZonedDateTime zt=ZonedDateTime.now(ca);
       System.out.println(zt);//2022-07-24T08:54:02.914197300-07:00[America/Los_Angeles]
	}

}

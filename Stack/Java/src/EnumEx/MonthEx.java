package EnumEx;
import java.lang.Enum;
enum Month{
	JAN,FEB,MARCH,APRIL;
}

public class MonthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Month[] m=Month.values();
     for(Month m1:m) {
    	 System.out.println(m1+"...."+m1.ordinal());
     }
	}

}

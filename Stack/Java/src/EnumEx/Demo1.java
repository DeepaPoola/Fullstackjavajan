package EnumEx;
enum Gender{
	MALE,FEMALE,OTHER;
}
public class Demo1 {
	public static void main(String args[]) {
		Gender g=Gender.FEMALE;
		switch(g) {
		case MALE:
			System.out.println("MALE Value");
			break;
		case FEMALE:
			System.out.println("FEMALE value");
			break;
			default:
				System.out.println("other");
				break;
		}
		
		
	}

}
//swtich - allowed value - byte, short, Char, Integer and enum, String
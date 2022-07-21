package EnumEx;
/*enum Gender{
	FEMALE,MALE;
	Gender(){
		System.out.println("Constructor");
	}
}//order of constant
class  Demo2 {
 public static void main(String args[])
 {
	 Gender[] g=Gender.values();
	 for(Gender g1:g) {
		 System.out.println(g1.ordinal());
	 }
 }
}*/
enum Gender{
	MALE,FEMALE,OTHER,NEWGENDER;
	Gender(){
		System.out.println("constructor");
	}
} //order of constant
class Demo2{
public static  void main(String[] args){
		Gender[] g  = Gender.values();
		for(Gender g1:g){
		System.out.println(g1.ordinal());
		}
	
	}
}

package Java8_Features;
interface Interface1{
	default void m1() {
		System.out.println("Interface1 m1()");
	}
}
interface Interface2{
	default void m1() {
		System.out.println("Interface2 m1()");
	}
}
public class DefaultEx implements Interface1,Interface2 {
     public void m1() {
    	 System.out.println("Default m1()");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DefaultEx de=new DefaultEx();
    de.m1();
	}

}

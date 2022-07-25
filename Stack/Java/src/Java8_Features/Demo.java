package Java8_Features;
interface Top{
	default void m1() {
		System.out.println("Default Top m1 method");
	}
}
interface Bottom{
	default void m1() {
		System.out.println("Default Bottom m1 method");
	}
}
public class Demo implements Top,Bottom{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo d= new Demo();
       d.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
		Top.super.m1();
		Bottom.super.m1();
	}

}

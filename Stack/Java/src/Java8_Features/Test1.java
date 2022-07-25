package Java8_Features;
interface I{
	public abstract void m1();
	public abstract void m2();
	default void m3() {
		System.out.println("Default m3 method");
	}
}
public class Test1 implements I {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		t.m3();
        
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}

}

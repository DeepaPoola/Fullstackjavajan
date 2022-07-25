package Java8_Features;
@FunctionalInterface
interface TestInterface{
	public abstract void m1();
}
public class LambdaEx {
   static TestInterface ti=()->{System.out.println("Hello");};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ti.m1();
	}

}

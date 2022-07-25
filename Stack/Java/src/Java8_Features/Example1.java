package Java8_Features;
/*interface I{
	public void methodOne();
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      I i=()->{System.out.println("Class method");};
      i.methodOne();
      }
	}*/
interface I{
	public void methodOne();
}
public class Example1{

	public static void main(String[] args) {
		I i = ()->{System.out.println("Test Class Method");};
		i.methodOne();
	}

}



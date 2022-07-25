package Java8_Features;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String ename="Sunny";
     Runnable r1=()->{System.out.println(ename);};
     r1.run();
	}

}

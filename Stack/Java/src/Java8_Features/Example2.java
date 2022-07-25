package Java8_Features;
interface Add{
	public void sum(int a,int b);
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Add i =(int a,int b)->{System.out.println("Sum of:"+(a+b));};
     i.sum(10, 20);
	}

}

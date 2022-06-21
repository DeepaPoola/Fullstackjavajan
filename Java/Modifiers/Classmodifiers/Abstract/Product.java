abstract class Product{
	public void m1(){
	System.out.println("Abstract class - concrete method()");
	}   // concrete method
	public abstract void m2();// non concrete method
}

class Test extends Product{

public void m2(){
System.out.println("Child class - Implimentation method()");
}
public static void main(String[] args){
	//new Product(); Object creation is not possible
	Test t1 = new Test();
	t1.m1();
	t1.m2();
}
}

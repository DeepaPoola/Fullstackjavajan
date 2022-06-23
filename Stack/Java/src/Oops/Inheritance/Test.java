package Oops.Inheritance;
class Parent{
	public void m1() {
		System.out.println("Parent m1()-method");
	}
}
class Child extends Parent{
	public void m2() {
		System.out.println("Child m2()-method");
	}
}
public class Test {
 public static void main(String args[]) {
	 Parent p=new Parent();
	 Child c=new Child();
	 //Child c1=new Parent(); child cannot hold parent
	 Parent p1=new Child();
	 p1.m1();
	 p.m1();
	 c.m1();
	 c.m2();
 }
}

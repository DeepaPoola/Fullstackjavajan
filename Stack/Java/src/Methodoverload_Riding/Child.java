package Methodoverload_Riding;

public class Child extends Parent {
   public void display() {
	   System.out.println("Child display");
   }
   public void get() {
	   System.out.println("Get - no param");
   }
   public void get(int a) {
	   System.out.println("Get -  param");
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child c = new Child();
    //Parent p=new Child();
    //p.display();
    c.display();
    c.get();
    c.get(10);
	}

}

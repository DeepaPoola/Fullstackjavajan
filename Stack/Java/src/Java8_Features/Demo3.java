package Java8_Features;

	interface I{
	    void m1();
	    default void m2(){
		System.out.println("Interface Default method");
		}
		static void m3(){
		System.out.println("Interface Static method");
		}
	}
	class Demo3 {
	  public void m1(){}
	  public static void main(String[] args){
	  Test t = new Test();
	  
	  I.m3();
	  //t.m3();
	  }
	}


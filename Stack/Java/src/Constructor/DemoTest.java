package Constructor;
class Test{
	Test(){
		System.out.println("Parent - Test");
	}
}

class Demo extends Test{

	Demo(){
		super();
		System.out.println("Child  - Demo");
	}

}
class DemoTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();

	}
}

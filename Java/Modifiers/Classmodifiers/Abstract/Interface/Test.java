interface Task{
	void doTask();
	void getTask();
    int amount=100;
}
class Test implements Task{
	public void doTask() {
		// TODO Auto-generated method stub
		System.out.println("doTask method");
		
	}
	public void getTask() {
		// TODO Auto-generated method stub
		System.out.println("getTask method");
	}
	public static void main(String args[]) {
		Test t= new Test();
		t.doTask();
		t.getTask();
        System.out.println(amount);
        System.out.println(Test.amount);
	}
    /*
     compile-javac Test.java
     run - java Test
     */
	
}
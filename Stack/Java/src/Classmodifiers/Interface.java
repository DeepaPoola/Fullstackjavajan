package Classmodifiers;
interface Task{
	void doTask();
	void getTask();
	int amount=100;
}
class Example implements Task{
	public void doTask() {
		// TODO Auto-generated method stub
		System.out.println("doTask method");
		
	}
	public void getTask() {
		// TODO Auto-generated method stub
		System.out.println("getTask method");
	}
	public static void main(String args[]) {
		Example t= new Example();
		t.doTask();
		t.getTask();
		System.out.println(amount);
		System.out.println(Example.amount);
	}
	
}

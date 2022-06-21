abstract class Test {
   public abstract void m1();
        /*Test t=new Test();
        System.out.prinltn(t);// we cannot create object for abstract class
        */  
}
class Demo extends Test{
    public void m1()
    {
      System.out.println("hello");
    }
    public static void main(String args[]){
        Demo d1=new Demo();
        d1.m1();
        /*Test t=new Demo();
        t.m1();*/
    } 
}
/*
 compile - javac Test.java
 Run - java Demo
 */
package p2;
import p1.A;
class B {
    public static void main(String[] args){
        System.out.println("B package p2");
        A a=new A();
        a.m1();
    }
}
//compile :- javac -d . B.java
//run :- java p2.B
// A and B are different packages so if we want to access A we declare A as public class
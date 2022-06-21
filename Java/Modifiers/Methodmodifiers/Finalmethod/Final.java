class Parent {
    void m1(){
        System.out.println("m1() method");
    }
    final void m2(){
        System.out.println("m2() method");
    }
}
class Child extends Parent{
    void m1(){}
    void m2(){}//we cant override final method
    public static void main(String args[]){
        Child c = new Child();
        c.m1();
        c.m2();
    }
}

package Java8_Features;

import java.util.function.Function;
import java.util.function.Predicate;

/*public class SquareEx {
     static Function<Integer,Integer>f=(a)->{return a*a;};
     static Predicate<Integer>p=i->1%2==0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(f.apply(20));
      System.out.println(p.test(2));
	}
	}

*/
/*class SquareEx {
	//static Function<Integer, Integer> f = (a)->{return a*a;} ;
	static Function<Integer, Integer> f = a->a*a;
	public static void main(String[] args){
		System.out.println("SQRT of "+f.apply(10));
	}
}*/
/*
 * class Test {
public static int sqrt(int n){
	return n*n;
}
public static void main(String[] args){
	System.out.println("SQRT of "+sqrt(10));
}
}*/
class SquarePredicateFunction{
static Predicate<Integer> p = i->i%2==0;
public static void main(String[] args){
	System.out.println(p.test(11));
}
}

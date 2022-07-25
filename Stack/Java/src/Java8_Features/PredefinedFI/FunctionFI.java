package Java8_Features.PredefinedFI;

import java.util.function.Function;

public class FunctionFI {
	static Function<String, Integer> f=s->s.length();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(f.apply("Rahul Gandhi"));
      
	}

}

package Java8_Features.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PricesFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> prices=new ArrayList<Integer>();
      prices.add(400);
      prices.add(100);
      prices.add(300);
      prices.add(200);
      prices.add(600);
      prices.add(550);
      System.out.println(prices);
      //Predicate<Integer> p=(price)->{return price<300;};
      List newFilteredPrices=prices.stream().filter(price->price<300).collect(Collectors.toList());
      System.out.println(newFilteredPrices);
      
	}
}
package Java8_Features.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PricesMap {

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
    //configuring stream and processing stream
      List newPrices=prices.stream().map(price->price+10).collect(Collectors.toList());
      System.out.println(newPrices);
	}
}
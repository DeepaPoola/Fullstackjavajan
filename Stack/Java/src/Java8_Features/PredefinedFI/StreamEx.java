package Java8_Features.PredefinedFI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> prices=new ArrayList<Integer>();
      prices.add(300);
      prices.add(600);
      prices.add(400);
      prices.add(100);
      prices.add(200);
      prices.add(500);
      List filteredPrices =(List) prices.stream().sorted().filter(price->price<500).collect(Collectors.toList());
      List newPrices=prices.stream().map(price->price+10).collect(Collectors.toList());
      System.out.println(prices);
      System.out.println(filteredPrices);
      System.out.println(newPrices);
	}

}

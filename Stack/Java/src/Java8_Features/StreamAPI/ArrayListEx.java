package Java8_Features.StreamAPI;

import java.util.ArrayList;

public class ArrayListEx {

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
      ArrayList<Integer> newPrices=new ArrayList<Integer>();
      ArrayList<Integer> newFilteredPrices=new ArrayList<Integer>();
      /*for(Integer i:prices) {
    	  if(i>300)
    	  {
    		  newPrices.add(i);
      }
      System.out.println(newPrices);*/
      for(Integer i:prices) {
    	  if(i>300)
    	  {
    		  newFilteredPrices.add(i);
    	  }
      }
      System.out.println(newFilteredPrices);

	}

}

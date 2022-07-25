package Java8_Features.StreamAPI;

import java.util.ArrayList;

public class StreamCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> marks=new ArrayList<Integer>();
      marks.add(56);
      marks.add(26);
      marks.add(46);
      marks.add(16);
      marks.add(36);
      //long noOfStudents=marks.stream().filter((mark)->{return mark>=35;}).count();
      long noOfStudents=marks.stream().filter(mark->mark>=35).count();
      System.out.println(noOfStudents);
	}

}

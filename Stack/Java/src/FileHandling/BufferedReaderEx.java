package FileHandling;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      FileReader r= new FileReader("a.txt");
      BufferedReader br=new BufferedReader(r);
      String line=br.readLine();
      while(line!=null) {
    	  System.out.println(line);
    	  line=br.readLine();
      }
	}

}

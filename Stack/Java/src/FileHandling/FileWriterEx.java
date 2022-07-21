package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      //FileWriter fw=new FileWriter("a.txt");
      FileWriter fw=new FileWriter("a.txt",true);
      //writing sequence of char data in file
      fw.write("Hello");
      fw.write("GM");
      fw.write(90);
      fw.flush();
      fw.close();
	}

}

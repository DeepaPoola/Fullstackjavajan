package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      FileWriter fw = new FileWriter("b.txt");
      BufferedWriter bw=new BufferedWriter(fw);
      bw.write(99);
      bw.newLine();
      bw.write("Hello");
      bw.newLine();
      bw.write("GM");
      bw.flush();
      bw.close();
	}

}

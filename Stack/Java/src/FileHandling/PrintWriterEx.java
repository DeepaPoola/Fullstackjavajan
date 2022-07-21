package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    FileWriter fw= new FileWriter("c.txt");
    PrintWriter pw=new PrintWriter(fw);
    pw.print(99);
    pw.print(true);
    pw.print("Hello");
    pw.flush();
    pw.close();
	}

}

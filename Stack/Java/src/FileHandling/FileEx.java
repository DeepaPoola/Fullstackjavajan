package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileEx {
   public static void main(String []args) throws IOException {
	   File f = new File("a.txt");
	   System.out.println(f.exists());
	   f.createNewFile();
	   System.out.println(f.exists());
   }
}

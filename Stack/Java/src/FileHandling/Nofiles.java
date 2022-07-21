package FileHandling;

import java.io.File;

public class Nofiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File f = new File("F:");
    String[] name=f.list();
    int count=0;
    for(String n:name) {
    	File f1=new File(f,n);
    	if(!f1.isFile())
    	{
    		count++;
    		System.out.println(n);
    	}
    	//count++;
    	//System.out.println(n);
    }
    System.out.println(count);
	}

}

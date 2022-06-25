package Lang;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob = new Object();
		Integer i = new Integer(10);
		String s= new String("Sunny");
		System.out.println(ob);
		System.out.println(i);
		System.out.println(s);

	}

}
/* By default lang package is there in every java class
 * no need to import
 * Object class is super class of every java class
 * object class contains
 * class Object{
 * public String toString(){}-return String representation of object
 * public boolean equals(){} - comparing the object
 * public final class getclass(){}
 * public int hashCode(){}
 * Object clone(){}
 * public final void notify(){}
 * notifyAll(){}
 * wait(){}
 * 
 */

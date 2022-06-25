package Lang;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e1 = new Employee();
     Employee e2 = new Employee();
     //System.out.println(e1.equals(e2));
    String s1 = new String("Sunny");
     String s2 = new String("Sunny");
     String s3 =s1;
     System.out.println(s1.equals(s2));
     System.out.println(s1.equals(s3));
     System.out.println(s1==s2);
     System.out.println(s1==s3);
     /*StringBuffer s3 = new StringBuffer("Sunny");
     StringBuffer s4 = new StringBuffer("Sunny");
     StringBuffer s5 =s3;
     System.out.println(s3.equals(s4));
     System.out.println(s3.equals(s5));
     System.out.println(s3==s4);
     System.out.println(s3==s5);*/
	}

}

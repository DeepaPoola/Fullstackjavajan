package Lang.StringEx;

public class concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name= new String("Sunny");
        name=name.concat("Deepa");
        name=name.concat("ILU");
        System.out.println(name);
        StringBuffer ename= new StringBuffer("Deepa");
        ename=ename.append("Sunny");
        ename.append("ilu");
        System.out.println(ename);
        		
	}

}

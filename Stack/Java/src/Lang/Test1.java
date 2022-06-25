package Lang;

public class Test1 extends Object {
    public String toString() {
        return getClass().getName() + "**" + Integer.toHexString(hashCode());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		System.out.println(t);
		System.out.println(t.toString());

	}

}

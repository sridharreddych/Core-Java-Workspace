public class WrapperDemo {

	public static void main(String[] args) {

	Integer i = new Integer(30);
	Integer i2 = new Integer("26");

	int i1 = i.intValue();
	String iValue = i.toString();
	Integer i3 = Integer.valueOf("45");
	int x = Integer.parseInt("32");
	System.out.println("i:"+i1+ " -iValue:" +iValue+ " -i3: " +i3.toString() + " -x:"+x);
	}
}
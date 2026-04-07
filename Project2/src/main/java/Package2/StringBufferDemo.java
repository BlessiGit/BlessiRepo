package Package2;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("I am learning Java");
		str.replace(14, 18, "python");
		System.out.println(str);
		
	}

}

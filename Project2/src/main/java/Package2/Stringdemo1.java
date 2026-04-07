package Package2;

public class Stringdemo1 {

	public static void main(String[] args) {
		String str = "Java is very powerful";
		String[] str1 = str.split(" ");
		for(int i=0;i<4;i++) {
			System.out.println(str1[i]);
		}
		System.out.println("Number of words = " +str1.length);

	}

}

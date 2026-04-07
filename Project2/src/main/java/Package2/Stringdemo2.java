package Package2;

public class Stringdemo2 {

	public static void main(String[] args) {
		String str = "Java Programming";
		String[] str1 = str.split(" ");
		for(int i=0;i<str1.length;i++) {
			String str2= str1[i];
			for(int j =str2.length()-1;j>=0;j--) {
				System.out.print(str2.charAt(j));
			}
			System.out.print(" ");
		}

	}

}

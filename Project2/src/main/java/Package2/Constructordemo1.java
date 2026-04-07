package Package2;

/* by using parameterized constructor*/

public class Constructordemo1 {
	String productName;
	int price;
	
	Constructordemo1(String productName,int price)
	{
		this.productName=productName;
		this.price=price;
	}
	
	public  void display()
	{
		System.out.println(productName);
		System.out.println(price);
	}
	

	public static void main(String[] args) {
		Constructordemo1 con = new Constructordemo1("shoe",10);
		Constructordemo1 con2 = new Constructordemo1("bag",6);
		con.display();
		con2.display();
		
		
		
		

	}

}

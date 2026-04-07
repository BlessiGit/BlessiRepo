package Package2;
//Default constructor
public class ConstructorDemo2 {
	String productName;
	int price;
	
	ConstructorDemo2() {
	
	}
	
	public void display()
	{
		System.out.println(productName);
		System.out.println(price);
	}
	
	

	public static void main(String[] args) {
		ConstructorDemo2 con = new ConstructorDemo2();
		con.productName ="Shoe";
		con.price=60;
		con.display();

	}

}

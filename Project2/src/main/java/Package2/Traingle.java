package Package2;

public class Traingle {
	int base;
	int height;
	Traingle(int base,int height){
		this.base=base;
		this.height=height;
	}
	public void Area(int base,int height){
		float area = 0.5f*base*height;
	System.out.println(area);
	}

	public static void main(String[] args) {
		Traingle tr = new Traingle(5,5);
				tr.Area(5,5);
		

	}

}

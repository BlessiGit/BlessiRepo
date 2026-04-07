package Package2;

public class SecondDemo {
	String name;
	int age;
	float mark;
	
	SecondDemo(){
	this("Riya",9,2.1f);
	System.out.println("DC");
	}
	
	SecondDemo(String name,int age,float mark){
		this.name=name;
		this.age=age;
		this.mark=mark;
		System.out.println(name);
		System.out.println(age);
		System.out.println(mark);
	}

	public static void main(String[] args) {
		SecondDemo stu = new SecondDemo();

	}

}

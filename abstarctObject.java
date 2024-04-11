abstract class TestOne{
	static void calculateSquare(int x){
		System.out.println("Method in Absrtact class and Square is-->"+x*x);
	}
	public static void main(String args[]){
		TestOne T1=new TestOne(6);
		calculateSquare(3);
	}
}


abstract class TestOne{
	void calculateSquare(int x){}
}

class Access extends TestOne{
	void calculateSquare(int x){
		int res=x*x;
		System.out.println("Square of Number is -->"+res);
	}
	public static void main(String args[]){
		 Access A1=new Access();
		 A1.calculateSquare(4);
	}
}
/*
abstract class TestOne{
	abstract  void calculateSquare(int x);
}

class Access extends TestOne{
	void calculateSquare(int x){
		int res=x*x;
		System.out.println("Square of Number is -->"+res);
	}
	public static void main(String args[]){
		 Access A1=new Access();
		 A1.calculateSquare(4);
	}
}
*/

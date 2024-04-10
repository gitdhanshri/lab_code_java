abstract class MyClass{
	abstract double calculate(double x);
}
class sub1 extends MyClass{
	//find square 
	double calculate(double num){
	System.out.print("Square of Number is -->");
		return num*num;
	}
}
class sub2 extends MyClass{
	//find square root
	double calculate(double num){
		System.out.print("Square root is-->");
		return Math.sqrt(num);
	}
}
class sub3 extends MyClass{
	//find  Cube
	double calculate(double num){
	System.out.print("Cube of Number is -->");
		return num*num*num;
	}
}
class AccessAllClasses{
	public static void main(String args[]){
		AccessAllClasses A1=new AccessAllClasses();
		sub1 s1=new sub1();
		sub2 s2=new sub2();
		sub3 s3=new sub3();
		System.out.println(s1.calculate(4));
		System.out.println(s2.calculate(16));
		System.out.println(s3.calculate(4));
	}
}

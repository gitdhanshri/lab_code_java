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
		sub1 obj1=new sub1();
		sub2 obj2=new sub2();
		sub3 obj3=new sub3();
		System.out.println(obj1.calculate(4));
		System.out.println(obj2.calculate(169));
		System.out.println(obj3.calculate(4));
		MyClass ref1,ref2,ref3;// ref1,ref2,ref3 is refference to class 
		// ref is refference to  obj1
		ref1=obj1;
		ref2=obj2;
		ref3=obj3;
		System.out.println("\n\n");
		//Accessing an from Refrrence Variable
		System.out.println(ref1.calculate(4));
		System.out.println(ref2.calculate(169));
		System.out.println(ref3.calculate(4));
		
	}
}

class Father{

	int m;
	Division d1;
	 Multiply m1=null;
	Father(Division obj1){
		this.d1=obj1;
	}
	
	Father(Multiply obj2){
		this.m1=obj2;
	}
	void  callToOdivison(){
		d1.div(20,5);
	}
	void  callToMultiplictn(){
		m1.mul(20,5);

	}

	/*public static void main (String args[]){
		Multiply m1=new Multiply();
		Father f1=new Father(m1);
		f1.sum();
		f1.add(20);
	}*/
}
class Multiply{
	int mul(int a,int b){
		System.out.println("multiplication is -->"+a*b);
		return a*b;
	}
	public static void main (String args[]){
		Division d1=new Division();
		Multiply m1=new Multiply();
		Father f1=new Father(d1);
		Father f2=new Father(m1);
		f1.callToOdivison();
		f2.callToMultiplictn();
	}
}
	
class Division{
	int div(int a,int b){
		System.out.println("Division is -->"+(a/b));
		return a*b;
	}
}
	

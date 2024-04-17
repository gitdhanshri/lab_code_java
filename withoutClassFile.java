class Demo extends SGGS{
	void Method1(){
		System.out.println("Inside Demo Class :inside Method 1");
	}
	public static void main(String args[]){
		Demo demo=new Demo();
		SGGS sggs =new SGGS();
		demo.Method1();
		sggs.dhanu();
		demo.dhanu();
		//sggs.Method1();
		
	} 
}

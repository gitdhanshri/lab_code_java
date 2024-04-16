class Demo{
	int Number ;
	Demo(int x){
		Demo.this.Number=x;
	}	
	//Demo obj1=new Demo(24);
	public static void main(String args[]){
		Demo obj1=new Demo(24);
		try{
			System.out.println("In Try Block");
			//Demo obj2=new Demo(24);
			System.gc();
			System.out.println(args[0]);
			//obj2=new Demo(24);
			System.out.println("After  gc counter");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}


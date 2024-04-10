class ExceptionHandleBytry{
	public static void main(String ...args){
		try{
			Thread.sleep(1000);
			System.out.println("Opening the files");
			int n=args.length;
			Thread.sleep(2000);
			System.out.println("Value of n ->"+n);
			int a =45/n;
			Thread.sleep(3000);
			System.out.println("Value of a->"+a);
		}
		catch(InterruptedException a){
			System.out.println(a);
			a.printStackTrace();
			
		}
		catch(ArithmeticException e){
			//System.out.println(e);
			e.printStackTrace();
		}
		
		finally{
			System.out.println("Close the files");
		}
		try{
			int b[]={10,20,30};
			b[50]=100;
		}
		catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
		}
	
	}
}

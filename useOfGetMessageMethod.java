//Java program to Demonstrate the getMessage() method.
import java.lang.Throwable;
class TestExcetion{
	void divide()throws ArrayIndexOutOfBoundsException{
		//int c=a/b;
		int[] arr={1};
		//System.out.println("Result ->:"+c);
		System.out.println("Result ->:"+arr[1]);
		
	}
	public String toString(){
		return "Result:"+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	public static void main(String args[])throws ArrayIndexOutOfBoundsException{
	
		TestExcetion t1=new TestExcetion();
		//System.out.println("Address of Object:->"+t1);
		try{
			t1.divide();
			
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			//System.out.println(e);
			//System.out.println("Message String="+e.getMessage());
			//System.out.println("Message  toString Method => "+e.toString());
		}
	}
} 
//throws Exception

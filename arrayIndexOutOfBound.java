class ArrayIndex{
	public static void main(String args[])throws Exception{
		int arr[]={10,20,30,23,12,24,43};
		System.out.println(arr[0]);
		try{
			System.out.println(arr[-1]);
		}
		catch(Exception e){
			
		}
		System.out.println(arr[1]);
	}
}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 7
	at ArrayIndex.main(arrayIndexOutOfBound.java:5)
*/

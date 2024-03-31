class BlockOfAfterException{
	public static void main(String args[]){
		ExceptionByZero E1=new ExceptionByZero();
		int num=10;
		System.out.println(num);
		int num2=num/0;
		System.out.println(num2);
		System.out.println("Here we got an Exception");
		System.out.println("Found Exception--> thread main java.lang.ArithmeticException: / by zero");
	}
}

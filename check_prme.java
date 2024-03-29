class PrimeNumbers{ 
	static int prime_count=0;
	static int non_prime_count=0;
	boolean isPrime(long num){
		if(num<2){
			return false;
		}
		if(num==2||num==3){
			return true;
		}
		if(num%2==0||num%3==0){
			return false;
		}
		
	 	for(int i=5;i<=num;i=i+6){
			if(num%i==0&&num%(i+2)==0){
				return false;
		}
		else{
			return true;
		}
	}
	     	return false;
	}
	long  random_7_digit_num(){
	//random_1_digit()
		long res=0;
		for(int i=0;i<7;i++){
			res=res*10+random_1_digit();
		
		}
		return res;
	}public static long random_1_digit(){
		long num=(System.nanoTime()%10);
		return num;
	}
	long[] store_random_number_in_arary(long numberTotalGeneratedNum){
		long  arr[]=new long[(int)numberTotalGeneratedNum];
		for(long i=0;i<numberTotalGeneratedNum;i++){
		arr[(int)i]=random_7_digit_num();
		}
		return arr;
	}

	//count prime and non-prime numers
	long approach1(long [] arr){
		for(int i=0;i<arr.length;i++){
			if(isPrime(arr[i])){
				prime_count++;
			}
		 else{
			non_prime_count++;
		 }
		 }
		return prime_count;
	}
	long approach2(long [] arr){
		long prime=0,nonPrime=0;
		for(int i=0;i<arr.length;i++){
			if(!(isPrime(arr[i]))){
				nonPrime++;
			}
		 else{
			prime++;
		 }
		 }
		return prime;
	}
	void printArray(long[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				continue;
			}
			else{				  
			System.out.println(arr[i]);
			}
		}
	System.out.println();
	}
	long[] printArrayOfPrimeNumbers(long[] arr){
		long  str[]=new long[(int)arr.length];
		int k=0;
		System.out.println("Prime Numbers are-->");
		for(int i=0;i<arr.length;i++){
			if(isPrime(arr[i])==true){
				str[k]=arr[i];
				k++;
			}
		}
		System.out.println();
		return str;
	}
	long averageOfTime(long[] arr){
		long sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		long average=sum/arr.length;
		return average;
	}
	public static void main(String[] args){ 
	PrimeNumbers p1=new PrimeNumbers();
	long sizeTotalGeneratedNum=1000000;
    	long str[]=p1.store_random_number_in_arary(sizeTotalGeneratedNum);
    	//p1.printArray(str);
    	/*long primearr[]=p1.printArrayOfPrimeNumbers(str);
    	p1.printArray(primearr);*/
    	long startTime,endTime;
    	int i=0;
    	int size=10;
    	long arr1[]=new long[(int)size];
        long arr2[]=new long[(int)size];
        
    	while(i<10){
    		startTime=System.nanoTime();
		p1.approach1(str);
    	 	endTime=System.nanoTime();
    	 	arr1[i]=endTime-startTime;

		startTime=System.nanoTime();
		p1.approach2(str);
    	 	endTime=System.nanoTime();
    	 	arr2[i]=endTime-startTime;
		i++;
	}
	System.out.println(p1.averageOfTime(arr1));
	System.out.println(p1.averageOfTime(arr2));
}
}
	


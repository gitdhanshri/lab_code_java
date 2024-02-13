class SY{ 
//int random_number;
static int prime_count=0;
static int non_prime_count=0;
public static boolean isPrime(long num){
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
public static long  random_7_digit_num(){

	long number_of_7_digits=(random_1_digit()*1000000)+(100000*random_1_digit())+(10000*random_1_digit())+(1000*random_1_digit())+(100*random_1_digit())+(10*random_1_digit())+(1*random_1_digit());
//System.out.println(number_of_7_digits);
        return number_of_7_digits ;
}
//count prime and non-prime numers
public static void count_prime_and_non_primes(long [] array){
	
	for(int i=0;i<array.length;i++){
		if(isPrime(array[i])){
			prime_count++;
		}
	 
	 else{
		non_prime_count++;
	 }
	 }
	
}
public static long[] store_random_number_in_arary(){
	long  arr[]=new long[100];
	for(int i=0;i<50;i++){
	arr[i]=random_7_digit_num();
	}
	return arr;
}
public static long random_1_digit(){
        long num=(System.nanoTime()%10);
	return num;
}
    public static void main(String[] args) 
    { 
    	long arr2[]=store_random_number_in_arary();
    	int i=0;
    	while(i<5){
    	 long start_time=System.nanoTime();

    	 count_prime_and_non_primes(arr2);
    	 
         long end_time=System.nanoTime();
         System.out.print("count of prime numbers-->");
	 System.out.println(prime_count);
	 System.out.print("count of  non-prime numbers-->");
         System.out.println(non_prime_count); 
       
	System.out.println("time taken "+((end_time)-start_time));
	prime_count=0;
	non_prime_count=0;
	i++;
	}
}
}	


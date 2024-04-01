class PrimeCount{
static int primeCount=0;
 static int nonPrimeCount=0;
 boolean isPrime(long num){
 	if(num<2){
 		return false;
 	}
  	else if(num==2||num==3){
 		return true;
 	}
   	else if(num%2==0||num%3==0){
 		return false;
 	}
 	for(int i=5;i<num;i=i+6){
 		if(num%i==0||num%(i+2)==0){
 			return false;
 		}
 		else
 		{
 			return true;
 		}
	
 	}
 	 return true;
 }
  long generate_1_digit_number(){

 	long n1=System.nanoTime();
 	/*System.out.println("inside  function-->"+n1);*/
 	long num=(n1%10);
 	return num;
 }
 
long generate_7_digit_number(){
	long res=0;
	for(int i=0;i<7;i++){
		res=res*10+(generate_1_digit_number());	
	}
	return res;
}
long[] generateArrayOf1KAndStoreNumers(){
	long[] arr= new long[100];
 
	for(int i=0;i<100;i++){
		arr[i]=generate_7_digit_number();
	}
	return arr;
}
 void  countPrimeNumbersBy_Ifelse(long arr[]){
	for(int i=0;i<arr.length;i++){
		if(isPrime(arr[i])==true){
			primeCount++;
		}
		else{
			 nonPrimeCount++;
		}
	}
}
 void  countPrimeNumbersBy_elseIf(long arr[]){
	for(int i=0;i<arr.length;i++){
		if(isPrime(arr[i])!=true){
			nonPrimeCount++;
		}
		else{
			 primeCount++;
		}
	}
}
long averageTime(long []arr){
	long sum=0;
	for(int i=0;i<arr.length;i++){
		sum+=arr[i];
	}
	long avg=sum/arr.length;
	return avg;
}
public static void main(String args[]){
	PrimeCount P1=new PrimeCount();
	long[] arr=P1.generateArrayOf1KAndStoreNumers();

	
	int i=0;
	long start_time,end_time;
	long arr1[]=new long[100];
	long arr2[]=new long[100];
    	while(i<50){
    		/*Approach 1*/
	    	start_time=System.nanoTime();
	    	P1.countPrimeNumbersBy_Ifelse(arr);
		end_time=System.nanoTime();
		arr1[i]=end_time-start_time;
		primeCount=0;
		nonPrimeCount=0;
		/*//Approach 2//*/  
		start_time=System.nanoTime();
		P1.countPrimeNumbersBy_elseIf(arr);
		end_time=System.nanoTime();
		arr2[i]=end_time-start_time;
		primeCount=0;
		nonPrimeCount=0;
		i++;
	}
	long time1=P1.averageTime(arr1);
	long time2=P1.averageTime(arr2);
	System.out.println("Time taken By Approach 1-->"+time1);
	System.out.println("Time taken By Approach 2-->"+time2);
	
}
}


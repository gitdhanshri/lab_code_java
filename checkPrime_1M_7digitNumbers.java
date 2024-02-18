class prime{
static int primeCount=0;
 static int nonPrimeCount=0;
public static boolean isPrime(long num){
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
 public static long generate_1_digit_number(){

 	long n1=System.nanoTime();
 	/*System.out.println("inside  function-->"+n1);*/
 	long num=(n1%10);
 	return num;
 }
 
public static long generate_7_digit_number(){
	long res=0;
	for(int i=0;i<7;i++){
		res=res*10+(generate_1_digit_number());	
	}
	return res;
}
public static long[] generateArrayOf1KAndStoreNumers(){
	long[] arr= new long[1000000];
 
	for(int i=0;i<1000000;i++){
		arr[i]=generate_7_digit_number();
	}
	return arr;
}
public static void  countPrimeNumbersBy_Ifelse(long arr[]){
	for(int i=0;i<arr.length;i++){
		if(isPrime(arr[i])==true){
			primeCount++;
		}
		else{
			 nonPrimeCount++;
		}
	}
}
public static void  countPrimeNumbersBy_elseIf(long arr[]){
	for(int i=0;i<arr.length;i++){
		if(isPrime(arr[i])!=true){
			nonPrimeCount++;
		}
		else{
			 primeCount++;
		}
	}
}
public static void main(String args[]){

long[] arr=generateArrayOf1KAndStoreNumers();
	/*Approach 1*/
	int i=0;
    	while(i<5){
    	long start_time=System.nanoTime();
	countPrimeNumbersBy_Ifelse(arr);
	 long end_time=System.nanoTime();
	System.out.print("\nPrime count       :  "+primeCount);
	System.out.print("\nNon-Prime couont  :  "+nonPrimeCount);
	System.out.print("\nTime Difference   :  "+(end_time-start_time));
	primeCount=0;
	nonPrimeCount=0;
	i++;
	System.out.print(" \n");
	}
	System.out.print("\n \n");
 	/*//Approach 2//*/
	System.out.print(" \nSecond Approach-->");
	int j=0;
    	while(j<5){
        long start_time=System.nanoTime();
	countPrimeNumbersBy_elseIf(arr);
	long end_time=System.nanoTime();
	System.out.print("\nNon-Prime couont  :  "+nonPrimeCount);
	System.out.print("\nPrime count       :  "+primeCount);
	System.out.print("\nTime Difference   :  "+(end_time-start_time));
	primeCount=0;
	nonPrimeCount=0;
	j++;
	System.out.print(" \n");
	}
}
}

/*approach 1

long start=System.nanoTime();
System.out.print("\n Start Time-->"+start);
System.out.print("\n");
while(i<5){
	countPrimeNumbersBy_Ifelse(arr);
	System.out.print("\n");
	System.out.print("Prime count-->"+primeCount);
	System.out.print("\nNon-Prime couont-->"+nonPrimeCount);
	primeCount=0;
	nonPrimeCount=0;
	i++;
}
       	long end=System.nanoTime();
	System.out.print("\nEnd  Time-->"+end);
	System.out.print("\nTime Difference :1-->"+(end-start));
	System.out.print("      \n");

*/
/*approach:2
	int j=0;
	System.out.print("\nApproach 2 :by Else-if--->");
	long start2=System.nanoTime();
	System.out.print("\n Start Time-->"+start2);
	
	System.out.print("\n");
	
	while(j<5){
	countPrimeNumbersBy_elseIf(arr);
	System.out.print("Prime count-->"+primeCount);
	System.out.print("\nNon-Prime couont-->"+nonPrimeCount);
	primeCount=0;
	nonPrimeCount=0;
	j++;
	System.out.print("\n");
       }
       
       	long end2=System.nanoTime();
	System.out.print("\nEnd  Time-->"+end2);
	System.out.print("\nTime Difference : 2-->"+(end2-start2));
	
	

	System.out.print("      \n");
}*/

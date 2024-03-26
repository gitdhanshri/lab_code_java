class CountValidString{
	String getRandomString(){
		String str="";
			str=str+'2';
			str=str+'0';
			for(int i=2;i<4;i++){
				int num1=(int)System.nanoTime()%10;
				str=str+num1;
			}
			String branchcode[]={"bit", "BIT", "BCS", "bcs", "BME", "bme", "BCH", "bch"};
			int index=(int)(System.nanoTime()%8);
			str=str+branchcode[index];
					
			for(int i=8;i<=10;i++){
				int num2= (int)System.nanoTime()%10;
				str=str+num2;
			}
	return str;		
	}
	boolean validString(String s1) {
		boolean fun1 = last_3_digits(s1);
		boolean fun2 = branchCode(s1);
		boolean fun3 = first4Digits(s1);
	 	 if (s1.length() == 10 && fun1 == true && fun2 == true && fun3 ==true ) {
		    return true;
		} 
		else {
		    return false;
		}
  	}
       boolean  first4Digits(String s1) {
       		if (s1.length() == 10) {
		    if (s1.charAt(0)=='2' && s1.charAt(1)=='0' && s1.charAt(2)=='1'&& s1.charAt(3)>='0') {
		        return true;
		    } else {
		        return false;
		    }
		}
	     return false;
        }
	boolean branchCode(String s1) {
	       String d1 = s1.substring(4, 7);
	       String[] validStrings = {"bit", "BIT", "BCS", "bcs", "BME", "bme", "BCH", "bch"};

	       for (String str : validStrings) {
		    if (d1.equals(str)) {
		        return true;
		    }
		}
	       return false;
        }
        boolean last_3_digits(String s1) {
		if (s1.length() == 10) {
			if (s1.charAt(7) >='0'&&s1.charAt(7) <='9'){
				 if(s1.charAt(8)<='9'&&s1.charAt(8)>='0'){
						 if(s1.charAt(9) <='9'&&s1.charAt(9) >='0'){
							return true;
						  }
						  
						 else{
						 	return false;
						 }
				  }
			         else {
					return false;
			         }
			 }
		        else {
		      	 	return  false;
		        }
		}
		else{
			return  false;
		}
	 }
	 long countOfValidStringApproch1(String[] arr,int size){
	 	long validCount=0;
	 	long inValidCount=0;
	 	int  i=0;
	 	while(i<size){
		 	if(validString(arr[i])){
		 		validCount++;
		 	}
		 	else{
		 		inValidCount++;
		 	}
		 	i++;
		}
		return  validCount;	
	 } 
 	long countOfValidStringApproch2(String[] arr,int size){
	 	long validCount=0;
	 	long inValidCount=0;
	 	int  i=0;
	 	while(i<size){
		 	if(!validString(arr[i])){	
				inValidCount++;
		 	}
		 	else{
		 		validCount++;
		 	}
		 	i++;
		}
		return  validCount;	
	 
	 } 
	 String[] store1kStringInStringArray(int sizeOfString){
	 	String[] str=new String[sizeOfString];
	 	for(int i=0;i<sizeOfString;i++){
	 		str[i]=getRandomString();
	 	}
	 	
	 return str;
	 }
	 void printAllStrings(String[] arr){
	 	for(int i=0;i<arr.length;i++){
	 		System.out.println(arr[i]);
	 	}
	 }
	 long averageIfTime(long[] arr){
	 	long sum=0;
	 	for(int i=0;i<arr.length;i++){
	 		sum+=arr[i];
	 	}
	 	long average=sum/(arr.length);
	 	return average;
	 }
	public static void main(String args[]){
		CountValidString obj1=new CountValidString();
		int sizeOfStringArray=1000;
		String[] w1=obj1.store1kStringInStringArray(sizeOfStringArray);
		int i=0;
		/*long res1=obj1.countOfValidStringApproch1(w1,1000);
		long res2=obj1.countOfValidStringApproch2(w1,1000);   
		*/
		int size=20;
		long[] arr1=new long[size];
		long[] arr2=new long[size];
		long startTime,endTime;
		while(i<1){
			for(int j=0;j<size;j++){
				startTime=System.nanoTime();
				obj1.countOfValidStringApproch1(w1,sizeOfStringArray);
				endTime=System.nanoTime();
				arr1[j]=endTime-startTime;
			}
			for(int j=0;j<size;j++){
				startTime=System.nanoTime();
				obj1.countOfValidStringApproch2(w1,sizeOfStringArray);
				endTime=System.nanoTime();
				arr2[j]=endTime-startTime;
			}
			i++;
		}
		long time1=obj1.averageIfTime(arr1);
		long time2=obj1.averageIfTime(arr2);	
		System.out.println("For Approach 1: "+time1);
		System.out.println("For Approach 2: "+time2);
	}
}

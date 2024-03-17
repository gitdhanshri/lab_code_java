class calsi{

	double addition(double a,double b){
		return a+b;
	}
	double subtracrion(double a,double b){
		return a-b;
	}
	double multiplication(double a,double b){
		return a*b;
	}
	double division(double a,double b){
		if(b==0){
			return 0;
		}
		else{
			return  a/b;
		}
	}
	double square(double a){
		return a*a;
	}
	double cube(double a){
		return a*a*a;
	}
	
	double squareRoot(double a){
		double num=a;
		for(int i=0;i<a;i++){
			if(i*i==num){
				return i;
			}
		}
		return -1;
	}
	double cubeRoot(double a){
		double num=a;
		for(int i=0;i<a;i++){
			if(i*i*i==num){
				return i;
			}
		}
		return -1;
	}
	
	double modulus(double a,double b){

		return a%b;
	}
	double percentage(double a,double b){
		//a=50,b=2
		return (a*b/100);
	}
	double powerFunction(int base,int power){
		double res=1;
		for(int i=1;i<=power;i++){
			res=res*base;	
		}
		return res;
	}
	double logArithmetic(double base, double input){
		double res=1;
		for(int i=1;i<=input;i++){
			res=res*base;	
			if(input==res){
				return i;
			}
		}
		return -1;
	}
	double modValue(double num){
		if(num>0){
			return num;
		}
		else if(num==0){
			return 0;
		}	
		else{
			return -1*num;
		}
	}
	static int min(int a,int b){
		if(a<b){
			return a;
		}
		else{
			return b;
		}
	}
	static int max(int a,int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
	void  generatefraction(int n1,int n2){
		int minnum=min(n1,n2);
		int i;
		for( i=min(n1,n2);i>0;i--){
			if(n1%i==0&&n2%i==0){
				System.out.println((n1/i)+"/"+(n2/i));
				//res =((n1/i)+"/"+(n2/i));
				break;
			}
		}
		//return (float)((n1/i)+"/"+(n2/i));
	}
	void mixFraction(int a,int b){
		if(b==0){
			System.out.println("can not be divided by 0");
		}
		int quotient=a/b;
		int rem=a%b;
		//System.out.println(rem);
		//System.out.println(quotient);
		//System.out.println(quotient+"_"+rem+"/"+b);
		//System.out.println(min(rem,b));
		for(int i=min(rem,b);i>0;i--){
			if(rem%i==0&&b%i==0){
				System.out.println(quotient+"_"+(rem/i)+"/"+(b/i));
				break;
			}
		}
	
	}
	public static void main(String args[]){
		calsi c1=new calsi();
		//1:addition
		//double res1=c1.a(1000);	
		//System.out.println("sq-root:"+res);
		//double res=c1.cubeRoot(1000);	
		//System.out.println("sq-root:"+res);
		//double res=c1.percentage(50,4);	
		//System.out.println("percentage->:"+res);
		//double res=c1.powerFunction(2,4);	
		//System.out.println("power function->:"+res);
		//double num=c1.modValue(-231);
		//System.out.println(num);
		//for finding an fraction of two number
		//System.out.println(c1.generatefraction(15,25));
		//c1.generatefraction(225,321);
		//for finding an mixed fration
		c1.mixFraction(20,8);
	}	
}

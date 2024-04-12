abstract class Electricity{
	double rate;
	Electricity(double r){
		this.rate=r;
	}
	void getRate(double x){
	
	}
}
class Commercial extends Electricity{
	Commercial(double rate){
		super(rate);
	}
	void getRate(double rate){
		System.out.println("The Rate for Commercial purpose is-->"+rate);
	}
}
class Domestic extends Electricity{
	Domestic(double rate){
		super(rate);
	}
	void getRate(double rate){
		System.out.println("The Rate for Domestic purpose is-->"+rate);
	}	
}
class Access{
	public static void main(String args[]){
		Electricity e1,e2;
		Commercial c1=new Commercial(12);
		Domestic d1=new Domestic(17);
		
		e1=c1;
		e1.getRate(10);
		e2=d1;
		e2.getRate(122);
	}
}

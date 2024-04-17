interface vc{
	void castVote();
}
interface Ec{
	void validityForVoter();
}

class ECIndia implements vc,Ec  {
	int age;
	ECIndia(int a){
		this.age=a;
	}
	public void  castVote(){
		System.out.println("Inside CastVote Of India");
	}
	public void validityForVoter()throws OwnException1{
		if(age<18){
		OwnException1 ei=new OwnException1("Invalid Voter In India"+"required Age-->"+age);
			//System.out.println("Invalid Voter In India"+"required Age-->"+age);
			throw ei;
		}
	}
}
class ECBrazil implements vc,Ec{
	int age;
	ECBrazil(int a){
		this.age=a;
	}
	public void castVote(){
		System.out.println("Inside CastVote Of Brazil");
	}
	public void validityForVoter(){
		if(age<21){
			//throw OwnException("Invalid Voter In Brazil"+"required Age-->"+age);
	OwnException1 eb=new OwnException1("Invalid Voter In Brazil"+"required Age-->"+age);
			//System.out.println("Invalid Voter In India"+"required Age-->"+age);
			throw eb;
		}
	}
}

class Demo{
	public static void main(String args[]){
		Demo demo=new Demo();
		ECBrazil brazil=new ECBrazil(21);
		ECIndia india=new ECIndia(18);
		
		brazil.validityForVoter(23);
		//india.validityForVoter(12);
		
		
	}
}
class OwnException1 extends RuntimeException{
	//OwnException1(){}
	OwnException1(String error){
		super(error);
	}
}
class OwnException2 extends RuntimeException{
	//OwnException2(){}
	OwnException2(String error){
		super(error);
	}
}


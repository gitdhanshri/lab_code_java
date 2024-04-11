abstract class CarDivision{
	String resNumber;
	CarDivision(String r){
		this.resNumber=r;
	}

	void openTank(){
		System.out.println("Open The Tank -->");
	}
	void PrintResNumber(){
		
	}
	abstract void Steering(int direction,int angle);
	abstract void Breaking(int force);
	public static void main(String args[]){
		//CarDivision C1=new CarDivision();
		//C1.openTank();
	}
}
class Maruti extends CarDivision{
	Maruti(String resNumber){
		super(resNumber);
	}
	void PrintResNumber(){
		System.out.println("Resistration Number of Maruti's  Car-->"+resNumber);	
	}
		
	 void Steering(int direction,int angle){
	 	System.out.println("plz Take Turn ");
		System.out.println("This is an Ordinary Strearing!!!");
	 }
	 void Breaking(int force){
	 	System.out.println(" Breaks Applied-->");
	 	System.out.println("These are Hydraulic Breaks!!!");
	 }
	
}
class Santro extends CarDivision{
	//String regnum;
	Santro(String r){
		super(r);

	}
	void PrintResNumber(){
		System.out.println("Resistration Number  This SanTro Car-->"+resNumber);	
	}
	
	 void Steering(int direction,int angle){
	 	System.out.println("plz Take Turn ");
		System.out.println("This is Car uses Power Strerring-->");
	 }
	 void Breaking(int force){
	 	System.out.println(" Breaks Applied-->");
	 	System.out.println("Break System used in This car is   GAS breaks!!!");
	 }
}
class CarUsers{
	public static void main(String args[]){
		//CarUsers C1=new CarUsers();
		Santro s1=new Santro("2022Bit049");
		Maruti m1=new Maruti("2023bit507");
//for Santro Car
		s1.PrintResNumber();
		s1.Steering(10,12);
		s1.Breaking(100);
//for Maruti Car	
		m1.PrintResNumber();
		m1.Steering(14,16);
		m1.Breaking(40);
	}
}

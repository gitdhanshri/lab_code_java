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
	void Swing(){
		System.out.println("It Can Run Without Petrol");
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
		//Creating an refference for  Santro Car
		CarDivision c1=s1;
		//for Santro Car
		
		c1.PrintResNumber();
		c1.Steering(10,12);
		c1.Breaking(100);
		c1.Swing();
		//for Maruti Car	
		//Creating an refference for  Maruti Car
		
	/*	CarDivision c2=m1;
		m1.PrintResNumber();
		m1.Steering(14,16);
		m1.Breaking(40);	*/
	}
}

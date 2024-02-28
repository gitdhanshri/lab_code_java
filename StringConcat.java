class student{
	
	student(String s1){
	 System.out.println(s1);
	}
	void printName(String s1){
		System.out.println(s1);
	}
	public static void main(String args[]){
	
	/*String s1="Dhanshri";
	String  s2="Dhanshri";
		String s3="Baswade";*/
	
	student s1=new student("sggs");
	System.out.println("Address of object 1-->"+s1);	
	student obj1=new student("Dhanshri");
	System.out.println("Address of object 2-->"+obj1);	
	
	student obj2=new student("college");
	System.out.println("Address of object 3-->"+obj2);
	
	student obj3=new student("sggs");
	System.out.println("Address of object 4-->"+obj3);	
	
	student obj4=new student("college");
	System.out.println("Address of object 5-->"+obj4);
	student obj5=new student("sggs");
	System.out.println("Address of object 6-->"+obj5);	
	
	}
}

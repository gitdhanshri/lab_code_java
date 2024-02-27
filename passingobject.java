class College{
	int x=100;
	int y=200;
	student s1;
	SGGS s2;
College(student obj1,SGGS obj2 ){
		this.s1=obj1;
		this.s2=obj2;
}
	int findCube(int a){
		int res=a*s1.findSquare(a);
		return res;
	}
	
}
class student{
	SGGS s1;
	student(SGGS obj1){
		this.s1=obj1;
	}
	int findSquare(int a){
		int res=a*(s1.singleValue(a));
		return res;
	}	
}
class SGGS{
	int singleValue(int a){
		return a;
	}
}
class Total{
	public static void main(String args[]){
	SGGS sggs=new SGGS();
	student s1=new student(sggs);
	
	College c1=new College(s1,sggs);
	System.out.println("value of a "+sggs.singleValue(10));
	System.out.println("square is "+s1.findSquare(10));
	System.out.println("square is "+c1.findCube(10));
	
}
}

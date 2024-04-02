import java.util.Scanner;
import java.util.*; 
class Parent{
	long mobNumber;
	void getMobNumber(long num){
		this.mobNumber=num;
	}
	/*void printArray(long[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
	}*/
	long[] createArraytoStoreBookNumber(){
		int num=1;
		long[] arr=new long[1000];
		for(int i=0;i<1000;i++){
			arr[i]=num;
			num++;
		}
		return arr;
	} 
	boolean isAvaiableBook(long bookNum){
		long arr[]=createArraytoStoreBookNumber();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==bookNum){
				return true;
			}
		}
		return false;
			
	}
	void displayMobNum(){
		System.out.println("Mobile Number is->"+mobNumber);
	}
}
//	class 1
class faculty{
	String nameOfProfessor;
	String IdNumber;
	String dept;
	void getStudentNameFaculty(String name){
		this.nameOfProfessor=name;
	}
	void displayStudentName(){
		System.out.println("Name of Student-->"+nameOfProfessor);
	}
	void getDeptName(String name){
		this.dept=name;
	}
	void displayDeptName(){
		System.out.println("Name of Student-->"+dept);
	}
	void getIdNumber(String num){
		this.IdNumber=num;
	}
	void displayIdNumber(){
		System.out.println("Id Number of Faculty -->"+IdNumber);
	}	
}
//class 2
class Student{
	String nameOfStudent;
	String branchCode;
	int yearOfStudent;
	String resNumberOfStudent;
	
	
	void getStudentName(String name){
		this.nameOfStudent=name;
	}
	void getStudentBranch(String branch){
		this.branchCode=branch;
	}
	void getyearOfStudent(int y){
		this.yearOfStudent=y;
	}
	void getRegistrationNumber(String resNum){
		this.resNumberOfStudent=resNum;
	}
	//for displaying an Outputs
	void displayStudentName(){
		System.out.println("Name of Student-->"+nameOfStudent);
	}
	void displayStudentBranch(){
		System.out.println("Branch Name of Student->"+branchCode);
	}
	void displayyearOfStudent(){
		System.out.println("Year Of Student-->"+yearOfStudent);
	}
	void displayRegistrationNumber(){
	System.out.println("Registration Number Of Student->"+resNumberOfStudent);
	}
	
}
//class 3
class Book{
	String BookName;
	String BookAuthor;
	long publication;
	long Edition;
	long NumberOfPages;
	//1
	void getBookName(String bookName){
		this.BookName=bookName;
	}
	// 2 nd
	void getAuthorName(String A_name){
		this.BookAuthor=A_name;
	}
	// 3 rd
	void getPublication(long publica_tion){
		this.publication=publica_tion;
	}
	// 4th
	void getEdition(long edition){
		this.Edition=edition;
	}  
	//5 th
	void getNuberOfPages(long pages){
		this.NumberOfPages=pages;
	}  	
	//for displaying an Output
	void displayNameOfBook(){
		System.out.println("Name of Book->"+BookName);
	}
	void displayNameOfBookAuhtor(){
		System.out.println("Name of Book  Author >"+BookAuthor);
	}
	void displayEdition(){
		System.out.println("Edition  of Book  ->"+Edition);
	}
	void displayPublication(){
		System.out.println("Pubication Of Book  ->"+publication);
	}
	void displayBookNumber(){
		System.out.println("Number of pages in Book->"+NumberOfPages);
	}
	
}
//class  4
class LibraryStaff{
	Student s1=new Student();
	Parent p1=new Parent();
	Book B1=new Book();
	String NameOfStaff;
	long BookNumber;
	void getBookNuber(long num){
		this.BookNumber=num;
	}
	void getNameOfStaff(String name){
		this.NameOfStaff=name;
	}
	void displayNameOfStaff(){
		System.out.println(NameOfStaff);
	}
	void displayBookNumber(){
		System.out.println("BookNum is-->"+BookNumber);
	}
	void isBookIssued(){
	//first check wether book is available or not
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  BookNumber");
		long bookNum=scanner.nextLong();
		//getBookNuber(bookNum);
		if(p1.isAvaiableBook(bookNum)){
			this.BookNumber=bookNum;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name of Student");
			String name=sc.nextLine();
			
			s1.getStudentName(name);
			
			System.out.println("Enter year of Student->");
			int year=sc.nextInt();
			s1.getyearOfStudent(year);
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter BrachName of Student->");
			String branchName=sc1.nextLine();
			s1.getStudentBranch(branchName);
			Scanner sc2=new Scanner(System.in);
			System.out.println("\nEnter resNumber of Student->");
			String resNumber=sc2.nextLine();
			s1.getRegistrationNumber(resNumber);
			
			
			//for printing an issued msg
			System.out.println("\n\nThe Book is issued to->");
			B1.displayBookNumber();	
			s1.displayRegistrationNumber();
			s1.displayStudentName();	
			s1.displayyearOfStudent();	
		}
	}
	void returnBook(){	
		
	}	
}
class AccesOthers{
	public static void main(String args[]){
		AccesOthers  A1=new AccesOthers();
		LibraryStaff l1=new LibraryStaff();
		Parent p1=new Parent();
		l1.isBookIssued();
	}
}

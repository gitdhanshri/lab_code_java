import java.util.Scanner;
import java.util.*; 
class Parent{
	long mobNumber;
	String StatusOfBookIssuer;
	String nameOfBookIssuer;
	void getMobNumber(long num){
		this.mobNumber=num;
	}
	void getStatusOfBookIssuer(String status){
		this.StatusOfBookIssuer=status;
	}
	void nameOfBookIssuer(String name){
		this.nameOfBookIssuer=name;
	}
	void printArray(long[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	void printStringArray(String[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	long[] createArraytoStoreBookNumber(){
		int num=1;
		long[] arr=new long[100];
		for(int i=0;i<100;i++){
			arr[i]=num;
			num++;
		}
		return arr;
	}
	void displayMobNum(){
		System.out.println("Mobile Number is->"+mobNumber);
	}
	String displayStatusOfBookIssuer(){
		System.out.println("Book Isuser is ->"+StatusOfBookIssuer);
		return StatusOfBookIssuer;
		
	}
	void displayNameIssuer(){
		System.out.println("Book Isuser is ->"+nameOfBookIssuer);
	}
}
//	class 1
class Faculty{
	String nameOfProfessor;
	String IdNumber;
	String dept;
	void getStudentNameFaculty(String name){
		this.nameOfProfessor=name;
	}
	void getDeptName(String name){
		this.dept=name;
	}
	void getIdNumber(String num){
		this.IdNumber=num;
	}
	
	
	void displayNameOfFaculty(){
		System.out.println("Name of Student-->"+nameOfProfessor);
	}
	void displayIdNumber(){
		System.out.println("Id Number of Faculty -->"+IdNumber);
	}
	void displayDeptName(){
		System.out.println("Name of Dept-->"+dept);
	}	
}
//class 2
class Student{
	String nameOfStudent;
	String branchCode;
	int yearOfStudent;
	String addressOfStudent;
	String resNumberOfStudent;
	
	
	void getStudentName(String name){
		this.nameOfStudent=name;
	}
	void getStudentBranch(String branch){
		this.branchCode=branch;
	}
	void getAddressOfStudent(String address){
		this.addressOfStudent=address;
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
	void displayAddressOfStudent(){
	System.out.println("Address  Of Student->"+addressOfStudent);
	}
	
}
//class 3
class Book{
	String BookName;
	String BookAuthor;
	long publication;
	long Edition;
	long BookNum;
	long NumberOfPages;
	long bookPrize;
String[] booksList={"python","c++","c","maths-4","DS","DAA","NT","OS","DBMS","ML","DL","MPI","DSD","GRAPHICS","CORE JAVA"};
	boolean isAvaiableBook(String arr[] ,String bookName){
		for(int i=0;i<arr.length;i++){
		String s=arr[i];
			if(s.equals(bookName)){
				return true;
			}
		}	
		System.out.println("Book is not Avilable in Library");
	return false;		
	}
	//1
	void getBookName(String bookName){
		this.BookName=bookName;
	}
	void getBookNumber(long bookNum){
		this.BookNum=bookNum;
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
	void getPrizeOfBook(long prize){
		this.bookPrize=prize;
	} 
	String[] _Store_Book_After_Issue(String[]  arr,String bookName){
		System.out.println("length original->"+arr.length);
		int length=arr.length-1;
		String[] store_book_after_issue=new String[length];
		int index=-1;
		for(int i=0;i<arr.length;i++){
			String s=arr[i];
			if(s.equals(bookName)){
				index=i;
			}
		}
		System.out.println("index-"+index);
		for(int i=0;i<index;i++){
			store_book_after_issue[i]=arr[i];
		}
		for(int i=index;i<length;i++){
			store_book_after_issue[i]=arr[i+1];
		}
	
		System.out.println("List of books after issued \n");
		for(String x:store_book_after_issue){
			System.out.println(x);
		}
		//b1._Store_Book_After_Issue(b1.booksList,"ML");
	System.out.println("length result->"+store_book_after_issue.length);
	return store_book_after_issue;
	}
	//for displaying an Output
	void displayNameOfBook(){
		System.out.println("Name of Book->"+BookName);
	}
	void displayBookNumber(){
		System.out.println("Book Number is->"+BookNum);
	}
	void displayEdition(){
		System.out.println("Edition  of Book  ->"+Edition);
	}
	void displayPublication(){
		System.out.println("Pubication Of Book  ->"+publication);
	}
	void displayBookAuthor(){
		System.out.println("Name of Book Author->"+BookAuthor);
	}
	void displayNumberOfPagesInBook(){
		System.out.println("Number of pages in Book->"+NumberOfPages);
	}
	void displayPrizeOfBook(){
		System.out.println("Prize of Book  ->"+bookPrize);
	}
	
}
//class  4
class LibraryStaff{
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
	void isBookIssued(Student s1,Parent p1,Book b1,Faculty f1){
		if(b1.isAvaiableBook(b1.booksList,b1.BookName)){	
			String s=p1.displayStatusOfBookIssuer();
			if(s.equals("Faculty")){
				System.out.println("Book  Having ->:");
				b1.displayBookNumber();	
				b1.displayBookAuthor();
				b1.displayPublication();
				b1.displayNumberOfPagesInBook();
				b1.displayPrizeOfBook();
				System.out.println("\nIssued to ->:");
				f1.displayIdNumber();
				f1.displayDeptName();
				f1.displayNameOfFaculty();
				p1.displayMobNum();
				b1._Store_Book_After_Issue(b1.booksList,b1.BookName);
			
			 }
			 else if(s.equals("student")){
				System.out.println("Book  Having ->:");
				b1.displayBookNumber();	
				b1.displayBookAuthor();
				b1.displayPublication();
				b1.displayNumberOfPagesInBook();
				b1.displayPrizeOfBook();	
				System.out.println("\nIssued to ->:");
			 	s1.displayRegistrationNumber();
				s1.displayStudentName();	
				s1.displayyearOfStudent();
				p1.displayMobNum();
				b1.displayNameOfBook();
				s1.displayAddressOfStudent();
				b1._Store_Book_After_Issue(b1.booksList,b1.BookName);
			
			 }
			 else {
			 	System.out.println("Book canot be Issued to Outsider!!");
			 	
			 }
		  }
	}
	String[] returnBook(Student s1,Parent p1,Book b1,String bookName){
		System.out.println("\nBook Returned  is ->:");
		String[] arr=b1.booksList;
		System.out.println(arr.length);
		int length=(arr.length)+1;
		String s[] =new String[length];
		System.out.println(length);
		for(int i=0;i<length-1;i++){
			s[i]=arr[i];
		}
		s[length-1]=bookName;
			p1.displayStatusOfBookIssuer();
			b1.displayBookNumber();	
			b1.displayBookAuthor();
			b1.displayPublication();
			b1.displayNameOfBook();
			b1.displayNumberOfPagesInBook();
			b1.displayPrizeOfBook();	
			System.out.println("\nReturned From->");
			//s1.displayRegistrationNumber();
			s1.displayStudentName();	
			s1.displayyearOfStudent();
		//for displaying an books name after retruning an books
		System.out.println("List of books after returning \n");
			for(String x:s){
				System.out.println(x);
			}
			
	        return s;		
	}	
}
class AccesOthers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Book b1=new Book();
		Faculty f1=new Faculty();
		Student s1=new Student();
		AccesOthers  A1=new AccesOthers();
		LibraryStaff l1=new LibraryStaff();
		Parent p1=new Parent();
		

		p1.getStatusOfBookIssuer("student");
		b1.getBookNumber(99);
		b1.getBookName("DSD");
		s1.getStudentName("Dhanshri");
		s1.getyearOfStudent(2);
		s1.getRegistrationNumber("2022BIT049");
		b1.getAuthorName("Vaidya Mastar");
		b1.getPublication(8);
		b1.getEdition(10);
		b1.getNuberOfPages(200);
		b1.getPrizeOfBook(499);
		f1.getStudentNameFaculty("Shetty Sir");
		f1.getDeptName("IT");
		f1.getIdNumber("IT049");
		p1.getMobNumber(89721565);
		s1.getAddressOfStudent("Hostel");
			//System.out.println("List of books Before issue \n");
			//p1.printStringArray(b1.booksList);
			//l1.isBookIssued(s1,p1,b1,f1);
		//b1._Store_Book_After_Issue(b1.booksList,"DSD");
		//b1._Store_Book_After_Issue(b1.booksList,"NT");
		//b1._Store_Book_After_Issue(b1.booksList,"ML");
		//student s1,Parent p1,Book b1,Faculty f1
			//System.out.println("List of books Before returning Book \n");
			//p1.printStringArray(b1.booksList);
			//l1.returnBook(s1,p1,b1,"COA");
		/*l1.returnBook(s1,p1,b1,"E-Book");
		b1.getBookName("python");
		l1.isBookIssued(s1,p1,b1,f1);
		b1.getBookName("COA");
		l1.isBookIssued(s1,p1,b1,f1);
		*/
			b1.isAvaiableBook(b1.booksList,"PM");
		//boolean res=b1.isAvaiableBook(b1.books,b1.BookName);
		//p1.printArray();
		//System.out.println(p1.isAvaiableBook(b1.BookNum));
		
	
	}
}

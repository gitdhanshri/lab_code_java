import java.util.Scanner;
import java.util.*; 
class BasicInputToAllClass{
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
		System.out.println("Mobile Number is->           "+mobNumber);
	}
	String displayStatusOfBookIssuer(){
		System.out.println("Status of Book Issuer is ->  "+StatusOfBookIssuer);
		return StatusOfBookIssuer;
		
	}
	void displayNameIssuer(){
		System.out.println("Name of Book Isuser is ->     "+nameOfBookIssuer);
	}
}
//	class 1
class Faculty{
	String nameOfProfessor;
	String IdNumber;
	String dept;
	void getNameFaculty(String name){
		this.nameOfProfessor=name;
	}
	void getDeptName(String name){
		this.dept=name;
	}
	void getIdNumber(String num){
		this.IdNumber=num;
	}
	void displayNameOfFaculty(){
		System.out.println("Name of Faculty-->       "+nameOfProfessor);
	}
	void displayIdNumber(){
		System.out.println("Id Number of Faculty --> "+IdNumber);
	}
	void displayDeptName(){
		System.out.println("Name of Department-->     "+dept);
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
		System.out.println("Name of Student-->       "+nameOfStudent);
	}
	void displayStudentBranch(){
		System.out.println("Branch Name of Student->  "+branchCode);
	}
	void displayyearOfStudent(){
		System.out.println("Year Of Student-->        "+yearOfStudent);
	}
	void displayRegistrationNumber(){
	System.out.println("Registration Number Of Student->   "+resNumberOfStudent);
	}
	void displayAddressOfStudent(){
	System.out.println("Address  Of Student->              "+addressOfStudent);
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
				System.out.println("BOOK is available in library");
				return true;
			}
		}	
		System.out.println("Book is not Available in Library");
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
	System.out.println("length result->"+store_book_after_issue.length);
	return store_book_after_issue;
	}
	void displayNameOfBook(){
		System.out.println("Name of Book->           "+BookName);
	}
	void displayBookNumber(){
		System.out.println("Book Number is->         "+BookNum);
	}
	void displayEdition(){
		System.out.println("Edition  of Book->        "+Edition);
	}
	void displayPublication(){
		System.out.println("Pubication Of Book->      "+publication);
	}
	void displayBookAuthor(){
		System.out.println("Name of Book Author->     "+BookAuthor);
	}
	void displayNumberOfPagesInBook(){
		System.out.println("Number of pages in Book->  "+NumberOfPages);
	}
	void displayPrizeOfBook(){
		System.out.println("Prize of Book  ->            "+bookPrize);
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
	void isBookIssued(Student s1,BasicInputToAllClass p1,Book b1,Faculty f1){
		if(b1.isAvaiableBook(b1.booksList,b1.BookName)){	
			String s=p1.displayStatusOfBookIssuer();
			if(s.equals("faculty")){
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
			 }
			 else {
			 	System.out.println("Book canot be Issued to Outsider!!");
			 	
			 }
		  }
	}
	String[] returnBook(Student s1,BasicInputToAllClass p1,Book b1,String bookName){
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
			p1.displayStatusOfBookIssuer();
	        return s;		
	}	
}
class printOtherMethod{
	Book b1=new Book();
	Faculty f1=new Faculty();
	Student s1=new Student();
	//AccesOthers  A1=new AccesOthers();
	LibraryStaff l1=new LibraryStaff();
	BasicInputToAllClass p1=new BasicInputToAllClass();
	void EnterBookDetails(){
		Scanner sc=new Scanner(System.in);
				System.out.print("Enter Book Name->:");
				String bookName=sc.nextLine();
				b1.getBookName(bookName);
				System.out.print("Enter Author of book->:");
				String bookAuthor=sc.nextLine();
				b1.getAuthorName(bookAuthor);
				System.out.print("Enter Book Publication->: ");
				long publictn=Long.parseLong(sc.nextLine());
				b1.getPublication(publictn);
				
				System.out.print("Enter Book Number->: ");
				long bookNum=Long.parseLong(sc.nextLine());
				b1.getBookNumber(bookNum);
				System.out.print("Enter Number of Pages In Book->:");
				long numOfPages=Long.parseLong(sc.nextLine());
				b1.getNuberOfPages(numOfPages);
				System.out.print("Enter Price of Book->:");
				long prizeOfBook=Long.parseLong(sc.nextLine());
				b1.getPrizeOfBook(prizeOfBook);
	}
	void bookIssuedByStudent(){
			Scanner sc=new Scanner(System.in);
				p1.getStatusOfBookIssuer("student");
				System.out.print("Enter  name of Student ->:");
				String name1=sc.nextLine();
				s1.getStudentName(name1);
				System.out.print("Enter registration number->:");
				String regnum=sc.nextLine();
				s1.getRegistrationNumber(regnum);
				System.out.print("Enter branch Of Student->:");
				String branch=sc.nextLine();
				s1.getStudentBranch(branch);
				System.out.print("Enter year student ->:");
				int year=Integer.parseInt(sc.nextLine());
				s1.getyearOfStudent(year);
				System.out.print("Enter Address of student ->:");
				String address=sc.nextLine();
				s1.getAddressOfStudent(address);
				System.out.print("Enter mobile Number->:");
				long mobnum=Long.parseLong(sc.nextLine());
				p1.getMobNumber(mobnum);
				EnterBookDetails();  System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Msg of BOOk Issue");
				l1.isBookIssued(s1,p1,b1,f1);
	}
		void bookIssuedByFaculty(){
				Scanner sc1=new Scanner(System.in);
				p1.getStatusOfBookIssuer("faculty");
				System.out.print("Enter  name of faculty->:");
				String name2=sc1.nextLine();
				f1.getNameFaculty(name2);
				System.out.print("Enter DepartMent Name of faculty->:");
				String dept2=sc1.nextLine();
				f1.getDeptName(dept2);
				System.out.print("Enter Id of Faculty->:");
				String idfaculty=sc1.nextLine();
				f1.getIdNumber(idfaculty);
				System.out.print("Enter Mobule  number of Faculty->:");
				long mobNum=Long.parseLong(sc1.nextLine());
				p1.getMobNumber(mobNum);
				EnterBookDetails();
System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Msg of BOOk Issue");
				l1.isBookIssued(s1,p1,b1,f1);
		}
		void bookReturn(){
				Scanner sc2=new Scanner(System.in);
				System.out.println("enter  Status of Book issuer");
				String name1=sc2.nextLine();
				p1.getStatusOfBookIssuer(name1);
				EnterBookDetails();
				System.out.println("Msg of BOOK return");
				l1.returnBook(s1,p1,b1,b1.BookName);
		}
		void isAvailabeBookMethod(){
				Scanner sc3=new Scanner(System.in);
			System.out.println("enter  Status of Book issuer");
				String name1=sc3.nextLine();
				p1.getStatusOfBookIssuer(name1);
				EnterBookDetails();	System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Msg of Whether Book Is Available in Libray or Not :");
				b1.isAvaiableBook(b1.booksList,b1.BookName);
		}
}
class AccesOtherMethods{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		printOtherMethod pr=new printOtherMethod();
		//1.String choice="ReturnBook";
		String choice="IssueBookByStudent";
		//String choice="IssueBookByfaculty";
		//3.String choice="IsAvailableBook";
		switch (choice){
			case "IssueBookByStudent":
				pr.bookIssuedByStudent();
				break;
			case "IssueBookByfaculty":
			 	pr.bookIssuedByFaculty();
				break;
			case "ReturnBook":
				pr.bookReturn();
				break;
			case "IsAvailableBook":
				pr.isAvailabeBookMethod();
				break;
			default:
				System.out.println("Invalid choice");		
		}
	}
}

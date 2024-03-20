class ComplexNumber{
	int real;
	int  imaginary;
	ComplexNumber obj1;
	ComplexNumber obj2;
	ComplexNumber(int real,int img){
		this.real=real;
		this.imaginary=img;
	}
	/*
	ObjectReturnDemo incrByTen()
    {
        ObjectReturnDemo temp
            = new ObjectReturnDemo(a + 10);
        return temp;
    }
	*/
	ComplexNumber  ReturnObject(ComplexNumber c1																																																																																																																																																																																																																																																																																							){
		ComplexNumber c1=new ComplexNumber(2,10);
		return c1;
	}
	public String toString(ComplexNumber obj1){
		obj1 =ReturnObject();
		return (obj1.real+obj1.imaginary+"i");
	}

	public static void main(String args[]){
		ComplexNumber c1 =new ComplexNumber(4,6);
		ComplexNumber c2 =new ComplexNumber(2,-3);
		
		ComplexNumber c3=c1.ReturnObject();
		System.out.println(c3);
			
	}
}
/*
class ComplexNumber{
	double real;
	double imaginary;
	sumOf2complex obj1;
	sumOf2complex obj2;
	sumOf2complex(int real,int img){
		this.real=real;
		this.imaginary=img;
	}
	ComplexNumber  sum(sumOf2complex obj1,sumOf2complex obj2){
		return new ComplexNumber(obj1.real+obj2.real,obj1.imaginary+obj2.imaginary);
	}
	void toString(){
		return ComplexNumber.real+ComplexNumber.imaginary+"i";
	}

	public static void main(String args[]){
		ComplexNumber c1 =new ComplexNumber(4,6);
		ComplexNumber c2 =new ComplexNumber(2,-3);
		
		ComplexNumber c3=sum(c1,c2);
		System.out.println(c3);
			
	}
}*/

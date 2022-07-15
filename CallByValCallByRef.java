class Test{
	int data;
	Test(int data){
		this.data = data;
	}
	void calledByValue(int data){
		data *= 2;
		System.out.print("\nvalue after modified in call by value = "+ data);
	}
	void calledByRef(Test obj){
		obj.data += 500;
		System.out.println("nvalue after modified in call by ref = "+obj.data);
	}
	void display(int val){
		System.out.println(val);
	}
}
class CallByValCallByRef
{
	public static void main(String args[]){
		Test tst = new Test(100);
		System.out.print("\noriginal Value after init = ");
		tst.display(tst.data);
		
		tst.calledByValue(100);
		System.out.print("\n original Value after call by val = ");
		tst.display(tst.data);
		
		tst.calledByRef(tst);
		
		System.out.print("\n original finally value is = "+tst.data);
	}
}
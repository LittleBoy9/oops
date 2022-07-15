class  A{
	public int val = 10;
	void dispA(){
		System.out.println("class A - val > "+ val);
	}
}
class B extends A{
	void dispB(){
		System.out.println("class B - val > "+ val);
	}
} 
class C extends A{
	void dispC(){
		System.out.println("class C - val > "+ val);
	}
}
class D extends A{
	void dispD(){
		System.out.println("class D - val > "+ val);
	}
}

class Assign_6b{
	public static void main(String args[]){
		A obja = new A();
		B objb = new B();
		C objc = new C();
		D objd = new D();
		objb.dispA();
		objc.dispA();
		objd.dispA();
	}
	
}
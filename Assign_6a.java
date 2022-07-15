class Parent {
	int a;
	void disp(int a){
		System.out.println("Parent > "+ a);
	}
}
class Child extends Parent{
	void disp(int b){
		super.disp(b+10);
		System.out.println("Child > "+ b);
	}
}

class Assign_6a{
	public static void main(String args[]){
		Child obj = new Child();
		obj.disp(5);
	}
}

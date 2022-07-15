abstract class parent {
	abstract void run();
}
class AbstractClass extends parent{
	void run(){
		System.out.print("run ");
	}
	public static void main(String args[]){
		parent obj  = new AbstractClass();
		obj.run();
		
	}
}
package pkg2;
import pkg1.*;
class Test extends A{
	void displayTest(){
		System.out.println("\n\n DIFF PKG SUB CLASS");
	//	System.out.println("DEFAULT VAR ->"+ var1);
		System.out.println("PUBLIC VAR ->"+ var2);
		System.out.println("PROTECTED VAR ->"+ var3);
		//System.out.println("PRIVATE VAR ->"+ var4);
	}
}

class Assign7b{
	public static void main(String args[]){
		A obja = new A();
		obja.displayA();
		Test test = new Test();
		test.displayTest();

		System.out.println("\n\n DIFF PKH NON SUB CLASS");
	//	System.out.println("DEFAULT VAR ->"+ obja.var1);
		System.out.println("PUBLIC VAR ->"+ obja.var2);
	//	System.out.println("PROTECTED VAR ->"+ obja.var3);
	}
}
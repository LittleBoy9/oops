package pkg1;
public class A{
	int var1;
	public int var2;
	protected int var3;
	private int var4;
	
	public A(){
		this.var1 = 10;
		this.var2 = 20;
		this.var3 = 30;
		this.var4 = 40;
	}
	
	public void displayA(){
		System.out.println("\n\n IN CLASS A");
		System.out.println("DEFAULT VAR ->"+ var1);
		System.out.println("PUBLIC VAR ->"+ var2);
		System.out.println("PROTECTED VAR ->"+ var3);
		System.out.println("PRIVATE VAR ->"+ var4);
	}
}

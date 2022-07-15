class Assign_5b{
	int a, b;
	Assign_5b(int i, int j){
		a = i;
		b = j;
	}
	void updateValue(Assign_5b obb){
		obb.a = obb.a *2;
		obb.b = obb.b * 2;
	}
	public static void main(String args[]){
		Assign_5b obj = new Assign_5b(10, 20);
		int a = 10;
		int b = 20;	
		System.out.println("BEFORE CALLING ---- value of a  " + obj.a + "  value of b  "+ obj.b);
		obj.updateValue(obj);
		System.out.println("AFTER CALLING ---- value of a  " + obj.a + "  value of b  "+ obj.b);
	}
}

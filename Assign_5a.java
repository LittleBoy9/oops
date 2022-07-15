class Assign_5a{
	public int add(int val){
		return val + 10;
	}
	public int add(int val1, int val2){
		return val1+val2;
	}
	public int add(int val1, int val2, int val3){
		return val1+val2+val3;
	}
	public static void main(String main[]){
		Assign_5a obj = new Assign_5a();
		System.out.println(obj.add(10));
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,30));
	}
}
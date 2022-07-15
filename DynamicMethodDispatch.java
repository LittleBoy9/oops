class Animal{
	Animal(){
		System.out.println("Animal class constructor");
	}
	void disp(){
		System.out.println("Animal class");
	}
	void animalFun(){
		System.out.println("animalFun");
	}
}
class Dog extends Animal{
	void disp(){
		super.disp();
		System.out.println("Dog class");
	}
	void dogFun(){
		System.out.println("dogFun");
	}
}
class DynamicMethodDispatch{
	public static void main(String args[]){
		Animal obj = new Dog();
		obj.disp();
		obj.animalFun();
		obj.dogFun();
	}
}
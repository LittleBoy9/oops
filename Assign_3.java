import java.util.*;
class StackWithLinkList{
	private class Node{
		int data;
		Node link;
	} 
	
	Node top;
	
	StackWithLinkList(){
		this.top = null;
	}
	
	public void push(int val){
		Node tmp = new Node();
		tmp.data = val;
		tmp.link = top;
		top = tmp;
	}
	
	public void pop(){
		if(top == null){
			System.out.println("STACK UNDERFLOW !!! , no element in stack");
		}
		else{
			System.out.print("popped item is = ");
			System.out.print(top.data);
			top = top.link;
		}
	}
	void displayStack(){
		if(top != null){
			Node tmp = top;
			while(tmp != null){
				System.out.print(tmp.data+ "  ");
				tmp = tmp.link;
			}
		}
	}
}

class Assign_3{
	public static void main(String args[]){
		StackWithLinkList obj = new StackWithLinkList();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("\n Please Choose your Choice >>");
			System.out.println("1. Do a Push Operation");
			System.out.println("2. Do a Pop Operation");
			System.out.println("3. Display the Current Stack");
			System.out.println("NOTE: Any other key for exit ---");
			System.out.print("Enter Your Chioce -> ");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.print("Enter the data :");
					int data = sc.nextInt();
					obj.push(data);
					break;
				case 2:
					obj.pop();
					break;
				case 3:
					obj.displayStack();
					break;
				default:
					System.exit(0);
			}
		}
	}
}

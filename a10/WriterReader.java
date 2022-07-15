import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;

	Person() {
	};

	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
	}
	public boolean check(String key){
		if(name.equals(key))
			return true;
		else 
			return false;
	}
}

public class WriterReader {

	public static void main(String[] args) {

		//Person p1 = new Person("John", 30, "Male");
		//Person p2 = new Person("Rachel", 25, "Female");
		//Person p3 = new Person("Michel", 40, "Male");
		Scanner in = new Scanner(System.in);
 
        
		try {
			FileOutputStream f = new FileOutputStream(new File("myObjects.dat"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			for(int i=0;i<2;i++){
				System.out.print("Enter name: ");
				String s = in.next();
				System.out.print("Enter age: ");
				int a = in.nextInt();
				System.out.print("Enter gender: ");
				String g = in.next();
				
				Person p1 = new Person(s,a,g);
				o.writeObject(p1);
			}
			// Write objects to file
			//o.writeObject(p1);
			//o.writeObject(p2);
			//o.writeObject(p3);
			//o.close();
			f.close();

			FileInputStream fi = new FileInputStream(new File("myObjects.dat"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			for(int i=0;i<5;i++){
				Person pr1 = (Person) oi.readObject();
				System.out.println(pr1.check("a"));
				if(pr1.check("a")){
					System.out.println("found");
				}
				
				
				System.out.println(pr1.toString());
			}
			/*// Read objects
			Person pr1 = (Person) oi.readObject();
			Person pr2 = (Person) oi.readObject();
			Person pr3 = (Person) oi.readObject();
			
			System.out.println(pr1.toString());
			System.out.println(pr2.toString());
			System.out.println(pr3.toString());*/
			
			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
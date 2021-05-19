import java.io.*;

class Dog implements Serializable{

	int i=10, 
	trainsent int j=20;
}
public class SerializationDemo1 {
	public static void main(String[] args) throws Exception{
		Dog d1= new Dog();
		Cat c1= new Cat();
		Rat r1= new Rat();
		FileOutputStream fos= new FileOutputStream("D:/Local E/DURGA/Notes/Serilization/Demos/abc.ser",true);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		FileInputStream fis = new FileInputStream("D:/Local E/DURGA/Notes/Serilization/Demos/abc.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Dog d2= (Dog)ois.readObject();
		cat c2=(Cat)ois.readObject();
		Rat r2=(Rat)ois.readObject();
		//System.out.println(d2.i+" "+d2.j);
	}
}
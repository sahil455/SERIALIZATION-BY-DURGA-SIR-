import java.io.*;

class Dog implements Serializable{

	int i=10, j=20;
}
public class SerializationDemo {
	public static void main(String[] args) throws Exception{
		Dog d1= new Dog();
		FileOutputStream fos= new FileOutputStream("D:/Local E/DURGA/Notes/Serilization/Demos/abc.ser",true);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("D:/Local E/DURGA/Notes/Serilization/Demos/abc.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Dog d2= (Dog)ois.readObject();

		System.out.println(d2.i+" "+d2.j);
	}
}
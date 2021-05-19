import java.io.*;

class Dog implements Serialazable{
	Cat c= new Cat();
}
class Cat implements Serialazable{
	Rat r= new Rat();
}
class Rat implements Serialazable{
	int j=12;
}

class SerialazationDemo2
{
	public static void main(String[] a)
	{
		Dog d1= new Dog();
		FileOutputStream fos= new FileOutputStream("abs.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis= new FileInputStream("abs.ser");
		ObjectInputStraem ois= new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.c.r.j);
	}
}

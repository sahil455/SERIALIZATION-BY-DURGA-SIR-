
import java.io.*;
class CustSerialzationDemo2{
	public static void main(String[] args) {
			Account a1= new Account();
			FileOutpiuStream fos= new FileOutpiuStream("abc.ser");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(a1);

			FileInputStream fis= new FileInputStream("absc.ser");
			ObjectInputStream ois= new ObjectInputStream(fis);
			Account a2=(Account)ois.readObject();
			System.out.println(a2.username+" "+a2.password+" "+a2.pin);
	}
}
class Accout implements Serialzable {
	String username="s";
	transient String password="1";
	transient int pin=1234;
	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject();
		String epwd="123"+password;
		int epin=4444+pin;
		os.writeObject(epwd);
		os.writeObject(epin);
	}
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		password=epwd.substring(3);
		int epin=is.readInt();
		pin=epin-4444;
	}
}

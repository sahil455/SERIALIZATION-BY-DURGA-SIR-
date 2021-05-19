import java.io.*;
class CustSerialzationDemo1{
	public static void main(String[] args) {
			Account a1= new Account();
			FileOutpiuStream fos= new FileOutpiuStream("abc.ser");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(a1);

			FileInputStream fis= new FileInputStream("absc.ser");
			ObjectInputStream ois= new ObjectInputStream(fis);
			Account a2=(Account)ois.readObject();
			System.out.println(a2.username+" "+a2.password);
	}
}
class Accout implements Serialzable {
	String username="s";
	transient String password="1";
	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject();
		String epwd="123"+password;
		os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		password=epwd.substring(3);
	}
}
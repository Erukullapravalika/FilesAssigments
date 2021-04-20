package com.batsman;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamonebatsman {
	public static void main(String[]args) throws FileNotFoundException,IOException,ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("batsman.dat"));
		Batsman bat1=(Batsman)
		ois.readObject();
		ois.close();
		System.out.println(bat1);
	}


}

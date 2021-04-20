package com.batsman;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamonebatsman {
	public static void main(String[]args) throws FileNotFoundException,IOException,ClassNotFoundException{
		Batsman bat1=new Batsman(111,"Dhoni",20,500);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("batsman.dat"));
		oos.writeObject(bat1);
		oos.close();
		System.out.println("object written successfully into file");
	}

}

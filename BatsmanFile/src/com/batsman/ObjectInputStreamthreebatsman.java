package com.batsman;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

	
public class ObjectInputStreamthreebatsman {
	public static void main(String[]args) throws FileNotFoundException,IOException,ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("batsman.dat"));
		Batsman[] bArray=new Batsman[3];
		for(int i=0;i<3;i++) {
			bArray[i]=(Batsman)
			ois.readObject();
		}
		for(Batsman b:bArray) {
			System.out.println(b);
		}
		



}
}

package com.batsman;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ObjectOutputStreamthreebatsman {

	public static void main(String[]args) throws FileNotFoundException,IOException,ClassNotFoundException{
		Batsman bat1=new Batsman(101,"Dhoni",200,600);
		Batsman bat2=new Batsman(103,"Rohith",200,600);
		Batsman bat3=new Batsman(104,"Dhoni",200,600);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("batsman.dat"));
		oos.writeObject(bat1);
		oos.writeObject(bat2);
		oos.writeObject(bat3);
		oos.close();
	}




}

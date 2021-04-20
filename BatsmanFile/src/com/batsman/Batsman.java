package com.batsman;
import java.io.Serializable;

public class Batsman implements Serializable {

private int id;
private String name;
private int innings;
private int Totalruns;


public Batsman(int id,String name,int innings,int Totalruns) {
	super();
	this.id=id;
	this.name=name;
	this.innings=innings;
	this.Totalruns=Totalruns;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getInnings() {
	return innings;
}
public void setInnings(int innings) {
	this.innings = innings;
}
public int getTotalruns() {
	return Totalruns;
}
public void setTotalruns(int totalruns) {
	Totalruns = totalruns;
}
@Override
public String toString() {
	return "Batsman [id=" + id + ", name=" + name + ", innings=" + innings + ", Totalruns=" + Totalruns + "]";
}

}

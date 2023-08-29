package dsa_problems;
import java.io.*;
import java.util.*;




public class Details{
	static Aakash info(int id,String name,double score)
	{
		Aakash details=new Aakash();
		id=id;
		name=name;
		score=score;
		return details;
	}
	
	
	public static void main(String args[])
	{
		int id=423;
		String name="Aakash Chandra";
		double score=8.0;
		Aakash details=info(id,name,score);
		System.out.println("Aakash's ID ="+id);
		System.out.println("Aakash's Full name="+name);
		System.out.println("Aakash's Score="+score);
	}
}





















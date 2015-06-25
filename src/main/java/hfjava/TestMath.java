package hfjava;

import java.lang.Math;
import java.io.Serializable;

public class TestMath implements Serializable{
	private static final long serialVersionUID = -1904345517222886243L;
	//final static boolean DEBUG = false;

	String i = "1";
	int j;

	public void go(){
		
		System.out.println(j);

		try{
			j= Integer.parseInt(i);
		} catch (NullPointerException e){
			System.out.println("Sorry that didn't work");
			e.printStackTrace();
		}

		System.out.println(i);
	}

	public static void main(String[] args){
		TestMath t = new TestMath();
		t.go();
		if(System.getProperty("debug.fetch") != null){
			System.out.println("Life is like an adventure, enjoy it!");
		}

	}
}
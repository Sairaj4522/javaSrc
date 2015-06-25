package jcookb;

import java.io.IOException;

public class SysPropDemo{
	public static void main(String[] args) throws IOException {
		if(args.length == 0){
			System.getProperties().list(System.out);
		} else {
			for(String s : args){
				System.out.println(s + " = " + System.getProperty(s));
			}
		}
	}
}
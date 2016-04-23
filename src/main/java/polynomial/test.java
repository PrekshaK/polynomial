package polynomial;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {
	
	public static void main(String args[]) throws IOException{
		
		FileInputStream fis = null;
		BufferedReader reader = null;
		
		
		fis = new FileInputStream("src/main/resources/poly.txt");
		reader = new BufferedReader(new InputStreamReader(fis));
		
		String line = reader.readLine();
        while(line != null){
            System.out.println(line);
            line = reader.readLine();
        }  
		
		
		
		
		
		Polynomial poly = new Polynomial();
		poly.insert(-2, 2);
		poly.insert(3, 3);
		poly.insert(5, 9);
	//	poly.remove(3,  2);
		String mypoly = poly.getPolynomial();
		System.out.println(mypoly);
//		poly.reverse();
//		
//		String revpoly = poly.getPolynomial();
//		
//		System.out.println(revpoly);
//		
//		System.out.println("hello");
//		
		
	}

}

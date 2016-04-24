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
        	String[] array = line.split(";");
        	Polynomial poly = new Polynomial();
        	for (int i = 1; i < array.length; i+=2){
        		int x = Integer.parseInt(array[i]);
        		int y = Integer.parseInt(array[i+1]);
        		poly.insert(x, y);
        	}
        	System.out.println(poly.getPolynomial());
        	
        	System.out.println(poly.getProduct());
        	poly.reverse();
        	System.out.println(poly.getPolynomial());
        	
        	
        	
        	
        	
        	
            line = reader.readLine();    
        }  

	}

}

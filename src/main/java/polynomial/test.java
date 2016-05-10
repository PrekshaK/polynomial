package polynomial;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {
	
	private static ArrayList<Polynomial> polys = new ArrayList<Polynomial>();
	

	
	public static void main(String args[]) throws IOException{
		
		FileInputStream fis = null;
		BufferedReader reader = null;
		
		
		fis = new FileInputStream("src/main/resources/poly.txt");
		reader = new BufferedReader(new InputStreamReader(fis));
		
		String line = reader.readLine();
        while(line != null){
        	String[] array = line.split(";");
        	Polynomial poly = new Polynomial("ettikai");
        	for (int i = 1; i < array.length; i+=2){
        		int x = Integer.parseInt(array[i]);
        		int y = Integer.parseInt(array[i+1]);
        		poly.insert(x, y);
        	}
        	polys.add(poly);

            line = reader.readLine();    
        }
        
        
        for (int i = 0; i<polys.size(); i++){
        	
        	Polynomial poly = polys.get(i);
        	
        	System.out.println(poly.getPolynomial());
        	
        	//System.out.println(poly.getProduct());
        	
        	System.out.println("reversing");
        	poly.reverse();
        	System.out.println(poly.getPolynomial());
        	
        	System.out.println("getting Product");
        	System.out.println(poly.Product());

        
        	
        }
        
        Polynomial poly = polys.get(0);
        
        poly.remove(-4, 1);
    	System.out.println("removing -4,1");
    	System.out.println(poly.getPolynomial());
        
        

	}

}

package polynomial;

import java.util.Comparator;

public class term{

	private int coefficient;
	private int exponent;
	private String termstring;
	
	public term(int coefficient, int exponent){
		this.coefficient = coefficient;
		this.exponent = exponent;
		
	}
	
	public String toString(){
		termstring = String.valueOf(coefficient) + "x^"+ String.valueOf(exponent) + " ";
		//System.out.println(termstring);
		return termstring;
		
	}
	
	public int getExponent(){
		return exponent;
	}
	
	public int getCoefficient(){
		return coefficient;
	}
	
	
	public boolean equals(term comterm) {
	    if (comterm == null) return false;
	    else if (comterm == this) return true;
	    
	    else if (this.exponent == comterm.exponent && this.coefficient == comterm.coefficient){
	    	return true;
	    }
	    else{
	    	return false;
	    }
	}
	

	
}

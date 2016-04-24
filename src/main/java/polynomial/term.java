package polynomial;


public class term{

	private int coefficient;
	private int exponent;
	private String termstring;
	private String sign;
	private int coeff;
	private String trailing;
	private String coeffstring;
	
	
	//Constructor
	public term(int coefficient, int exponent){
		this.coefficient = coefficient;
		this.exponent = exponent;
		
	}
	
	/**
	 * Concatenating term variable to return term in string form
	 */
	public String toString(){
		
		
		if (exponent == 0){
			trailing = " ";
		}else{
			trailing = "x^" + String.valueOf(exponent) + " ";
		}
		
		if (coefficient < 0){
			coeff = coefficient * -1;
			coeffstring = String.valueOf(coeff);
			sign = "- ";
			
		}else if (coefficient == 0){
			coeffstring = "";
		}
		
		else{
			coeff = coefficient;
			coeffstring = String.valueOf(coeff);
			sign = "+ ";
		}
		termstring = sign + coeffstring + trailing;
		return termstring;
		
	}
	
	
	/**
	 * getting exponent of term
	 * @return
	 */
	public int getExponent(){
		
		return exponent;
	}
	
	/**
	 * Getting coefficient of term
	 * @return
	 */
	public int getCoefficient(){
		return coefficient;
	}
	
	/**
	 * Check if two terms are equal
	 * @param comterm
	 * @return
	 */
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

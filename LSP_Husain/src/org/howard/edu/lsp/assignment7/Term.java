/**
 * @author sumayyahhusain
 */
package org.howard.edu.lsp.assignment7;
import java.io.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.*;


/**
 * 
 * Term Class
 *
 */
public class Term {
	
	private int coefficient; 
	private int exponent;


	/**
	 * Create constructor
	 * @param coefficient
	 * @param exponent
	 */
	public Term(int coefficient, int exponent) {
		this.coefficient = coefficient;
		this.exponent = exponent;
	}
	
	
	//public static void main(String[] args) {
	/**
	public void accessor () {
		
		try {
			File file=new File("Input.txt");    //creates a new file instance  
			FileReader fr=new FileReader(file);   //reads the file  
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
			StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
			String line;  
			while((line=br.readLine())!=null)  {  
					sb.append(line);      //appends line to string buffer
					
					
					for (int i=0; i < line.length(); i+=4) {
						//coefficient = "";
						//exponent = "";
						if (line.charAt(i) != '-') {
							//System.out.println("not negative");
							coefficient = Integer.parseInt(String.valueOf(line.charAt(i)));
							exponent = Integer.parseInt(String.valueOf(line.charAt(i+2)));
							System.out.println("Coefficient: " + coefficient);
							System.out.println("Exponent: " + exponent);
						} else if (line.charAt(i) == '-'){
							//System.out.println("yes negative");
							coefficient = (Integer.parseInt(String.valueOf(line.charAt(i+1))))*-1;
							//coefficient += (Character.toString(line.charAt(i+1)));
							exponent = Integer.parseInt(String.valueOf(line.charAt(i+3)));
							System.out.println("Coefficient: " + coefficient);
							System.out.println("Exponent: " + exponent);
							i +=1;
						}
						//toString(coefficient, exponent);
						full_term = coefficient + "x^" + exponent;
						System.out.println(full_term);
						
					}
					
					
					sb.append("\n");     //line feed  
					System.out.println("-----------");
					System.out.println("New line");
			}  
			fr.close();    //closes the stream and release the resources  
			System.out.println("Contents of File: ");  
			System.out.println(sb.toString());   //returns a string that textually represents the object  
			
		}
		catch(IOException e)  {  
			e.printStackTrace();  
		}  
			**/
	
	/**
	 * get integer coefficient value
	 * @return coefficient int 
	 */
	public int getCoeff() {
		return this.coefficient;
	}
	
	/**
	 * get integer exponent value
	 * @return exponent int 
	 */
	public int getExp() {
		return this.exponent;
	}
	
	/**
	 * turn term in to string
	 * @return string term 
	 */
	public String toString() {
		if(this.coefficient == 0) {
			return "";
		} else if (this.coefficient == 1 && this.exponent>1) {
			return "x^" + this.exponent;
		} else if (this.coefficient == -1 && this.exponent>1) {
			return "-x^" + this.exponent;
		} else if (this.coefficient == 1 && this.exponent == 1) { 
			return "x";
		} else if (this.coefficient == -1 && this.exponent == 1) { 
			return "-x";
		} else if (this.exponent == 0) {
			return this.coefficient + "";
		} else if (this.exponent == 1) {
			return this.coefficient + "x";
		} else {
			return this.coefficient + "x^" + this.exponent;
		}
	}
}

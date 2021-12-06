/**
 * @author sumayyahhusain
 */
package org.howard.edu.lsp.assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Polynomial class
 */
public class Polynomial {
	
	private List<Term> poly = new ArrayList<Term>();

	/*
	 * Constructor for polynomial
	 */
	//Constructor 
	public void Poly(Term term) {
		poly = new ArrayList<Term>();
		poly.add(term);
	}
	
	/**
	 * insert term in polynomial
	 * @param term
	 */
	public void insert (Term term) {
		poly.add(term);	
	}
	
	/**
	 * delete term from polynomial
	 * @param term
	 */
	public void delete (Term term) {
		poly.remove(term);
	}
	
	/**
	 * return product of polynomial terms
	 * @param p
	 * @return product
	 */
	public String product (Polynomial pol) {
		String prod;
		int coeff = 1;
		int exp = 0;
		for(int i=0; i<poly.size(); i++) {
			if(poly.get(i).getCoeff() != 0) {
				coeff = coeff * poly.get(i).getCoeff();
				exp = exp + poly.get(i).getExp();
			}
		}
		prod = coeff + "x^" + exp;
		return prod;
	}
	
	/**
	 * reverse order of terms in polynomial
	 */
	public void reverse () {
		Collections.reverse(poly);
	}
	
	/**
	 * return all terms of polynomial in single line
	 * @return formatted string polynomial
	 */
	public String polynomialToString() {
		String strPolynomial = "";
		
		for(int i=0; i <poly.size(); i++) {
			if(i < poly.size()-1 && poly.get(i).getCoeff() != 0) {
				if(poly.get(i+1).getCoeff() / -1 == Math.abs(poly.get(i).getCoeff())) {
					strPolynomial += poly.get(i);
				} else {
					strPolynomial += poly.get(i) + "+";
				}
			} else {
				strPolynomial += poly.get(i);
			}
		}
		
		return strPolynomial;
	}
	

}

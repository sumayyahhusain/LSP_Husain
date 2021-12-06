package org.howard.edu.lsp.assignment7;
import junit.framework.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;

/**
 * 
 * @author sumayyahhusain
 *
 */

/**
 * Creates polynomials 1-6
 */
public class PolynomialTest {
	public Polynomial poly1 = new Polynomial();
	public Polynomial poly2 = new Polynomial();
	public Polynomial poly3 = new Polynomial();
	public Polynomial poly4 = new Polynomial();
	public Polynomial poly5 = new Polynomial();
	public Polynomial poly6 = new Polynomial();
	
	
	/**
	 * Test insert()
	 */
	@Test
	@DisplayName("Test Insert")
	public void testInsert() {
		var term1 = new Term(2,3);
		var term2 = new Term(-4,5);
		var term3 = new Term(7,6);
		
		poly1.insert(term1);
		System.out.println("Insert term1 to poly1: " + poly1.polynomialToString());
		poly1.insert(term2);
		System.out.println("Insert term2 to poly1: " + poly1.polynomialToString());
		poly1.insert(term3);
		System.out.println("Insert term3 to poly1: " + poly1.polynomialToString());
		System.out.println("");
		
		assertEquals(poly1.polynomialToString(), "2x^3+-4x^5+7x^6");
	}
	
	/**
	 * Test delete()
	 */
	@Test
	@DisplayName("Test Delete")
	public void testDelete() {
		var term1 = new Term(4,3);
		var term2 = new Term(6,5);
		var term3 = new Term(1,2);
		
		poly2.insert(term1);
		poly2.insert(term2);
		poly2.insert(term3);
		
		System.out.println("Poly2: " + poly2.polynomialToString());
		
		poly2.delete(term2);
		
		System.out.println("After deleting term2 from poly2: " + poly2.polynomialToString());
		System.out.println("");
		
		assertEquals(poly2.polynomialToString(), "4x^3+x^2");
	}
	
	/**
	 * Test product()
	 */
	@Test
	@DisplayName("Test Product")
	public void testProduct() {
		var term1 = new Term(0,4);
		var term2 = new Term(1,3);
		var term3 = new Term(2,2);
		var term4 = new Term(3,1);
		
		poly3.insert(term1);
		poly3.insert(term2);
		poly3.insert(term3);
		poly3.insert(term4);
		
		System.out.println("Poly3: " + poly3.polynomialToString());
		System.out.println("The product of poly3 is: " + poly3.product(poly3));
		System.out.println("");
		
		assertEquals(poly3.product(poly3), "6x^6");
	}
	
	/**
	 * Test reverse()
	 */
	@Test
	@DisplayName("Test Reverse")
	public void testReverse() {
		var term1 = new Term(0,6);
		var term2 = new Term(6,1);
		var term3 = new Term(3,4);
		var term4 = new Term(10,5);
		
		poly4.insert(term1);
		poly4.insert(term2);
		poly4.insert(term3);
		poly4.insert(term4);
		
		System.out.println("Poly4: " + poly4.polynomialToString());
		
		poly4.reverse();
		System.out.println("Poly4 reversed: " + poly4.polynomialToString());
		System.out.println("");
		
		assertEquals(poly4.polynomialToString(), "10x^5+3x^4+6x");
	}
	
	/**
	 * Test polynomialToString()
	 */
	@Test
	@DisplayName("Test PolynomialToString")
	public void testPolyToString() {
		var term1 = new Term(0,6);
		var term2 = new Term(0,1);
		var term3 = new Term(0,0);
		var term4 = new Term(1,0);
		var term5 = new Term(1,3);
		var term6 = new Term(1,1);
		var term7 = new Term(-1,2);
		var term8 = new Term(-1,0);
		var term9 = new Term(-1,1);
		var term10 = new Term(4,4);
		
		
		poly5.insert(term1);
		poly5.insert(term2);
		poly5.insert(term3);
		poly5.insert(term4);
		poly5.insert(term5);
		poly5.insert(term6);
		poly5.insert(term7);
		poly5.insert(term8);
		poly5.insert(term9);
		poly5.insert(term10);
		
		System.out.println("Poly5: " + poly5.polynomialToString());
		System.out.println("");
		assertEquals(poly5.polynomialToString(), "1+x^3+x-x^2-1-x+4x^4");
	}
}

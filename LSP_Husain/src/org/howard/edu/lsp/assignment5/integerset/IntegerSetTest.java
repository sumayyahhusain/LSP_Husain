package org.howard.edu.lsp.assignment5.integerset;

import junit.framework.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;


/**
 * @author sumayyahhusain
 *
 */
public class IntegerSetTest {
	
	public IntegerSet intSet1 = new IntegerSet();
	public IntegerSet intSet2 = new IntegerSet();
	public IntegerSet intSet3 = new IntegerSet();
	public IntegerSet intSet4 = new IntegerSet();
	public IntegerSet intSet5 = new IntegerSet();
	public IntegerSet intSet6 = new IntegerSet();
	public IntegerSet intSet7 = new IntegerSet();
	public IntegerSet intSet8 = new IntegerSet();
	public IntegerSet intSet9 = new IntegerSet();
	public IntegerSet intSet10 = new IntegerSet();
	
	
	/**
	 * Create sets 1-10
	 */
	@BeforeEach
	public void populateSets() {
		
		// intSet1
		intSet1.add(10);
		intSet1.add(20);
		intSet1.add(30);
		intSet1.add(40);
		
		
		// intSet2 is empty
		
		
		// intSet3
		intSet3.add(-1);
		intSet3.add(-14);
		intSet3.add(-3);
		intSet3.add(-32);
		intSet3.add(-17);
		
		// intSet4
		intSet4.add(-1);
		intSet4.add(-14);
		intSet4.add(-3);
		intSet4.add(-32);
		intSet4.add(-17);
		
		// intSet5
		intSet5.add(111);
		intSet5.add(222);
		intSet5.add(121);
		intSet5.add(212);
		intSet5.add(122);
		intSet5.add(221);
		
		
		// intSet 6 is empty
		
		// intSet7
		intSet7.add(90);
		intSet7.add(92);
		intSet7.add(94);
		intSet7.add(96);
		intSet7.add(98);
		intSet7.add(100);
		
		// intSet8
		intSet8.add(5);
		intSet8.add(6);
		intSet8.add(7);
		intSet8.add(8);
		intSet8.add(9);
		intSet8.add(10);
		
		// intSet9
		intSet9.add(1);
		intSet9.add(2);
		intSet9.add(3);
		intSet9.add(4);
		
		// intSet10
		intSet10.add(1);
		intSet10.add(2);
		intSet10.add(3);
		intSet10.add(4);
		intSet10.add(5);
		intSet10.add(6);
		intSet10.add(7);
		intSet10.add(8);
		intSet10.add(9);
		intSet10.add(10);
	}
	
	
	// CLEAR
	/**
	 * Test clear() with populated set.
	 */
	@Test
	@DisplayName("Test clear() with populated set.")
	public void testClear1() {
		intSet1.clear();
		assertTrue(intSet1.length() == 0);
	}
	
	/**
	 * Test clear() with empty set.
	 */
	@Test
	@DisplayName("Test clear() with empty set.")
	public void testClear2() {
		intSet2.clear();
		assertEquals(0, intSet2.length());
	}
	
	
	
	// LENGTH
	/**
	 * "Test length() with populated set."
	 */
	@Test
	@DisplayName("Test length() with populated set.")
	public void testLength1() {
		assertTrue(intSet3.length() == 5);
	}
	
	/**
	 * Test length() with empty set.
	 **/
	@Test
	@DisplayName("Test length() with empty set.")
	public void testLength2() {
		assertTrue(intSet2.length() == 0);
	}
	
	
	
	// EQUALS
	/**
	 * Test equals() with populated equal sets.
	 */
	@Test
	@DisplayName("Test equals() with populated equal sets.")
	public void testEquals1() {
		boolean state = intSet3.equals(intSet4);
		assertTrue(state == true);
	}
	
	/**
	 * Test equals() with populated unequal sets.
	 */
	@Test
	@DisplayName("Test equals() with populated unequal sets.")
	public void testEquals2() {
		boolean state = intSet4.equals(intSet5);
		assertTrue(state == false);
	}
	
	/**
	 * Test equals() with empty sets.
	 */
	@Test
	@DisplayName("Test equals() with empty sets.")
	public void testEquals3 () {
		boolean state = intSet2.equals(intSet6);
		assertTrue(state == true);
	}
	
	/**
	 * Test equals() with empty set and populated set.
	 */
	@Test
	@DisplayName("Test equals() with empty set and populated set.")
	public void testEquals4 () {
		boolean state = intSet5.equals(intSet6);
		assertTrue(state == false);
	}
	
	
	
	// CONTAINS
	/**
	 * Test contains() with value present in set.
	 */
	@Test
	@DisplayName("Test contains() with value present in set.")
	public void testContains1() {
		assertTrue(intSet5.contains(111) == true);
	}
	
	/**
	 * Test contains() with value not in set.
	 */
	@Test
	@DisplayName("Test contains() with value not in set.")
	public void testContains2() {
		assertTrue(intSet5.contains(999) == false);
	}
	
	
	
	// LARGEST
	/**
	 * @throws IntegerSetException
	 * Test largest() with populated set.
	 */
	@Test
	@DisplayName("Test largest() with populated set.")
	public void testLargest1() throws IntegerSetException {
		assertEquals(100, intSet7.largest());
	}
	
	/**
	 * Test largest() with empty set.
	 * @throws IntegerSetException
	 */
	@Test
	@DisplayName("Test largest() with empty set.")
	public void testLargest2() throws IntegerSetException {
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			intSet6.largest();
		});
		assertEquals("Exception from largest because set is empty.", exception.getMessage());
	}
	
	
	
	// SMALLEST
	/**
	 * Test smallest() with populated set.
	 * @throws IntegerSetException
	 */
	@Test
	@DisplayName("Test smallest() with populated set.")
	public void testSmallest1() throws IntegerSetException {
		assertEquals(90, intSet7.smallest());
	}
	
	/**
	 * Test smallest() with empty set.
	 * @throws IntegerSetException
	 */
	@Test
	@DisplayName("Test smallest() with empty set.")
	public void testSmallest2() throws IntegerSetException{
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			intSet6.smallest();
		});
		assertEquals("Exception from smallest because set is empty.", exception.getMessage());
	}
	
	
	
	// ADD
	/**
	 * Test add() with value in set using contains().
	 */
	@Test
	@DisplayName("Test add() with value in set using contains().")
	public void testAdd1() {
		assertTrue(intSet7.contains(98) == true);
	}
	
	
	
	// REMOVE
	/**
	 * Test remove() with populated set.
	 * @throws IntegerSetException
	 */
	@Test
	@DisplayName("Test remove() with populated set.")
	public void testRemove1() throws IntegerSetException {
		intSet8.remove(7);
		assertTrue(intSet8.contains(7) == false);
	}
	
	/**
	 * Test remove() with empty set.
	 * @throws IntegerSetException
	 */
	@Test
	@DisplayName("Test remove() with empty set.")
	public void testRemove2() throws IntegerSetException {
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			intSet6.remove(1);
		});
		assertEquals("Exception thrown by remove because set is empty.", exception.getMessage());
	}
	
	
	
	// UNION
	/**
	 * Test union().
	 */
	@Test
	@DisplayName("Test union().")
	public void testUnion1() {
		intSet8.union(intSet9);
		assertEquals(intSet8.toString(), intSet10.toString());
	}
	
	
	
	// INTERSECT
	/**
	 * Test intersect() with populated sets.
	 */
	@Test
	@DisplayName("Test intersect() with populated sets.")
	public void testIntersect1() {
		intSet1.add(10);
		intSet1.add(20);
		intSet1.add(30);
		intSet1.add(40);
		
		assertEquals("[10]", intSet1.intersect(intSet10).toString());
	}
	
	/**
	 * Test intersect() with an empty set.
	 */
	@Test
	@DisplayName("Test intersect() with an empty set.")
	public void testIntersect2() {
		assertTrue("[]" == intSet1.intersect(intSet2).toString());
	}
	
	
	
	// DIFFERENCE
	/**
	 * Test diff() with populated varying sets.
	 */
	@Test
	@DisplayName("Test diff() with populated varying sets.")
	public void testDifference1() {
		assertEquals("[20, 30, 40]", intSet1.diff(intSet10).toString());
	}
	
	/**
	 * Test diff() with equivalent sets.
	 */
	@Test
	@DisplayName("Test diff() with equivalent sets.")
	public void testDifference2() {
		assertEquals("[]", intSet3.diff(intSet4).toString());
	}
	
	
	
	// ISEMPTY
	/**
	 * Test isEmpty() with populated set.
	 */
	@Test
	@DisplayName("Test isEmpty() with populated set.")
	public void testisEmpty1() {
		assertTrue(intSet5.isEmpty() == false);
	}
	
	/**
	 * Test isEmpty() with empty set.
	 */
	@Test
	@DisplayName("Test isEmpty() with empty set.")
	public void testisEmpty2() {
		assertTrue(intSet2.isEmpty() == true);
	}
	
	
	
	// TOSTRING
	/**
	 * Test toString() with populated set.
	 */
	@Test
	@DisplayName("Test toString() with populated set.")
	public void testtoString() {
		assertEquals("10 20 30 40 ", intSet1.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

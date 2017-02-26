package com.leetcode.problem_217;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest extends Solution {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(containsDuplicate(new int[]{1,2,3,3}));
	}

	/**
	 * null pointer safety check 
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNullPointerException() {
		int[] undefined = null;		
		try {
			containsDuplicate(undefined);
		} catch (java.lang.NullPointerException e) {
			throw(e);
		} catch (Exception unknown) {
			// TODO Auto-generated catch block
			unknown.printStackTrace();
			fail("unexpected or unknown Exception");
		}
	}

	/**
	 * 
	 */
	private int[] nums;
	@Before
	public void setUpLargeData() throws Exception {
		nums=new int[200*10000];
		final int LENGTH=nums.length;
		for (int i=0; i<LENGTH; i++) {
			nums[i] = i;
		}
	}
	@Test
	public void testLargeData_v1() {
		assertFalse(containsDuplicate(nums));
	}
	@Test
	public void testLargeData_v2() {
		assertFalse(containsDuplicate_v2(nums));
	}
	/**
	 * null pointer safety check v2
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testNullPointerException_v2() {
		int[] undefined = null;
		try {
			containsDuplicate(undefined);
		} catch (NullPointerException e) {
			throw(new RuntimeException("Caught the expected NullPointerException"));
		} catch (Exception unknown) {
			unknown.printStackTrace();
			fail("Unexpected or unknown Exception");
		}
	}

	/**
	 * Zero length array safety check
	 * 零长度数组被归类为不含重复元素的有效数组
	 */
	@Test
	public void testZeroLengthArray() {
		int[] zeroLengthArray = new int[0];
		int[] zeroLengthArray2 = new int[0];
		assertFalse(containsDuplicate(zeroLengthArray));
		assertFalse(containsDuplicate_v2(zeroLengthArray2));
	}

}
//vim: fileencoding=utf-8 tabstop=4 shiftwidth=4

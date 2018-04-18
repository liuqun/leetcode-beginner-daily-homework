package com.leetcode.problem_219;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest extends Solution {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(containsDuplicate(new int[]{1,2,3,3}, 1));
		assertTrue(containsDuplicate(new int[]{1,2,2,3}, 1));
		assertTrue(containsDuplicate(new int[]{1,1,2,3}, 1));
		assertFalse(containsDuplicate(new int[]{1,2,3,1}, 1));
		assertFalse(containsDuplicate(new int[]{1,2,1,4}, 1));
	}

	/**
	 * null pointer safety check 
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testNullPointerException() {
		int[] undefined = null;		
		try {
			containsDuplicate(undefined, 1);
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
	@Test(timeout=2000)
	public void testLargeData_v1() {
		assertFalse(containsDuplicate(nums, 1));
	}

}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab

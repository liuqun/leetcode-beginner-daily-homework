/**
 * @author 刘群<517067180@qq.com>
 */
package com.leetcode.problem_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author 刘群<517067180@qq.com>
 */
public class SolutionTest extends Solution {
	private final int target = 6;
	private final int[] nums = new int[] { 1, 2, 3, 3 };
	private final int[] nums_noanswer = new int[] { 1, 2, 3, 6 };

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test Case 1: Normal test
	 */
	@Test
	public void test1() {
		int[] result;
		result = twoSum(nums, target);
		assertEquals(2, result.length);
		final int i = result[0];
		final int j = result[1];
		assertNotEquals(i, j);
		assertEquals(target, (nums[i] + nums[j]));
	}

	/**
	 * Test Case 2: Expecting no answer will be found.
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void test2() {
		int[] result;
		try {
			result = twoSum(nums_noanswer, target);
			assertEquals(2, result.length);
			final int i = result[0];
			final int j = result[1];
			assertNotEquals(i, j);
			assertEquals(target, (nums_noanswer[i] + nums_noanswer[j]));
			String data;
			data = "" + nums_noanswer[i] + "+" + nums_noanswer[j];
			fail("please check test data: " + data + "=" + target);
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (Exception unknown) {
			// TODO Auto-generated catch block
			unknown.printStackTrace();
			fail("unknown or unexpected error happened");
		}
	}

}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab

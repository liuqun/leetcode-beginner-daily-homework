/**
 * @author 刘群<517067180@qq.com>
 */
package com.leetcode.problem_283;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author 刘群<517067180@qq.com>
 */
public class SolutionTest extends Solution {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void fix_bug() {
		final int[] expected_answer = new int[] { 1, 0, 0 };
		int[] nums;

		// ---------------------------------
		nums = new int[] { 0, 1, 0 };
		moveZeroes(nums);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
		// ---------------------------------
		nums = new int[] { 1, 0, 0 };
		moveZeroes(nums);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
	}

	@Test
	public void test() {
		final int[] expected_answer = new int[] { 1, 3, 12, 0, 0 };
		int[] nums;

		// ---------------------------------
		nums = new int[] { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
		// ---------------------------------
		nums = new int[] { 1, 0, 0, 3, 12 };
		moveZeroes(nums);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
	}

}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab

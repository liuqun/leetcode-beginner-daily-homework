package com.leetcode.problem_189;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/** Test cases */
public class SolutionTest extends Solution {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void t1() {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		final int[] expected_answer = new int[] { 5, 6, 7, 1, 2, 3, 4 };
		final int k = 3;
		rotate(nums, k);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
	}

	@Test
	public void t2() {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
		final int[] expected_answer = new int[] { 6, 1, 2, 3, 4, 5 };
		final int k = 1;
		rotate(nums, k);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
	}

	@Test
	public void t3() {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		final int[] expected_answer = new int[] { 6, 7, 1, 2, 3, 4, 5 };
		final int k = 2;
		rotate(nums, k);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
	}

	@Test
	public void t4() {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
		final int[] expected_answer = new int[] { 4, 5, 6, 1, 2, 3 };
		final int k = 3;
		rotate(nums, k);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
	}

	@Test
	public void t5() {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		final int[] expected_answer = new int[] { 4, 5, 6, 7, 1, 2, 3 };
		final int k = 4;
		rotate(nums, k);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
	}

	@Test
	public void t6() {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
		final int[] expected_answer = new int[] { 2, 3, 4, 5, 6, 1 };
		final int k = 5;
		rotate(nums, k);
		assertTrue(java.util.Arrays.equals(expected_answer, nums));
	}
}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab

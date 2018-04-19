package com.leetcode.problem_121;

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
		assertTrue(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }) == 5);
	}

	@Test
	public void t2() {
		assertTrue(maxProfit(new int[] { 7, 6, 4, 3, 1 }) == 0);
	}
}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab

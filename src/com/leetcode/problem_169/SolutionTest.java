
package com.leetcode.problem_169;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test-cases for LeetCode problem 169.
 * https://leetcode.com/problems/majority-element/
 * TODO: Please add more tests
 */
public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * 
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void test1() {
		int[] nums = new int[] { 1, 2, 2, 4, 4, 4 };// 测试单个值各占50%的临界条件
		try {
			int answer = Solution.majorityElement(nums);
			fail("Failed to catch any exception!\n" + "Check return value:" + String.valueOf(answer));
		} catch (Exception e) {
			throw e;
		}
	}
	/**
	 * 
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void test2() {
		int[] nums = new int[] { 2, 2, 4, 4 };// 测试两个值各占50%的临界条件
		try {
			int answer = Solution.majorityElement(nums);
			fail("Failed to catch any exception!\n" + "Check return value:" + String.valueOf(answer));
		} catch (Exception e) {
			throw e;
		}
	}

}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab

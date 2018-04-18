/**
 * @file MainProgram.java
 * ----------------------
 * LeetCode入门题
 * 给定一个整数数组int nums[MAX_LENGTH]和一个目标值target，
 * 要求从数组中找出2个成员的算数和恰好等于目标值target
 * @url https://leetcode.com/problems/two-sum
 */

package com.leetcode.problem_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Stream;


/**
 * @author 阿群
 *
 */
public final class MainProgram {

	/**
	 * @param args 可从java命令行指定要加载测试数据test.dat
	 *             例如：java bin/MainProgram test.dat
	 */
	public static void main(String[] args) {
		InputStream in = System.in; // NOTE: Use console IO as default
		if (0 == args.length) {
			System.out.println("Enter target and nums[] one by one, press Enter then press Ctrl-Z in the end");
		}
		if (args.length >= 1) {
			in = (new MainProgram()).getClass().
				getResourceAsStream(args[0]);
			if (null == in) {// Report error message here...
				System.err.println("Error: Failed to load data file "+args[0]);
				System.exit(0xFF);
			}
		}
		List<Integer> data = loadData(in);// FIXME: 遇到无效输入时会返回一个空ArrayList对象，导致程序崩溃
		Integer target;
		target=data.get(0);//取列表第一个元素作为target值
		data.remove(0);
		final int MAX_LENGTH = data.size();
		Integer[] nums;
		nums = data.toArray(new Integer[MAX_LENGTH]);
		data.clear();
		data = null;
		System.gc();
		int[] answer;
		try {
			answer = Solution.twoSum(nums, target);
			/* 控制台输出测试结果 */
			System.out.print("Result index={" + answer[0] + "," + answer[1] + "}\n");
			System.out.print("target=" + target.toString() + "="
					+ nums[answer[0]].toString() + "+" + nums[answer[1]].toString() + "\n");
		} catch (IllegalArgumentException e) {
			System.err.println("Error: " + e.getMessage());
			System.exit(-1);
		}
		System.gc();
		return;
	}

	/**
	 * @param in 输入流，可以是文件流或System.in标准输入流
	 * @return 一个ArrayList<Integer>整数列表. FIXME:输入无效数据时会返回空ArrayList<Integer>列表，可能导致函数调用者出错崩溃
	 */
	private static ArrayList<Integer> loadData(InputStream in) {
		/**
		 * 对输入文本格式要求如下：
		 * 1、只识别文本中的阿拉伯数字，其他字符将一律被替换为空格
		 * 2、暂未约定文本结束标志(例如检测EOF标志行)，直至读入全部文本后方可结束
		 * 3、输入流可以是文件流也可以是标准输入流(因没有约定文本结束标志,建议测试时用echo或cat命令加|管道)
		 */
		int val;
		ArrayList<Integer> list;
		Iterator<String> i;
		Stream<String> lines;
		String line;
		BufferedReader reader;
		reader = (new BufferedReader(new InputStreamReader(in)));
		lines = reader.lines();
		i = lines.iterator();
		list = new ArrayList<Integer>();

		while (i.hasNext()) {
			String tmp = i.next();
			line = tmp.replaceAll("[^0-9\\s]", " ");//仅保留数字和空格
			Scanner scan = new Scanner(line);
			while (scan.hasNext()) {
				try {
					val = scan.nextInt();
					list.add(new Integer(val));
				} catch (InputMismatchException e) {
					String unexpected=scan.next();
					System.err.println(unexpected);
					System.exit(-1);//Don't ignore such unexpected token
				} catch (Exception e) {
					e.printStackTrace();//TODO: Check what might happen here...
					System.exit(-2);
				}
			}
			scan.close();
		}
		try {
			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();//TODO: Check what might happen here...
			System.exit(-1);
		} catch (Exception unknown) {
			unknown.printStackTrace();//TODO: Check what might happen here...
			System.exit(-2);
		}
		return list;
	}
}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab

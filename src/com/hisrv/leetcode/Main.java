package com.hisrv.leetcode;

import java.util.List;

import java.util.ArrayList;

/**
 * @author zhengzhaomail
 * 
 */
public class Main {
	public static void main(String[] args) {
		testWildcardMatching();
	}
	
	public static void testWildcardMatching() {
		WildcardMatching f = new WildcardMatching();
		System.out.println(f.isMatch("bbaabbbabbbbabbbaaabababbbabbababbbabaaabbbbaabaabaaaa", "*b**b*a**abbaab*aba***"));
	}
	
	public static void testStringToInteger() {
		StringToInteger f = new StringToInteger();
		System.out.println(f.atoi("3147483648"));
	}
	
	public static void testSqrtx() {
		Sqrtx f = new Sqrtx();
		System.out.println(f.sqrt(2147395599));
	}
	
	public static void testSpiralMatrix() {
		SpiralMatrix f = new SpiralMatrix();
		List<Integer> r = f.spiralOrder(new int[][]{{1, 2}});
		for (int i = 0; i < r.size(); i ++) {
			System.out.print(String.format("%d ", r.get(i)));
		}
	}
	
	public static void testSimplifyPath() {
		SimplifyPath f = new SimplifyPath();
		System.out.println(f.simplifyPath("/."));
	}
	
	public static void testTwoSum() {
		TwoSum f = new TwoSum();
		int[] ret = f.twoSum(new int[] {5, 75, 25}, 100);
		System.out.println(ret[0]);
		System.out.println(ret[1]);
	}
	
	public static void testTriangle() {
		Triangle f = new Triangle();
		ArrayList<ArrayList<Integer>> ta = new ArrayList<ArrayList<Integer>> ();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		ta.add(a1);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(2);
		a2.add(3);
		ta.add(a2);
		System.out.println(f.minimumTotal(ta));
	}
	
	public static void testTextJustification() {
		TextJustification f = new TextJustification();
		ArrayList<String> ret = f.fullJustify(new String[] {""}, 0);
		for (String s : ret) {
			System.out.println(s);
		}
	}

	public static void testSudokuSolver() {
		SudokuSolver f = new SudokuSolver();
		String[] ss = new String[] {"...2...63","3....54.1","..1..398.",".......9.","...538...",".3.......",".263..5..","5.37....8","47...1..."};
		char[][] cs = new char[ss.length][];
		for (int i = 0; i < ss.length; i++) {
			cs[i] = ss[i].toCharArray();
		}
		outSudoku(cs);
		f.solveSudoku(cs);
		outSudoku(cs);
	}
	
	private static void outSudoku(char[][] cs) {
		for (int i = 0; i < cs.length; i ++) {
			for (int j = 0; j < cs[i].length; j ++) {
				System.out.print(cs[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void testReverseNodesInKGroup() {
		ReverseNodesInKGroup f = new ReverseNodesInKGroup();
		ListNodeBuilder.out(f.reverseKGroup(
				ListNodeBuilder.create(new int[] { 1, 2, 3, 4, 5, 6 }), 2));
	}

	public static void testRegularExpMatching() {
		RegularExpressionMatching f = new RegularExpressionMatching();
		System.out.println(f.isMatch("a", "ab*a"));
	}

	public static void testRecoverBST() {
		RecoverBinarySearchTree f = new RecoverBinarySearchTree();
		TreeNode root = TreeBuilder.create(new String[] { "2", "#", "1" });
		f.recoverTree(root);
		TreeBuilder.out(root);
	}

	public static void testPow() {
		Pow f = new Pow();
		System.out.println(f.pow(1, 2));
	}

	public static void testPopulating() {
		PopulationNextRightPointersInEachNode2 f = new PopulationNextRightPointersInEachNode2();
		TreeLinkNode root = new TreeLinkNode(1);
		TreeLinkNode l = new TreeLinkNode(2);
		root.left = l;
		l = new TreeLinkNode(3);
		root.right = l;
		l = new TreeLinkNode(4);
		root.left.left = l;
		l = new TreeLinkNode(5);
		root.right.right = l;
		f.connect(root);
	}

	public static void testNQueens() {
		NQueens f = new NQueens();
		f.solveNQueens(4);
	}

	public static void testMultiplyStrings() {
		MultiplyStrings f = new MultiplyStrings();
		System.out.println(f.multiply("9", "99"));
	}

	public static void testFindKth() {
		FindKthNum f = new FindKthNum();
		System.out.println(f.findKthMin(new int[] { 1, 3 }, new int[] { 2, 4 },
				2));
	}

	public static void testMedianOfTwoSortedArrays() {
		MedianOfTwoSortedArrays f = new MedianOfTwoSortedArrays();
		System.out.println(f.findMedianSortedArrays(new int[] { 1, 3 },
				new int[] { 2, 4 }));
	}

}

package com.learning.algorithms;

import java.util.HashMap;
import java.util.Map;

public class MemoizeAlgorithm {

	private Map<Integer, Integer> memoizeMap = new HashMap<>();

	private int fibonacci(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		if (this.memoizeMap.containsKey(n)) {
			System.out.println("Fetching the value of n from memoizeMap: " + n);
			return this.memoizeMap.get(n);
		}

		int result = fibonacci(n - 1) + fibonacci(n - 2);

		System.out.println("Putting the value of n in memoizeMap: " + n);
		this.memoizeMap.put(n, result);
		return result;

	}

	public static void main(String[] args) {
		MemoizeAlgorithm memoize = new MemoizeAlgorithm();
		System.out.println("Result: " + memoize.fibonacci(5));
	}

}

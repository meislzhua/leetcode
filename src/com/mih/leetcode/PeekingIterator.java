package com.mih.leetcode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by meislzhua on 15/10/24.

Given an Iterator class interface with methods: next() and hasNext(),
design and implement a PeekingIterator that support the peek() operation -- it essentially peek() at the element that will be returned by the next call to next().

Here is an example. Assume that the iterator is initialized to the beginning of the list: [1, 2, 3].

 Call next() gets you 1, the first element in the list.

 Now you call peek() and it returns 2, the next element. Calling next() after that still return 2.

 You call next() the final time and it returns 3, the last element. Calling hasNext() after that should return false.
 */
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

	Iterator<Integer> iterator = null;
	Integer peek = null;
	public PeekingIterator(Iterator<Integer> iterator) {
		peek = iterator.next();
		this.iterator = iterator;
	}


	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() { return peek; }

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(peek == null) return null;
		Integer tmp = peek;
		peek = iterator.hasNext()?iterator.next():null;
		return tmp;
	}
	@Override
	public boolean hasNext() { return peek != null; }

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1 ; i < 4 ; i++){
			list.add(i);
		}
		PeekingIterator  peekingIterator = new PeekingIterator(list.iterator());
		System.out.println(peekingIterator.next());

		System.out.println(peekingIterator.peek());
		System.out.println(peekingIterator.next());
		System.out.println(peekingIterator.next());
		System.out.println(peekingIterator.hasNext());

	}
}
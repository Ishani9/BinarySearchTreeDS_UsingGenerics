package com.bl.assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MyBinarySearchTreeTest {

	@Test
	public void whenNoNodeAdded_shouldReturnSize_zero() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		assertEquals(0, bst.size());
	}

	@Test
	public void whenOneNodeAdded_shouldReturnSize_one() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		assertEquals(1, bst.size());
	}

	@Test
	public void whenTwoNodesAdded_shouldReturnSize_two() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		assertEquals(2, bst.size());
	}

	@Test
	public void whenThreeNodesAdded_shouldReturnSize_three() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		assertEquals(3, bst.size());
	}
	
	// UC 2
	@Test
	public void whenAllNodesAdded_shouldReturn_itsSize() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(22);
		bst.add(40);
		bst.add(11);
		bst.add(3);
		bst.add(16);
		bst.add(60);
		bst.add(95);
		bst.add(65);
		bst.add(63);
		bst.add(67);
		assertEquals(13, bst.size());	
	}
	
	@Test
	public void whenSomeNodesAdded_shouldReturn_itsSize() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(30);
		bst.add(70);
		bst.add(22);
		bst.add(40);
		bst.add(11);
		bst.add(3);
		bst.add(16);
		bst.add(60);
		bst.add(63);
		bst.add(67);
		assertEquals(10, bst.size());	
	}

	// UC 3
	@Test
	public void ifNodePresent_shouldReturn_true(){
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(22);
		bst.add(40);
		bst.add(11);
		bst.add(3);
		bst.add(16);
		bst.add(60);
		bst.add(95);
		bst.add(65);
		bst.add(63);
		bst.add(67);
		assertTrue(bst.search(63));	
		assertTrue(bst.search(22));	
		
	}
	
	@Test
	public void ifNodeAbsent_shouldReturn_false(){
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(22);
		bst.add(40);
		bst.add(11);
		bst.add(3);
		bst.add(16);
		bst.add(60);
		bst.add(95);
		bst.add(65);
		bst.add(63);
		bst.add(67);
		assertFalse(bst.search(23));	
		assertFalse(bst.search(64));	
		
	}
	
}


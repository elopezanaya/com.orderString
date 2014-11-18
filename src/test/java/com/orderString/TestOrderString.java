package com.orderString;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOrderString{

	private OrderStringByLength orderStringByLength; 

	String[] arrayStringsOrdered={"hi","alo" ,"hola", };
	String[] arrayStringsToOrder={"hola","hi","alo" };
	
	public OrderStringByLength getOrderStringByLength() {
		return orderStringByLength;
	}


	public void setOrderStringByLength(OrderStringByLength orderStringByLength) {
		this.orderStringByLength = orderStringByLength;
	}


	@Before
	public void setup(){
		
		this.setOrderStringByLength(new OrderStringByLength());
		
	}
	
	
	@Test
	public void test() {
		
		assertArrayEquals("positive test case",arrayStringsOrdered, this.getOrderStringByLength().order(arrayStringsToOrder));
	
	}

	
	@Test
	public void testEmptyArray() {
		
		assertArrayEquals("testEmptyArray",null, this.getOrderStringByLength().order(null));
	
	}

	
	@Test
	public void testEmptyElementIntheArray() {
		String[] arrayStringsToOrderInner={"hola",null,"alo" };
		String[] arrayStringsToOrderedInner={"alo","hola" };
		
		assertArrayEquals("testEmptyArray",arrayStringsToOrderedInner, this.getOrderStringByLength().order(arrayStringsToOrderInner));
	
	}
	
	@Test
	public void testEmptyZeroLenghtIntheArray() {
		String[] arrayStringsToOrderInner={"hola","","alo" };
		String[] arrayStringsToOrderedInner={"alo","hola" };
		
		assertArrayEquals("testEmptyArray",arrayStringsToOrderedInner, this.getOrderStringByLength().order(arrayStringsToOrderInner));
	
	}
	
	@Test
	public void testEmptySpaceIntheArray() {
		String[] arrayStringsToOrderInner={"hola"," ","alo" };
		String[] arrayStringsToOrderedInner={"alo","hola" };
		
		assertArrayEquals("testEmptyArray",arrayStringsToOrderedInner, this.getOrderStringByLength().order(arrayStringsToOrderInner));
	
	}
	
	
	
}

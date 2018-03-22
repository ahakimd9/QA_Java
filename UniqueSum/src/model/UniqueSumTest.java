package model;
import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueSumTest {

	@Test
	public void test() {
		UniqueSum us = new UniqueSum();
		assertEquals(6, us.function1(2,3,1));	
	}
}

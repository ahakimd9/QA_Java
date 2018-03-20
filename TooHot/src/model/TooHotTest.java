package model;
import static org.junit.Assert.*;

import org.junit.Test;

public class TooHotTest {

	TooHot th = new TooHot();
	
	@Test
	public void functions2Test() {
		assertEquals(false,th.functions2(1, true));
		//assertEquals(1, 22, 22);
	}
}
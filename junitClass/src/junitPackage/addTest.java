package junitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void test() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.Add(100, 200);
		assertEquals(300,result);
	}

}

package junitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class concatTest {

	@Test
	void test() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.Concat("Hello", "World");
		assertEquals("HelloWorld",result);
	}

}

package text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class replaceTest {

	private Replace replace;


	@BeforeEach
	void setUp() throws Exception {
		this.replace = new Replace();
	}
	

	@Test
	void test1() {
		assertEquals("hello world", replace.cleanText("hello world"));
	}
	@Test
	void test2() {
		assertEquals("hello world", replace.cleanText("  hello world"));
	}
	@Test
	void test3() {
		assertEquals("hello world", replace.cleanText("hello world  "));
	}
	@Test
	void test4() {
		assertEquals("hello world", replace.cleanText("    hello world"));
	}
	@Test
	void test5() {
		assertEquals("hello world", replace.cleanText("hello world    "));
	}
	@Test
	void test6() {
		assertEquals("hello world", replace.cleanText("hello   world"));
	}
	@Test
	void test7() {
		assertEquals("hello world", replace.cleanText("  hello   world   "));
	}
}

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testMain() {

		String actual = Helloworld.Message();
		assertEquals("hello world", actual);
	}

}

import static org.junit.Assert.*;

import org.junit.Test;


public class HelloWorldTest {

	@Test
	public void testMain() {
		helloworld obj = new helloworld();
		String actual = obj.Message();

		assertEquals("hello world", actual);
	}

}

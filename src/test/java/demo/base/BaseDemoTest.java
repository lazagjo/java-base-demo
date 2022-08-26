package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public  void testSum(){
        BaseDemo sum2 = new BaseDemo();

        assertEquals(10,sum2.sum(4,6));
    }

    @Test
    public  void testNegative(){
        BaseDemo negative = new BaseDemo();

        assertEquals(4,negative.sum(-3,7));
    }
}

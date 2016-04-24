package junit;

import com.designprinciples.lecture3.Adder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//TDD
public class AdderTest {

    @Test
    public void simpleTest(){
        Adder adder = new Adder();
        assertEquals("1+1 is 2", 2, adder.add(1,1));
    }
}

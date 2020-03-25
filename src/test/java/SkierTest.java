import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SkierTest {

    Skier skier;

    @Before
    public void before(){
        skier = new Skier("john", 19);
    }

    @Test
    public void hasName(){
        assertEquals("john", skier.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(19, skier.getAge());
    }

    @Test
    public void canRent(){
        skier.rent(5);
        assertEquals(5, skier.rent());
    }
}

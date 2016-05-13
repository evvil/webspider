package JAVABEAN;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Evilina on 2016/4/18.
 */
public class AddTest {
    private Add add;

    @Before
    public void setUp() throws Exception {
        add = new Add();
    }

    @Test
    public void add() throws Exception {
        assertEquals(2, add.add());
    }
}
import java.beans.Transient;

import org.junit.*;
import static org.junit.Assert.*;

public class MathTest {
    @Test
    public void addTest(){
        Math a = new Math();
        //1+1 = 2
        assertEquals(2, a.add(1,1));
    }
}

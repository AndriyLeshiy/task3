import org.junit.*;
import org.junit.Test;
import org.junit.Test.*;
import static org.junit.Assert.*;
public class StringsTest {

    private Strings testStrings;

    @Before
    public void init(){testStrings = new Strings("");}
    @After
    public void delete(){testStrings = null;}

    @Test
    public void test(){
        String s = "dddsad::dawqd::dsadq::dwqdqd";
        testStrings.setS(s);
        assertEquals(testStrings.getMas2(),s.split("::"));

        s = "dddsad,dawqd,dsadq,dwqdqd";
        testStrings.setS(s);
        assertEquals(testStrings.getMas2(),s.split(","));

    }

}

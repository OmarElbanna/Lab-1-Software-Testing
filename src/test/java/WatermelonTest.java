import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;


public class WatermelonTest {
    @Test
    public void test1(){
        String data="2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Watermelon.watermelon(),false);
    }
    @Test
    public void test2(){
        String data="60";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Watermelon.watermelon(),true);
    }
    @Test
    public void test3(){
        String data="100";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Watermelon.watermelon(),true);
    }
    @Test
    public void test4(){
        String data="77";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Watermelon.watermelon(),false);
    }

}
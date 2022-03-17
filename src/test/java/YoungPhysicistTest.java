import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;

public class YoungPhysicistTest {
    @Test
    public void test1(){
        String data="3\n"+"1 5 9\n"+"4 6 11\n"+"-5 -7 4\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(YoungPhysicist.youngPhysicist(),false);
    }
    @Test
    public void test2(){
        String data="3\n"+"5 5 9\n"+"-3 -3 -6\n"+"-2 -2 -3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(YoungPhysicist.youngPhysicist(),true);
    }
    @Test
    public void test3(){
        String data="3\n"+"6 -3 -3\n"+"7 -4 -3\n"+"10 -7 -3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(YoungPhysicist.youngPhysicist(),false);
    }

}
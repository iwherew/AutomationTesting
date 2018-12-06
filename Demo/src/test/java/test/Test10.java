package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ TestngListener.class })
public class Test10 extends TestBase{

    @Test
    public void testInput(){
        System.out.println(5/0);
    }

}
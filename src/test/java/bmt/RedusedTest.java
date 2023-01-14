package bmt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RedusedTest 
{
    @Test
    public void testReduseMethod_1(){
        String pages = "";
        assertEquals("", Reduser.Reduse(pages));
    }

     @Test
    public void testReduseMethod_2(){
        String pages = "1,2,3,4,5,6,7,8,9";
        assertEquals("1-9", Reduser.Reduse(pages));
    }

    @Test
    public void testReduseMethod_3(){
        String pages = "3,7,5,4,2,12,11,10,9";
        assertEquals("2-5,7,9-12", Reduser.Reduse(pages));
    }

    @Test
    public void testReduseMethod_4(){
        String pages = "11,5,33,15,9,3";
        assertEquals("3,5,9,11,33", Reduser.Reduse(pages));
    }

    @Test
    public void testReduseMethod_5(){
        String pages = "1,2,2,2,2,2,2,2,3";
        assertEquals("1-3", Reduser.Reduse(pages));
    }

    @Test
    public void testReduseMethod_6(){
        String pages = "15,3,3,3,3,14";
        assertEquals("3,14-15", Reduser.Reduse(pages));
    }

    @Test
    public void testReduseMethod_7(){
        String pages = "1,2,3,,,4,5";
        assertEquals("Error: incorrected data", Reduser.Reduse(pages));
    }

    @Test
    public void testReduseMethod_8(){
        String pages = "12306,333333,2315,1000000";
        assertEquals("2315,12306,333333,1000000", Reduser.Reduse(pages));
    }

    @Test
    public void testReduseMethod_9(){
        String pages = "2,3,4,@#,one,9";
        assertEquals("Error: incorrected data", Reduser.Reduse(pages));
    }

    @Test
    public void testReduseMethod_10(){
        String pages = ",2,45,12,7,8,";
        assertEquals("Error: incorrected data", Reduser.Reduse(pages));
    }
}

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
}

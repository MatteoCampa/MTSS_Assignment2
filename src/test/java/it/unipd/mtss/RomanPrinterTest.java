package it.unipd.mtss;

import it.unipd.mtss.exception.InvalidNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RomanPrinterTest {
    private static RomanPrinter romanPrinter;

    @Before
    public void setUp(){
        romanPrinter = new RomanPrinter();
    }

    @Test
    public void test(){
        assertTrue(true);
    }
}
package it.unipd.mtss;


import it.unipd.mtss.exception.InvalidNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRomanTest{

    private static IntegerToRoman integerToRoman;

    @Before
    public void setUp(){
        integerToRoman = new IntegerToRoman();
    }

    @Test(expected = InvalidNumber.class)
    public void testConvert_Zero() throws InvalidNumber {
        try{
            integerToRoman.convert(0);
        }
        catch (InvalidNumber e){
            assertEquals("Numero Troppo Piccolo",e.getMessage());
            throw e;
        }
    }

    @Test(expected = InvalidNumber.class)
    public void testConvert_ToLow() throws InvalidNumber {
        try{
            integerToRoman.convert(-1);
        }
        catch (InvalidNumber e){
            assertEquals("Numero Troppo Piccolo",e.getMessage());
            throw e;
        }
    }

    @Test(expected = InvalidNumber.class)
    public void testConvert_ToHigh() throws InvalidNumber {
        try{
            integerToRoman.convert(1001);
        }
        catch (InvalidNumber e){
            assertEquals("Numero Troppo Grande",e.getMessage());
            throw e;
        }
    }

    @Test
    public void testConvert_Last() throws InvalidNumber {
        assertEquals("M", integerToRoman.convert(1000));
    }

    @Test
    public void testConvert_One() throws InvalidNumber {
        assertEquals("C", integerToRoman.convert(100));
    }

    @Test
    public void testConvert_Two() throws InvalidNumber {
        assertEquals("CC", integerToRoman.convert(200));
    }

    @Test
    public void testConvert_Three() throws InvalidNumber {
        assertEquals("CCC", integerToRoman.convert(300));
    }

    @Test
    public void testConvert_Four() throws InvalidNumber {
        assertEquals("CD", integerToRoman.convert(400));
    }

    @Test
    public void testConvert_Five() throws InvalidNumber {
        assertEquals("D", integerToRoman.convert(500));
    }

    @Test
    public void testConvert_Six() throws InvalidNumber {
        assertEquals("DC", integerToRoman.convert(600));
    }

    @Test
    public void testConvert_Seven() throws InvalidNumber {
        assertEquals("DCC", integerToRoman.convert(700));
    }

    @Test
    public void testConvert_Eight() throws InvalidNumber {
        assertEquals("DCCC", integerToRoman.convert(800));
    }

    @Test
    public void testConvert_Nine() throws InvalidNumber {
        assertEquals("CM", integerToRoman.convert(900));
    }

}
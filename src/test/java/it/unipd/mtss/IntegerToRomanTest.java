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
    public void testConvert_One() throws InvalidNumber {
        assertEquals("I", integerToRoman.convert(1));
    }

    @Test
    public void testConvert_Two() throws InvalidNumber {
        assertEquals("II", integerToRoman.convert(2));
    }

    @Test
    public void testConvert_Three() throws InvalidNumber {
        assertEquals("III", integerToRoman.convert(3));
    }

    @Test
    public void testConvert_Four() throws InvalidNumber {
        assertEquals("IV", integerToRoman.convert(4));
    }

    @Test
    public void testConvert_Five() throws InvalidNumber {
        assertEquals("V", integerToRoman.convert(5));
    }

    @Test
    public void testConvert_Six() throws InvalidNumber {
        assertEquals("VI", integerToRoman.convert(6));
    }

    @Test
    public void testConvert_Seven() throws InvalidNumber {
        assertEquals("VII", integerToRoman.convert(7));
    }

    @Test
    public void testConvert_Eight() throws InvalidNumber {
        assertEquals("VIII", integerToRoman.convert(8));
    }

    @Test
    public void testConvert_Nine() throws InvalidNumber {
        assertEquals("IX", integerToRoman.convert(9));
    }

}
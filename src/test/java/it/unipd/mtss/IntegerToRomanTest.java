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
    public void testConvert_First() throws InvalidNumber {
        assertEquals("I", integerToRoman.convert(1));
    }

    @Test
    public void testConvert_Last() throws InvalidNumber {
        assertEquals("M", integerToRoman.convert(1000));
    }

    @Test
    public void testConvert_Ones() throws InvalidNumber {
        assertEquals("CXI", integerToRoman.convert(111));
    }

    @Test
    public void testConvert_Twos() throws InvalidNumber {
        assertEquals("CCXXII", integerToRoman.convert(222));
    }

    @Test
    public void testConvert_Threes() throws InvalidNumber {
        assertEquals("CCCXXXIII", integerToRoman.convert(333));
    }

    @Test
    public void testConvert_Fours() throws InvalidNumber {
        assertEquals("CDXLIV", integerToRoman.convert(444));
    }

    @Test
    public void testConvert_Fives() throws InvalidNumber {
        assertEquals("DLV", integerToRoman.convert(555));
    }

    @Test
    public void testConvert_Sixes() throws InvalidNumber {
        assertEquals("DCLXVI", integerToRoman.convert(666));
    }

    @Test
    public void testConvert_Sevens() throws InvalidNumber {
        assertEquals("DCCLXXVII", integerToRoman.convert(777));
    }

    @Test
    public void testConvert_Eights() throws InvalidNumber {
        assertEquals("DCCCLXXXVIII", integerToRoman.convert(888));
    }

    @Test
    public void testConvert_Nines() throws InvalidNumber {
        assertEquals("CMXCIX", integerToRoman.convert(999));
    }

}
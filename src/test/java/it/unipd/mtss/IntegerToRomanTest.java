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
    public void testConvert_Ones() throws InvalidNumber {
        assertEquals("XI", integerToRoman.convert(11));
    }

    @Test
    public void testConvert_Twos() throws InvalidNumber {
        assertEquals("XXII", integerToRoman.convert(22));
    }

    @Test
    public void testConvert_Threes() throws InvalidNumber {
        assertEquals("XXXIII", integerToRoman.convert(33));
    }

    @Test
    public void testConvert_Fours() throws InvalidNumber {
        assertEquals("XLIV", integerToRoman.convert(44));
    }

    @Test
    public void testConvert_Fives() throws InvalidNumber {
        assertEquals("LV", integerToRoman.convert(55));
    }

    @Test
    public void testConvert_Sixes() throws InvalidNumber {
        assertEquals("LXVI", integerToRoman.convert(66));
    }

    @Test
    public void testConvert_Sevens() throws InvalidNumber {
        assertEquals("LXXVII", integerToRoman.convert(77));
    }

    @Test
    public void testConvert_Eights() throws InvalidNumber {
        assertEquals("LXXXVIII", integerToRoman.convert(88));
    }

    @Test
    public void testConvert_Nines() throws InvalidNumber {
        assertEquals("XCIX", integerToRoman.convert(99));
    }

}
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

}
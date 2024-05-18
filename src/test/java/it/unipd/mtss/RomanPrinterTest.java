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
    public void testPrint_Ten() throws InvalidNumber {
        String expected = "                   \n" +
                "`8.`8888.      ,8' \n" +
                " `8.`8888.    ,8'  \n" +
                "  `8.`8888.  ,8'   \n" +
                "   `8.`8888.,8'    \n" +
                "    `8.`88888'     \n" +
                "    .88.`8888.     \n" +
                "   .8'`8.`8888.    \n" +
                "  .8'  `8.`8888.   \n" +
                " .8'    `8.`8888.  \n" +
                ".8'      `8.`8888. \n";
        assertEquals(expected, romanPrinter.print(10));
    }

    @Test
    public void testPrint_Five() throws InvalidNumber {
        String expected = "                       \n" +
                "`8.`888b           ,8' \n" +
                " `8.`888b         ,8'  \n" +
                "  `8.`888b       ,8'   \n" +
                "   `8.`888b     ,8'    \n" +
                "    `8.`888b   ,8'     \n" +
                "     `8.`888b ,8'      \n" +
                "      `8.`888b8'       \n" +
                "       `8.`888'        \n" +
                "        `8.`8'         \n" +
                "         `8.`          \n";
        assertEquals(expected, romanPrinter.print(5));
    }

    @Test
    public void testPrint_One() throws InvalidNumber {
        String expected = "        \n" +
                " 8 8888 \n" +
                " 8 8888 \n" +
                " 8 8888 \n" +
                " 8 8888 \n" +
                " 8 8888 \n" +
                " 8 8888 \n" +
                " 8 8888 \n" +
                " 8 8888 \n" +
                " 8 8888 \n" +
                " 8 8888 \n";
        assertEquals(expected, romanPrinter.print(1));
    }
    
}
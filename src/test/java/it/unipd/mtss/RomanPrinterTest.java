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
    public void testPrint_Thousand() throws InvalidNumber {
        String expected = "          .         .           \n" +
                "         ,8.       ,8.          \n" +
                "        ,888.     ,888.         \n" +
                "       .`8888.   .`8888.        \n" +
                "      ,8.`8888. ,8.`8888.       \n" +
                "     ,8'8.`8888,8^8.`8888.      \n" +
                "    ,8' `8.`8888' `8.`8888.     \n" +
                "   ,8'   `8.`88'   `8.`8888.    \n" +
                "  ,8'     `8.`'     `8.`8888.   \n" +
                " ,8'       `8        `8.`8888.  \n" +
                ",8'         `         `8.`8888. \n";
        assertEquals(expected, romanPrinter.print(1000));
    }

    @Test
    public void testPrint_FiveHundred() throws InvalidNumber {
        String expected = "                   \n" +
                "8 888888888o.      \n" +
                "8 8888    `^888.   \n" +
                "8 8888        `88. \n" +
                "8 8888         `88 \n" +
                "8 8888          88 \n" +
                "8 8888          88 \n" +
                "8 8888         ,88 \n" +
                "8 8888        ,88' \n" +
                "8 8888    ,o88P'   \n" +
                "8 888888888P'      \n";
        assertEquals(expected, romanPrinter.print(500));
    }

    @Test
    public void testPrint_OneHundres() throws InvalidNumber {
        String expected = "                  \n" +
                "    ,o888888o.    \n" +
                "   8888     `88.  \n" +
                ",8 8888       `8. \n" +
                "88 8888           \n" +
                "88 8888           \n" +
                "88 8888           \n" +
                "88 8888           \n" +
                "`8 8888       .8' \n" +
                "   8888     ,88'  \n" +
                "    `8888888P'    \n";
        assertEquals(expected, romanPrinter.print(100));
    }

    @Test
    public void testPrint_Fifty() throws InvalidNumber {
        String expected = "               \n" +
                "8 8888         \n" +
                "8 8888         \n" +
                "8 8888         \n" +
                "8 8888         \n" +
                "8 8888         \n" +
                "8 8888         \n" +
                "8 8888         \n" +
                "8 8888         \n" +
                "8 8888         \n" +
                "8 888888888888 \n";
        assertEquals(expected, romanPrinter.print(50));
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

    @Test
    public void testPrint_AllLetters() throws InvalidNumber {
        String expected = "                                                                                                      \n" +
                "8 888888888o.          ,o888888o.    8 8888         `8.`8888.      ,8' `8.`888b           ,8'  8 8888 \n" +
                "8 8888    `^888.      8888     `88.  8 8888          `8.`8888.    ,8'   `8.`888b         ,8'   8 8888 \n" +
                "8 8888        `88. ,8 8888       `8. 8 8888           `8.`8888.  ,8'     `8.`888b       ,8'    8 8888 \n" +
                "8 8888         `88 88 8888           8 8888            `8.`8888.,8'       `8.`888b     ,8'     8 8888 \n" +
                "8 8888          88 88 8888           8 8888             `8.`88888'         `8.`888b   ,8'      8 8888 \n" +
                "8 8888          88 88 8888           8 8888             .88.`8888.          `8.`888b ,8'       8 8888 \n" +
                "8 8888         ,88 88 8888           8 8888            .8'`8.`8888.          `8.`888b8'        8 8888 \n" +
                "8 8888        ,88' `8 8888       .8' 8 8888           .8'  `8.`8888.          `8.`888'         8 8888 \n" +
                "8 8888    ,o88P'      8888     ,88'  8 8888          .8'    `8.`8888.          `8.`8'          8 8888 \n" +
                "8 888888888P'          `8888888P'    8 888888888888 .8'      `8.`8888.          `8.`           8 8888 \n";
        assertEquals(expected, romanPrinter.print(666));
    }
    
}
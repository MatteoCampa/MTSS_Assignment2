////////////////////////////////////////////////////////////////////
// Matteo Campagnaro 2068243
// Tommaso Diviesti 2082858
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import it.unipd.mtss.exception.InvalidNumber;

public class IntegerToRoman {
    public static String convert(int number) throws InvalidNumber {
        validaArgomenti(number);

        return null;
    }

    private static void validaArgomenti(int number) throws InvalidNumber{
        if(number>1000) {
            throw new InvalidNumber("Numero Troppo Grande");
        }
        else if (number<1) {
            throw new InvalidNumber("Numero Troppo Piccolo");
        }
    }
}
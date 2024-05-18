////////////////////////////////////////////////////////////////////
// Matteo Campagnaro 2068243
// Tommaso Diviesti 2082858
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import it.unipd.mtss.exception.InvalidNumber;

public class IntegerToRoman {

    private static final String[] unita = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public static String convert(int number) throws InvalidNumber {
        validaArgomenti(number);

        int n_unita = number%10;

        return unita[n_unita];
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
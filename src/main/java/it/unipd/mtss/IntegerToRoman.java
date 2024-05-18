////////////////////////////////////////////////////////////////////
// Matteo Campagnaro 2068243
// Tommaso Diviesti 2082858
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import it.unipd.mtss.exception.InvalidNumber;

public class IntegerToRoman {

    private static final String[] unita = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] decine = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] centinaia = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] migliaia = {"", "M"};

    public static String convert(int number) throws InvalidNumber {
        validaArgomenti(number);
      
        int n_unita = number%10;
        int n_decine = (number/10)%10;
        int n_centinaia = (number/100)%10;
        int n_migliaia = (number/1000)%10;

        return migliaia[n_migliaia] + centinaia[n_centinaia] + decine[n_decine] + unita[n_unita];
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
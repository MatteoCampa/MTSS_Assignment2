////////////////////////////////////////////////////////////////////
// Matteo Campagnaro 2068243
// Tommaso Diviesti 2082858
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import it.unipd.mtss.exception.InvalidNumber;

public class RomanPrinter {
    public static String print(int num) throws InvalidNumber {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] i=ii.split("\n");
        String[] v=vv.split("\n");
        String[] x=xx.split("\n");
        String[] l=ll.split("\n");
        String[] c=cc.split("\n");
        String[] d=dd.split("\n");
        String[] m=mm.split("\n");

        String risultato="";
        String[][] lettere_da_inserire=new String[romanNumber.length()][11];

        for (int j=0; j<romanNumber.length(); j++){
            char[] romanN = romanNumber.toUpperCase().toCharArray();
            if(romanN[j] == 'I') {
                lettere_da_inserire[j] = i;
            }
            else if(romanN[j] == 'V'){
                lettere_da_inserire[j] = v;
            }
            else if(romanN[j] == 'X'){
                lettere_da_inserire[j] = x;
            }
            else if(romanN[j] == 'L'){
                lettere_da_inserire[j] = l;
            }
            else if(romanN[j] == 'C'){
                lettere_da_inserire[j] = c;
            }
            else if(romanN[j] == 'D'){
                lettere_da_inserire[j] = d;
            }
            else{
                lettere_da_inserire[j] = m;
            }
        }

        for (int j=0; j<11; j++){
            for (String[] strings : lettere_da_inserire) {
                risultato = risultato + strings[j];
            }
            risultato = risultato + "\n";
        }

        return risultato;
    }

    private static final String ii =
            "        \n" +
                    " 8 8888 \n" +
                    " 8 8888 \n" +
                    " 8 8888 \n" +
                    " 8 8888 \n" +
                    " 8 8888 \n" +
                    " 8 8888 \n" +
                    " 8 8888 \n" +
                    " 8 8888 \n" +
                    " 8 8888 \n" +
                    " 8 8888 ";

    private static final String vv =
            "                       \n" +
                    "`8.`888b           ,8' \n" +
                    " `8.`888b         ,8'  \n" +
                    "  `8.`888b       ,8'   \n" +
                    "   `8.`888b     ,8'    \n" +
                    "    `8.`888b   ,8'     \n" +
                    "     `8.`888b ,8'      \n" +
                    "      `8.`888b8'       \n" +
                    "       `8.`888'        \n" +
                    "        `8.`8'         \n" +
                    "         `8.`          ";

    private static final String xx =
            "                   \n" +
                    "`8.`8888.      ,8' \n" +
                    " `8.`8888.    ,8'  \n" +
                    "  `8.`8888.  ,8'   \n" +
                    "   `8.`8888.,8'    \n" +
                    "    `8.`88888'     \n" +
                    "    .88.`8888.     \n" +
                    "   .8'`8.`8888.    \n" +
                    "  .8'  `8.`8888.   \n" +
                    " .8'    `8.`8888.  \n" +
                    ".8'      `8.`8888. ";

    private static final String ll =
            "               \n" +
                    "8 8888         \n" +
                    "8 8888         \n" +
                    "8 8888         \n" +
                    "8 8888         \n" +
                    "8 8888         \n" +
                    "8 8888         \n" +
                    "8 8888         \n" +
                    "8 8888         \n" +
                    "8 8888         \n" +
                    "8 888888888888 ";

    private static final String cc =
            "                  \n" +
                    "    ,o888888o.    \n" +
                    "   8888     `88.  \n" +
                    ",8 8888       `8. \n" +
                    "88 8888           \n" +
                    "88 8888           \n" +
                    "88 8888           \n" +
                    "88 8888           \n" +
                    "`8 8888       .8' \n" +
                    "   8888     ,88'  \n" +
                    "    `8888888P'    ";

    private static final String dd =
            "                   \n" +
                    "8 888888888o.      \n" +
                    "8 8888    `^888.   \n" +
                    "8 8888        `88. \n" +
                    "8 8888         `88 \n" +
                    "8 8888          88 \n" +
                    "8 8888          88 \n" +
                    "8 8888         ,88 \n" +
                    "8 8888        ,88' \n" +
                    "8 8888    ,o88P'   \n" +
                    "8 888888888P'      ";

    private static final String mm =
            "          .         .           \n" +
                    "         ,8.       ,8.          \n" +
                    "        ,888.     ,888.         \n" +
                    "       .`8888.   .`8888.        \n" +
                    "      ,8.`8888. ,8.`8888.       \n" +
                    "     ,8'8.`8888,8^8.`8888.      \n" +
                    "    ,8' `8.`8888' `8.`8888.     \n" +
                    "   ,8'   `8.`88'   `8.`8888.    \n" +
                    "  ,8'     `8.`'     `8.`8888.   \n" +
                    " ,8'       `8        `8.`8888.  \n" +
                    ",8'         `         `8.`8888. ";

}
////////////////////////////////////////////////////////////////////
// Matteo Campagnaro 2068243
// Tommaso Diviesti 2082858
////////////////////////////////////////////////////////////////////
package it.unipd.mtss.exception;

public class InvalidNumber extends Exception{
    private static final long serialVersionUID = 1L;
    public InvalidNumber(String msg){
        super(msg);
    }
}
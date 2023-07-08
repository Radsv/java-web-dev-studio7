package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD myCD = new CD();
        DVD myDVD = new DVD("My songs");

        myCD.spinDisc();
        myDVD.spinDisc();

        myCD.writeData("Whats written?");
        System.out.println(myCD.readData());
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}

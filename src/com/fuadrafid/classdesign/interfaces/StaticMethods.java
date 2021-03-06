package com.fuadrafid.classdesign.interfaces;

/**
 1. Like all methods in an interface, a static method is assumed to be public and will not
 compile if marked as private or protected.

 2. To call the static method, a reference to the name of the interface must be used.
 */
public class StaticMethods {
    public static void main(String[] args) {
        Bunny bunny = new Bunny();
        bunny.printDetails();

        Kangaroo kangaroo = new Kangaroo();
        kangaroo.printDetailsOkay();
    }

}

interface Hop {
    static int getJumpHeight() {
        return 8;
    }
}

interface Jump {
    static int getJumpHeight() {
        return 12;
    }
}

class Bunny implements Hop {
    public void printDetailsError() {
        /**
         *! System.out.println(getJumpHeight()); -- DOES NOT COMPILE
         *? To call the static method of an interface, a reference
         *? to the name of the interface must be used.
         */
    }

    public void printDetails() {
        System.out.println("     / \\\n" +
                "    / _ \\\n" +
                "   | / \\ |\n" +
                "   ||   || _______\n" +
                "   ||   || |\\     \\\n" +
                "   ||   || ||\\     \\\n" +
                "   ||   || || \\    |\n" +
                "   ||   || ||  \\__/\n" +
                "   ||   || ||   ||\n" +
                "    \\\\_/ \\_/ \\_//\n" +
                "   /   _     _   \\\n" +
                "  /               \\\n" +
                "  |    O     O    |\n" +
                "  |   \\  ___  /   |\n" +
                " /     \\ \\_/ /     \\\n" +
                "/  -----  |  -----  \\\n" +
                "|     \\__/|\\__/     |\n" +
                "\\       |_|_|       /\n" +
                " \\_____       _____/\n" +
                "       \\     /\n" +
                "       |     |");

        System.out.println("Bunny jumps up to height: "+Hop.getJumpHeight());
        /** To call the static method, a reference to the name of the interface must be used. */
    }
}

/** A class that implements two interfaces containing static methods
 with the same signature will still compile at runtime, because the static methods are not
 inherited by the subclass and must be accessed with a reference to the interface name
 */

class Kangaroo implements Hop, Jump {
    public void printDetailsOkay(){
        System.out.println("                                                  _  _\n" +
                "                                                 (\\\\( \\\n" +
                "                                                  `.\\-.)\n" +
                "                              _...._            _,-'   `-.\n" +
                "\\                           ,'      `-._.---.,-'       .  \\\n" +
                " \\`.                      ,'                               `.\n" +
                "  \\ `-...__              /                           .   .:  y\n" +
                "   `._     ``--..__     /                           ,'`---._/\n" +
                "      `-._         ``--'                      |    /_\n" +
                "          `.._                   _            ;   <_ \\\n" +
                "              `--.___             `.           `-._ \\ \\\n" +
                "                     `--<           `.     (\\ _/)/ `.\\/\n" +
                "                         \\            \\     `");
        System.out.println("                  Kangaroo hops up to height: "+ Hop.getJumpHeight());
        System.out.println("                  Kangaroo jumps up to height: "+ Jump.getJumpHeight());
    }
}
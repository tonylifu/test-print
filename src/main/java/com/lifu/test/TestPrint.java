package com.lifu.test;

public class TestPrint {
    /**
     * This is a Javadoc comment for a method.
     * This function just prints some bla bla text.
     * @param text The first parameter description.
     * @return return some string.
     */
    public static String testPrint(String text) {
        System.out.println("this is test print from dummy library!");
        System.out.println("Your text: " + text);
        return "nice text: " + text;
    }
}

import java.util.Arrays;

class BasicDemo {
    // *  STATEMENTS

    static int count = 55; // An example of a variable declaration statement
    
    /**
     * * Below are Expression Statements. ! They would throw  
     * ! They would throw an error: <identifier> expected. 
     * ! An Expression statement cannot be declared at class level.
     * * count = 54; 
     * * if (count<50) { // Do something };
     **/

    static void statements(){
        // Would work fine.
        count = 54; 
        if (count < 50) {
            // Do something
        }
    }

    /*
    * At class level we can only have
    * Field/ Attribute declarations
    * Method declarations
    * Constructor declarations
    * Nested classes & interface declarations
    * Instance and static initializers  
    **/

    /* Primitive Data-Types method */
    static void primitiveDataTypes () {
        /* Literals Demo */
        System.out.println("\n\nInside primitives...");
        /* Integer Literals */
        System.out.println("Integer Literals");
        int hexInt = 0x0041;
        int binaryInt = 0b01000001;
        int underscoreInt = 1_23_456;
        System.out.println("Hexidecimal Integer: "+hexInt);
        System.out.println("Binary Integer: "+binaryInt);
        System.out.println("Underscore Integer: "+underscoreInt);

        /* Characters. Remember that chars are just unsigned integers */
        System.out.println("\nCharacters bruv");
        char a = 'A';
        char n = 65;
        char u = '\u0041';
        char h = 0x41;
        char b = 0b01000001;

        System.out.println("Char A: " + a);
        System.out.println("Num Char A(65): " + n);
        System.out.println("Unicode Char A(\u0041): " + u);
        System.out.println("Hexidecimal Char A(0x41): " + h);
        System.out.println("Binary Char A(0b01000001): " + b);

        System.out.println(
            "\nNote the difference between the different result when we use the same vars as either char or results."
            );
    }

    /* Type Cating method */
    static void typeCasting() {
        System.out.println("\nInside typeCasting.\nExplicit Casting");
        // * EXPLICIT CASTING
        long y = 55;
        // int x = y; // ! Throws a compilation error. "incompatible types: possible lossy conversion from long to int."
        int x = (int) y;
        System.out.println("long_to_int cast: " + x);

        // // * Information loss due to out-of range-assignment
        // byte narByte = 127;  // If it was 128 it would be out of range still.
        // byte narByte = 123456; // ! Throws same compilation error because 123456 is outside a byte range.
        byte narByte = (byte) 123456; // We have to be explicit, though there will be loss of info.
        System.out.println("narrowedByte: " + narByte + ". Meant to be 123456."); // Would return 64 instead of 123456

        // // * Truncation
        int iTruncated = (int) 0.99;
        System.out.println("iTruncated:" + iTruncated + ". Meant to be 0.99."); // returns 0
    
        // // * IMPLICIT CAST
        System.out.println("\nImplicit Casting");
        y = x; // int to long
        System.out.println("Int to Long. y: " + y);

        char aChar = 'A';
        int aInt = aChar;
        System.out.println("Char to Int. aInt:"+aInt);

        byte bByte = 65;
        aChar = (char) bByte; // *Special conversion. (widening from byte --> int followed by narrowing int --> char)
        System.out.println("aChar: " + aChar + "\n");
    }

    static void arrays() {
        System.out.println("\nInside Arrays...");
        int[] intArray = new int[] {9, 11, 2, 5, 4, 7, 7};
        System.out.println("intArray.length: " + intArray.length);
        System.out.println("intArray[1]: " + intArray[1]);
        // ! We get a runtime error when we run the code below
        // ! Exception in thread "main" java.lang.ArrayIndexOutOFBoundException 
        // System.out.println("intArray[7]: " + intArray[7]);
        // * Below would return [I@15db9742
        System.out.println("intArray: " + intArray);
        // * Returns our actual array [9, 11, 2, 5, 4, 7, 7]
        System.out.println("intArray: " + Arrays.toString(intArray));
    }

    public static void main(String[] args) {
        /* Language Basics */
        // primitiveDataTypes();
        // typeCasting();
        arrays();
    }
}
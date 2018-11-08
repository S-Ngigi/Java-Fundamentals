class BasicDemo {
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
            "\nNote the difference between Hexidecimal Int: " + hexInt + " and Hexidecimal char h: " + h + "\n"
            );
        



    }

    public static void main(String[] args) {
        /* Language Basics */
        primitiveDataTypes();
    }
}
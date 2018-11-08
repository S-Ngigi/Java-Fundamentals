# Variables

We have

1. Instance variables

    * They are declared directly within a class and not within its a class's members
    * They represent an object state/attribute
    * They get a default value.
    * They cannot be reinitialized directly within a class, only within its members i.e methods

2. Static variables

    * Also declared directly within a class but with the static keyword
    * The represent a single copy of a class variable in that they are to be used by members of a class as is.
    * They also get initialized with a default value
    * Also cannot be reinitialized directly within a class.
3. Local variable

    * They are declared within methods
    * Includes method parameters
    * Not accessible outside method i.e they only exist if a method exists.
    * They do not get default values and the need to be initialized with a value.

## Variable data types

### Primitive data-types/variables

* Boolean
* Number
  * Integer- byte, short, int, long.
  * Floating point - float, double
  * Character - char

**NOTE**: *__char__* is considered a numeric datatype in java because it is internally represented as an unsigned integer.

*__unsigned__* indicates that it has no bits to describe wether it is positive or negative.

## Numbers

### Integers

These are whole or fixed-point numbers, e.g., 65, 1, 777

They bytes, shorts, int, long.

Data representation ~ [Signed two's complement](https://www.youtube.com/watch?v=Hof95YlLQk0). (Watch [this](https://www.youtube.com/watch?v=9W67I2zzAfo)  second video too)

Below is a table of that data representation.

|   Type    |   Bit depth   |   Value Range             |   Default   |
|   :---:   |   :-------:   |   :---------:             |   :-----:   |
|   byte    |   8 bit       |   $-2^7 to 2^7 -1$        |   0         |
|   short   |   16 bit      |   $-2^{15} to 2^{15} -1$  |   0         |
|   int     |   32 bit      |   $-2^{31} to 2^{31} -1$  |   0         |
|   long    |   64 bit      |   $-2^{63} to 2^{63} -1$  |   0         |

### Integer Examples

**byte** b = 100;

**short** s = 1000;

**int** b = -10000;

**long** b = 1000000**L**; *L* is required if the value is above int range.

**int** x = 5, y = 6; We can initialize multiple variables at the same time.

**int** x , y = 6;

* Class-level: x = 0 by default.
* Method level: x needs to be initialized before use. No default value.

**Note** that the numbers on the right side represent the integer literals.

Now a *literal* refers to any number, text or other information that directly represents a value. In other words it essentially means that what you type is what you get.

### Other literal formats

**_Hexidecimal_**

**int** y = **Ox**41; hexidecimal.y = 65 ($4*16^1+1*16^0$)
**int** y = **Ob**01000001; binary.y = 65 ($4*16^1+1*16^0$)
**int** y = **Ox**41; octal.y = 65 ($4*16^1+1*16^0$)

### Floating-point Numbers

Floating points are Real numbers e.g. 3.14

They consist of:

* 32-bit **float** or
* 64-bit **double**

**Note**: that a double is more precise because more information can be enconed with 64-bits.

But unlike integers there can be a infinite number of real numbers between a small range of numbers, say 3.14 and 3.15. Hence a floating point numbers cannot be accurately represented by either a float or double which have fixed number of bits.

Therefore many values are approximated.

* Data representation ~ 32 & 64-bit **IEEE 754 floating point**

For more information on IEEE 754 floating point conversion look at the links below:

* [Decimal to IEEE Floating point representation](https://www.youtube.com/watch?v=8afbTaA-gOQ)
* [IEEE Floating point representation to Decimal](https://www.youtube.com/watch?v=8afbTaA-gOQ)

|   Type     |   Bit depth   |   Value Range             |   Default   |
|   :---:    |   :-------:   |   :---------:             |   :-----:   |
|   float    |   32 bit      |   -3.4E38 to 3.4E38       |   0.0f      |
|   double   |   64 bit      |   -1.7E308 to 1.7E308     |   0.0d      |

### Floating-point Examples

* float f = 123.4f; **Must** end if f or F
* double d = 1233.4; trailing d or D is optional
* float e = 1.39e-23f; 1.39 * 10-23

## Rules of Thumb when using Integers or Floting-point Numbers

1. Item 48: Avoid float and double if exact answers are required.
    * float and double ~ **ill-suited** for monetary calculations (_common in e-commerce_)
    * Use **BigDecimal** instead. Its is more precise and for the rounding stratergies it offers.
    * Alternatively use int or long and keep track of the decimal point yourself (_tedious_)

2. Floating-point is not as fast as integer arithmetic. Only use floating numbers if the number has a fractional part.

3. In general stick with **int** & **double**
    * double's _preciseness_ ~ useful in **neural networks**

4. Use byte, short, float only if memory saving is important.

### Characters

These are single letter characters e.g "a", "A", "1", "#".

They are 16-bit **_char_**

Char data is represented as **16-bit unsigned integers**.

|   Type     |   Bit depth   |   Value Range          |   Default   |
|   :---:    |   :-------:   |   :---------:          |   :-----:   |
|   float    |   16 bit      |   0 to $2^{16}-1$      |   '\u0000'  |

Note: That if you compare the **'\u0000'** to **0** it returns **true**

```Java
class Main {
    public static void main(String[] args){
        char i = '\u0000';
        int b = 0;
        System.out.println(i==b); // returns true
    }
}
```

Note that this relationship between characters and the numbers form that they are represented in extends to all the chars

For example

```Java
class Main {
    public main void static main(String[] args){
        char c = 'A'; // Alphabet
        char n =  65; // Numbers
        char u = '\u0041'; // Unicode
        char h = 0x41; // Hexidecimal
        char b = 0b01000001; // Binary

        System.out.println(a); // returns 'A'
        System.out.println(n); // returns 'A'
        System.out.println(u); // returns 'A'
        System.out.println(h); // returns 'A'
        System.out.println(b); // returns 'A'

    }
}
```

* Java character uses 16-bit **Unicode** encoding scheme called (UTF-16).

    This basically means that characters are first encoded into UTF-16 format, which is a hexidecimal number, and then the encoded string is stored as a 16 bit unsigned integer within the system.

  * Unicode is a character set like ACII which can represent all characters in all languages in the world
  * Unicode has several encoding schemes/standards and UTF-16 is just one of them. Here's an example

  > "A" == 0041 **Hex** == 0000 0000 0100 0001 **Binary** == 65 **Decimal**

**NOTE**: Apart from Java, C# and python also internally use UTF-16 to store characters.

For more information on data represntation of primitives click [here](http://www3.ntu.edu.sg/home/ehchua/programming/java/DataRepresentation.html)

### Reference datatypes/variables

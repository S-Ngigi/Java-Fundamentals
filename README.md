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

1. Primitive Data-types/vars
2. Reference Data-types/vars (Object references)

## Primitive data-types/variables

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

### Boolean

This is a primitive that returns either true or false.

|   Type      |   Bit depth   |   Value Range          |   Default   |
|   :---:     |   :-------:   |   :---------:          |   :-----:   |
|   boolean   |   JVM         |   true or false        |   false     |

The bit depth of a boolean is jvm specific meaning that the jvm on a windows machine might
allocate a different number of bits as compared to a mac.

## Variable: Type Casting

We have established that Java is a statically typed language. This means that when we are
declaring variables we have to assign it a particular type. Wether **int**, **char** or
**boolean**. Once assigned it can be reassigned but with vars of the same type as it was
initialied with.

Sometimes we may have to assign a variable with a value of a different data type. In that
case that value will have to be cast or converted to the data type of the new variable.

So we **type cast** when we want to assign a *variable* or *literal* of one type to a *variable* of another type.

E.g. We may want to assign a var or literal of type *long*/*byte* to type *int*. We would do this through type-casting.

**Note**: Only **_numeric-to-numeric_** casting is possible.

So we cannot type-cast a boolean value or vice versa.

Now we have 2 types of casting.

1. **Implicit type casting**. _Widening conversion_

    This is done from a _Smaller_ range data-type to a  _Larger_ range data-type. E.g.

    ```Java
    int x = 65;
    long y = x // Implicit casting by the compiler.
    ```
    This means that the cast is implied. We can still use the parentisis to indicate a cast here. It would be called a superflous cast. e.g.

    ```Java
    byte b = 65;
    char c =  (char) b; // Superflous case c = 'A'
    ```

    **Note**: An implicit cast only works from smaller data-type -> larger i.e

    > byte (8-bit) => short, char (16-bit) => int (32 bit) => long (64-bit) => float (32-bit) => double (64-bit)

    **Note** the range of values represented by a 32 bit float is larger that a 64-bit long due to the IEEE 754 data representation of a float.

2. **Explicit type casting** ~ _Narrowing conversion_

    This is done from a _Larger_ range data-type to a  _Smaller_ range data-type. E.g.

    ```Java
    long y = 42;
    int x = (int) y; // Explicit casting.
    ```

    Since ```long``` is larger tht ```int``` we have an explicit type cast. In the above example we would get a compilation error.

    **Note** explicit casts only work from larger data-type --> smaller i.e

    > byte (8-bit) <=> char (16-bit) <=> short (16-bit) <= int (32 bit) <= long (64-bit) <= float (32-bit) <= double (64-bit)

## Information Loss in Explicit Casting

* **Out of range** assingments.

  Example: Here we would output _64_ instead of _123456_ because we since byte only uses 8 bits, only the 8 bit part of 123456 would be considered. This result to 64 as the output.

  ```Java
  byte smallByte = (byte) 123456 // returns 64
  ```

* **Truncation**

  Floating-point cast to integer/char will always truncate. E.g.

  ```Java
  int x = (int) 3.14; // returns x=3
  int y = (int) 0.9; // returns y=0
  char c = (char) 65.5; // returns c = 'A'
  ```

## Information Loss in Implicit Casting

In general we will not encounter loss of information with implicit casting but to be precises in few assignments there is a possibility of information loss.

Example: When casting a **int** or **long** => **float** or long => **double** could lead to loss of precision. This is because the resulting value my lose the least significant bits of the value that is being assigned.

```Java
int val = 1234567890;
float f = val; // implicit cast
int resVal = (float) f; // 1234567936 -> Loss in precision.
```

### Casting Usec-cases

* Implicit Casting

    ```Java
    go(double d1, double d2) {
        System.out.println(d1, d2)
    }

    float f1 = 3.133f;
    float f2 = 4.153f;

    go(f1, f2) // Implicit cast here. -> returns double values
    ```

* Explicit Casting

```Java
double avg = (2+3)/2; // returns 2.0 not 2.5
double avg = (double) (2+3)/2; // returns correct value 2.5
```

## Reference datatypes/variables (Object References)

Below is an example of an object reference variable, whereby s is an reference var and not an object itself.

In other words `s` hold bits that references a `Student object` in memory.

Basically the stament below has 3 parts to it that tell the JVM to do specific things.

```Java
Student s = new Student();
```

1. `Student s` - Tell the JVM to allocate space for the reference variable s
2. `new Student()` - Allocate space for new student object in memory.
3. `=` - We assign the memory address of the new Student object to our reference variable s.

Now objects are stored in a special area of memory that is assigned to JVM.

When the JVM starts up it gets a chunk of memory from the underlying OS in order to run its programs. One area of this memory is called a **Heap**.

**All Java Objects are stored/live on the heap.**

> The bit-depth of an **object-reference** is JVM specific, as in the bit depth on a Linux JVM may be different from the bit depth on a Windows or Mac JVM.
>
>However on a given JVM the bit depth of an object-reference will be the same regardless of whatever Object they reference.

The Default value for an Object reference is `null`;

```Java
Student s; // s is null until initialized
s.updateProfile(); // Calling a method on a null value returns a NullPointerException
```

## Statements

Statements are basically commands to be executed. We categorize statements into 3.

1. Declaration Statements

    ```Java
    int count = 25;
    ```
2. Expression Statements

    ```Java
    count = 25; // assignment statement
    getCount(); // method invocation statement
    count++; // increment statement
    ```
3. Control flow statements

    ```Java
    if (count < 100) {
        // do something.
    }
    ```

**Note**: Declaration statements are the only statement allow at class level. The rest
(Expression & Control-Flow Statements) result in compilation errors.

Next we will take a brief look at [arrays](./Array.md)
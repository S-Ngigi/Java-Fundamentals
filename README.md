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

### Primitive datatypes/variables

* Bolean
* Number
  * Integer- byte, short, int, long.
  * Floating point - float, double
  * Character - char

**NOTE**: *__char__* is considered a numeric datatype in java because it is internally represented as an unsigned integer.

*__unsigned__* indicates that it has not bit to describe wether it is positive or negative.

### Reference datatypes/variables

## Integers

These are whole of fixed-point numbers, e.g., 65, 1, 777

They bytes, shorts, int, long.

Data representation ~ [Signed two's complement](https://www.youtube.com/watch?v=Hof95YlLQk0). (Watch [this](https://www.youtube.com/watch?v=9W67I2zzAfo)  second video too)
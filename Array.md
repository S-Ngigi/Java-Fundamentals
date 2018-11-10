# Arrays

## Overview

This is one of the reference data-types that we have in Java.

It is a container **object** that holds **fixed** # of **single type** values.

Below we cover several ways of creating an Array in Java.

1. One way. We create a int array object with 7 integers within it. By default they would all be initialized to 0;

    ```Java
    int[] intArray = new int[7]; // [0,0,0,0,0,0,0]
    /* Assigning the values */
    intArray[0] = 9;
    intArray[1] = 11;
    intArray[2] = 2;
    intArray[3] = 5;
    intArray[4] = 4;
    intArray[5] = 7;
    intArray[6] = 7;

    /* Note */
    int[] someArray; // would be initialized to null;
    int anArray[]; // is also ok.
    ```

2. Second way

    ```Java
    int[] intArray = new int[]{9,11,2,5,4,7,7};
    ```
3. Simplest way

    ```Java
    int[] intArray = {9,11,2,5,4,7,7};
    ```

We can access an array's length by calling on it the `length` property.

```Java
intArray.length // returns 7
```

Trying to access a outside an array boundary leads to a runtime error.

```Java
int item = intArray[7] // runtime error.
```

### An array of Object References

```Java
Student[] students = new Students[2]; // By defaul all 2 values will be null

student[0] = new Student();
student[1] = new Student();
student[0].name = "John";
student[1].name = "Raj";
```

**Note** to return the array itself we have to

```Java
import java.utils.Arrays;

System.out.println(Arrays.toString(intArray)); // returns [9,11,2,5,4,7,7]
```

### Random Access

It is believed that the JVM uses a Linear layout (items next to eact other index wise) when accessing we want to access any value using their indices.

This allows for fast random access of a value regardless of `intArray[1000]` or `intArray[5]`. i.e any element can be accessed in constant time (**O(1)**).

When it comes to searching a value though we it we use linear time **0(n)** because we have to search the value on every index. Index by index.
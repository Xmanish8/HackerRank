# Java Datatypes

## 📌 Problem Statement

Java provides several primitive data types for storing integer values:

- `byte` (8-bit signed integer)
- `short` (16-bit signed integer)
- `int` (32-bit signed integer)
- `long` (64-bit signed integer)

Given an integer, determine which of these primitive data types can store the value.

If the number is too large or too small to fit into any of these data types, print that it can't be fitted anywhere.

---

## 📥 Input Format

- The first line contains an integer `t`, representing the number of test cases.
- Each of the next `t` lines contains a single integer `n`.

---

## 📤 Output Format

For each test case:

If the number can be stored, print:

```text
n can be fitted in:
* byte
* short
* int
* long
```

Print only the data types that can store the given number, in ascending order of size.

If the number cannot be stored in any primitive integer type, print:

```text
n can't be fitted anywhere.
```

---

## 📌 Primitive Data Type Ranges

| Data Type | Size | Minimum Value | Maximum Value |
|-----------|------|--------------------------:|-------------------------:|
| `byte` | 8 bits | -128 | 127 |
| `short` | 16 bits | -32,768 | 32,767 |
| `int` | 32 bits | -2,147,483,648 | 2,147,483,647 |
| `long` | 64 bits | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 |

---

## 💡 Sample Input

```text
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
```

---

## 💡 Sample Output

```text
-150 can be fitted in:
* short
* int
* long

150000 can be fitted in:
* int
* long

1500000000 can be fitted in:
* int
* long

213333333333333333333333333333333333 can't be fitted anywhere.

-100000000000000 can be fitted in:
* long
```

---

## 🧠 Explanation

### Example 1

Input:

```text
-150
```

Since `-150` fits within the ranges of:

- `short`
- `int`
- `long`

Output:

```text
-150 can be fitted in:
* short
* int
* long
```

---

### Example 2

Input:

```text
150000
```

`150000` is larger than a `short` but fits in:

- `int`
- `long`

---

### Example 3

Input:

```text
213333333333333333333333333333333333
```

This number exceeds the range of a `long`, so it cannot be stored in any primitive integer type.

---

## 🚀 Approach

1. Read the number of test cases.
2. For each test case:
   - Try reading the number as a `long`.
   - If reading fails, print that the number can't be fitted anywhere.
   - Otherwise, compare the number against the range of each primitive type.
   - Print every data type that can store the value.

---

## 💻 Java Solution

```java
import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {

                long x = sc.nextLong();

                System.out.println(x + " can be fitted in:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");

                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");

                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");

                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
```

---

## ⏱️ Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(t)** |
| **Space Complexity** | **O(1)** |

---

## 📚 Concepts Used

- Java Primitive Data Types
- Data Type Ranges
- `Scanner` Class
- Exception Handling (`try-catch`)
- Conditional Statements (`if`)
- Constants (`Byte.MIN_VALUE`, `Integer.MAX_VALUE`, etc.)

---

## 🎯 Key Learning

- Understand the storage capacity of Java primitive integer data types.
- Compare values against predefined data type ranges.
- Use `try-catch` to handle numbers that exceed the range of a `long`.
- Use Java's built-in constants (`Byte.MIN_VALUE`, `Long.MAX_VALUE`) instead of hardcoding values.
- Practice decision-making and exception handling in Java.

---

### ⭐ Platform

**HackerRank – Java Datatypes**
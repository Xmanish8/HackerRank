# Java Loops II

## 📌 Problem Statement

You are given **q** queries. Each query consists of three integers:

- `a`
- `b`
- `n`

For each query, generate and print a series of **n** integers using the following pattern:

```
(a + 2⁰ × b)
(a + 2⁰ × b + 2¹ × b)
(a + 2⁰ × b + 2¹ × b + 2² × b)
...
```

Print each series on a single line with space-separated values.

---

## 📥 Input Format

- The first line contains an integer `q`, representing the number of queries.
- Each of the next `q` lines contains three space-separated integers:

```text
a b n
```

---

## 📤 Output Format

For each query, print the generated series as a single line containing `n` space-separated integers.

---

## 📌 Constraints

```text
0 ≤ q ≤ 500
0 ≤ a, b ≤ 50
1 ≤ n ≤ 15
```

---

## 💡 Sample Input

```text
2
0 2 10
5 3 5
```

---

## 💡 Sample Output

```text
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```

---

## 🧠 Explanation

### Query 1

```
a = 0
b = 2
n = 10
```

Series:

```
2
2 + 4 = 6
6 + 8 = 14
14 + 16 = 30
30 + 32 = 62
...
```

Output:

```text
2 6 14 30 62 126 254 510 1022 2046
```

---

### Query 2

```
a = 5
b = 3
n = 5
```

Series:

```
8
14
26
50
98
```

---

## 🚀 Approach

1. Read the number of queries `q`.
2. For each query:
   - Read `a`, `b`, and `n`.
   - Initialize `sum = a`.
   - Loop `n` times.
   - In each iteration:
     - Calculate `b × 2^i`.
     - Add it to `sum`.
     - Print the updated `sum`.
3. Print a new line after each query.

---

## 💻 Java Solution

```java
import java.util.*;
import java.io.*;

class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;

            for (int j = 0; j < n; j++) {
                int value = (int) (b * Math.pow(2, j));
                sum += value;
                System.out.print(sum + " ");
            }

            System.out.println();
        }

        in.close();
    }
}
```

---

## ⏱️ Complexity Analysis

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(q × n)** |
| **Space Complexity** | **O(1)** |

---

## 📚 Concepts Used

- Java `for` loops
- Nested loops
- Mathematical series
- `Math.pow()` function
- Running sum technique
- Scanner class
- Output formatting

---

## 🎯 Key Learning

- Solve multiple test cases using nested loops.
- Generate cumulative series efficiently.
- Use `Math.pow()` to calculate powers of 2.
- Maintain a running sum instead of recalculating previous terms.
- Format output exactly as required in competitive programming.

---

### ⭐ Platform

**HackerRank – Java Loops II**
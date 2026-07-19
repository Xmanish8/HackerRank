# Java Loops I - Multiplication Table

## 📌 Objective
Use a `for` loop to print the first **10 multiples** of a given integer.

---

## 📝 Problem Statement

Given an integer **N**, print its first **10 multiples**.

Each multiple should be printed on a new line in the following format:

```text
N x i = result
```

where:

- `N` is the given integer.
- `i` ranges from **1 to 10**.
- `result = N × i`.

---

## 📥 Input Format

A single integer:

```text
N
```

---

## 📤 Output Format

Print **10 lines**.

Each line should contain:

```text
N x i = result
```

---

## 📌 Constraints

```text
2 ≤ N ≤ 20
```

---

## 💡 Example

### Input

```text
2
```

### Output

```text
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```

---

## 🧠 Approach

1. Read the integer `N`.
2. Use a `for` loop from `1` to `10`.
3. In each iteration:
   - Calculate `N * i`.
   - Print the result in the required format.

---

## 💻 Java Solution

```java
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        bufferedReader.close();
    }
}
```

---

## ⏱️ Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | **O(10) ≈ O(1)** |
| Space Complexity | **O(1)** |

---

## 📚 Concepts Used

- Java `for` Loop
- Input using `BufferedReader`
- Integer Parsing (`Integer.parseInt()`)
- Arithmetic Operators
- String Concatenation
- Console Output (`System.out.println()`)

---

## 🎯 Key Learning

- How to iterate using a `for` loop.
- Reading input efficiently using `BufferedReader`.
- Generating a multiplication table using loops.
- Formatting output exactly as required by coding platforms like HackerRank.

---

### ⭐ Practice Platform
**HackerRank – Java Loops I**
[View on HackerRank](https://www.hackerrank.com/challenges/java-loops-i/)
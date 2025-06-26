# 📊 Java Data Types – Range & Overflow Handling

---

## ✅ `Integer.MAX_VALUE`

Gives the **maximum value of a 32-bit signed integer**.

### 📌 Details:

* Java’s `int` is a **32-bit signed** data type.
* It uses **2’s complement representation**:

  * 1 bit for the **sign**
  * 31 bits for the **magnitude**
  * ➔ Total: 32 bits

### 🎯 Range:

```
-2,147,483,648  to  2,147,483,647
```

* `Integer.MAX_VALUE` = `2^31 - 1` = **2,147,483,647**
* `Integer.MIN_VALUE` = `-2^31` = **-2,147,483,648**

### 🔧 Usage:

```java
System.out.println(Integer.MAX_VALUE);  // 2147483647
System.out.println(Integer.MIN_VALUE);  // -2147483648
```

---

## 🧐 What if you expect 64-bit values?

### ⚠️ Problem:

If you're expecting to store larger values than `2^31 - 1`, using `int` will cause **overflow**.

### ❌ Example of Overflow:

```java
int x = Integer.MAX_VALUE;
x = x + 1;
System.out.println(x); // Output: -2147483648 → overflow!
```

---

## ✅ Use `long` for 64-bit values

### 📌 `long` is a **64-bit signed** data type.

### 🎯 Range:

```
-2^63 = -9,223,372,036,854,775,808  
   to  
2^63 - 1 = 9,223,372,036,854,775,807
```

### 🔧 Usage:

```java
long x = 9223372036854775807L; // Long.MAX_VALUE
System.out.println(Long.MAX_VALUE); // 9223372036854775807
System.out.println(Long.MIN_VALUE); // -9223372036854775808
```

### ✅ Example: Safe upgrade from int to long

```java
long x = (long)Integer.MAX_VALUE + 1;
System.out.println(x); // Output: 2147483648 → safe!
```

---

## 🔴 Summary Table

| Data Type | Size   | Range                                                   |
| --------- | ------ | ------------------------------------------------------- |
| `int`     | 32-bit | -2,147,483,648 to 2,147,483,647                         |
| `long`    | 64-bit | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |

---

## ⚠️ Common Mistake

```java
long.max_value // ❌ Incorrect! `long` is a primitive, not a class
```

### ✅ Correct usage:

```java
Long.MAX_VALUE
Long.MIN_VALUE
```

> ✅ `Long` (with uppercase `L`) is the wrapper class that provides constants like `MAX_VALUE`.

---

Let me know if you'd like to include `short`, `byte`, or `double` ranges too!

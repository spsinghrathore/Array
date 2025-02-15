
# **🔷 Phase 1: Fundamentals (Absolute Clarity)**  

### **🎯 Goal:**  
- Master **array operations, indexing, and memory management.**  
- Build **intuitive understanding** of array behavior in Java.  

---

## **1️⃣ Declaring, Initializing & Accessing Arrays**
### **🔹 Declaration** (Tells Java that an array exists)
```java
int[] arr;  // Preferred way
int arr[];  // Also valid, but less readable
```

### **🔹 Initialization** (Allocates memory)
```java
arr = new int[5];  // Creates an array with 5 elements (default: 0)
```

### **🔹 Combining Both**
```java
int[] arr = {10, 20, 30, 40, 50};  // Direct initialization
```

✅ **Default Values:**  
- `int` → `0`  
- `boolean` → `false`  
- `char` → `'\u0000'`  
- `Object` → `null`  

---

## **2️⃣ Indexing & Boundary Conditions**
### **🔹 Accessing Elements**
```java
System.out.println(arr[2]); // Prints 30
```

### **🚨 Out-of-Bounds Access**
```java
System.out.println(arr[5]); // ❌ Error: ArrayIndexOutOfBoundsException
```
✅ **Edge Case:** Always check `arr.length` before accessing an index.  

---

## **3️⃣ `length` Property & Iteration**
### **🔹 Using `for` Loop**
```java
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

### **🔹 Using `for-each` Loop (Enhanced for loop)**
```java
for (int num : arr) {
    System.out.print(num + " ");
}
```
✅ **Advantage:** No need for index tracking.  
❌ **Limitation:** Can't modify elements directly.  

---

## **4️⃣ 1D vs. 2D vs. Jagged Arrays**
### **🔹 1D Array**
```java
int[] oneD = {1, 2, 3};
```

### **🔹 2D Array**
```java
int[][] twoD = new int[2][3];  // 2 rows, 3 columns
```
**Memory Layout (Row-Major Order):**
```
| 0  0  0 |
| 0  0  0 |
```

### **🔹 Jagged Array (Unequal Rows)**
```java
int[][] jagged = {
    {1, 2},
    {3, 4, 5},
    {6}
};
```
✅ **Use case:** When different rows need different lengths.  

---

## **5️⃣ Memory Allocation: Stack vs. Heap**
```
Stack (Stores references)    Heap (Stores actual data)
----------------------      ------------------------
| arr  | 0xABC123  | ---> | [10, 20, 30, 40, 50] |
----------------------      ------------------------
```
- **Stack:** Holds reference variables.  
- **Heap:** Holds the actual array.  
- **Garbage Collector (GC)** cleans unreferenced arrays.  

---

## **6️⃣ Shallow vs. Deep Copy**
### **🔹 Shallow Copy (References Same Array)**
```java
int[] original = {1, 2, 3};
int[] shallow = original;  // Both point to the same memory!
shallow[0] = 99;
System.out.println(original[0]); // Prints 99 ❌
```

### **🔹 Deep Copy (Creates a New Array)**
```java
int[] deep = Arrays.copyOf(original, original.length);
deep[0] = 42;
System.out.println(original[0]); // Still 1 ✅
```

✅ **Deep copy prevents unintended modifications.**  

---

## **7️⃣ Immutable vs. Mutable Arrays**
- **Arrays are mutable**: You can change their elements.  
- But **the reference can be immutable** if declared `final`:
```java
final int[] immutableArray = {1, 2, 3};
immutableArray[0] = 100; // ✅ Allowed
immutableArray = new int[5]; // ❌ Error
```
✅ **`final` prevents reassignment, but not modification.**  

---

# **🎯 Exercises (Do These to Lock It In!)**
### **1️⃣ Print an Array in Reverse**
```java
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.print(arr[i] + " ");
}
```
✅ **Edge Case:** Handle empty arrays.  

---

### **2️⃣ Find the Max/Min in an Array**
```java
int max = arr[0];
for (int num : arr) {
    if (num > max) max = num;
}
System.out.println("Max: " + max);
```
✅ **Edge Case:** What if the array has only **one element**?  

---

### **3️⃣ Copy an Array Without Modifying the Original**
```java
int[] copiedArray = Arrays.copyOf(arr, arr.length);
```
✅ **Edge Case:** What if the original array is **null**?  

---

# **🔷 Phase 1 Summary**
| Concept | Explanation |
|---------|------------|
| **Declaration & Initialization** | Different ways to create arrays |
| **Indexing & Boundaries** | Accessing elements safely |
| **Iteration Methods** | `for` and `for-each` loops |
| **1D vs. 2D vs. Jagged** | Memory layouts |
| **Stack vs. Heap** | How Java stores arrays |
| **Shallow vs. Deep Copy** | Preventing accidental modifications |
| **Mutable vs. Immutable** | How `final` affects arrays |

---

### **✅ Next Step?**

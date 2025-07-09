## Print Numbers from 1 to N in Java

### Corrected Code

```java
class Solution {
    public void printNos(int n) {
        if (n == 0) {
            return;
        }
        printNos(n - 1);
        System.out.print(n + " ");
    }
}
```

### How It Works

- The function calls itself with `n - 1` until `n` becomes 0.
- As the recursion unwinds, it prints numbers from 1 to n in ascending order.

Example for n = 5:

- Calls:
  - printNos(5)
    - printNos(4)
      - printNos(3)
        - printNos(2)
          - printNos(1)
            - printNos(0)

- Prints during unwinding:

```
1 2 3 4 5
```

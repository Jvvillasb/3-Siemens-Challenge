### Write a C/C++ or Java program that prints each number from 1 to 100 on a new line.

For each multiple of 3, print "Foo" instead of the number.
For each multiple of 5, print "Baa" instead of the number.
For multiple numbers simultaneously of 3 and 5, print "FooBaa", instead of the number.

Your solution should be using as few lines of code as possible, but you should produce efficient code.

## Resolution

- **Avoids multiple comparisons**: The **switch** directly handles the expected values.
- **Organization**:  First, we create the **output** string, then handle specific cases in the **switch**.
- **Readability**: The logic becomes clearer and more modular.

## Link for Test: https://onlinegdb.com/ox_1R_xZr
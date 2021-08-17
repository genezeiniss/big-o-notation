#Big O Notation
Course: https://www.freecodecamp.org/news/learn-big-o-notation/

Big O notation is used to analyze the efficiency of the algorithm as its input approaches infinity. 

## Linear - Big O(n)
Represents a single for loop.

Example: If we know that dentist needs 30 minutes to treat a patient. We can calculate how much time he needs to treat 5, 10, 30, etc patients.
The longer line of patients the more calculated time it's needed. It's a linear relationship between time and number of patients, or __Big O(n)__, where _n is a number of patients_.

--> Big O(n) = n patients * 30 minutes

## Constant = Big O(1) - Best Case
__Constant__ - any step that doesn't scale with the input to the function.
execution takes the same amount of time (for example: 10 * 100) - it's constant

--> Big O(1) - constant algorithm 

### Note: 
In algorithm calculation, we care only about the worst-case efficiency. It means, that if the algorithm includes O(n) and O(1) functions, all O(1) functions are ignored.

## Square - Big O(n^2)
Represent a for loop with a single nested for loop (two-dimensional arrays).

The square function is a matrix, where each nested loop iteration represents rows;  i and j values are columns.
The area of the square is n multiplied by itself, n * n (let's assume, n equals 3, so the area is 3 * 3 = 9).

## Cubed - Big O(n^3)
Represent a for loop with two nested loops (three-dimensional arrays).

The cube has three parameters (i, j, k) - row, column and height.

The area of the cube is n * n * n (let's assume, n equals 3, so the area is 3 * 3 * 3 = 27).

#Logarithm
Simply put, the logarithm is the power that a number needs to be raised to get another number (number^number) or (number^power)

Example, to get a number 8, we want to raise some number to some power: __?^? = 8__.

In a computer science _the base number is always 2_, it means 

__2^? = 8__ or __log(2,8) = ?__ - log base 2 of 8 is ?

To find the logarithm we need to find the power that 2 needs to be raised to get 8.  
2^3 = 8; log(2,8) = 3

## O(log n)
O(log n) function is in use by __binary search__

## O(n log n)
In other words O(n * log n)

Example:
n = 4 
log(2, 4) = 2
O(n * log n) = O(4 * 2) = O(8)

O(n log n) function is in use by __merge sort__

# Common Mistakes with Big O
Functions that mistaken as O(2n):
1. Using two for loops that are NOT nested for the SAME input --> O(n) + O(n) = O(2n) --> 
   but constants are ignored, so it's just return a complexity of O(n)
2. Using two for loops that are NOT nested for the DIFFERENT input --> 
   the inputs can be in different sizes, so we need to keep track for both inputs --> O(a+b) (and not O(2n))
3. Nested for loop --> for each iteration of outer loop we run a fool inner loop --> O(n^2) (not O(2n))



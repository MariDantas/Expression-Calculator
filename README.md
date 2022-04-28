# Expression Calculator
This project contains a calculator that gets an input number from the user and applies the bellow formula to it. Assuming the given number is 38, the calculation will be:

&nbsp;

![image](https://user-images.githubusercontent.com/61691909/165219835-d083e03c-6ee0-4904-843c-53d02ec38f57.png)

&nbsp;

The first thing I did in my code was to determine that the number entered by the user must be greater than or equal to 2, because otherwise the calculation would throw an error. As it can be seen in this formula, the calculation finishes on **2 * 1**, so that's the minimum value the user must enter.

The formula also shows that the given number will keep decrementing, and each division will be this number multiplied by itself minus 1. However, the given number by the user also acts as the divider, and in this position, it does the opposite: it keeps incrementing. For that reason, I created a **j** variable that receives the number and is responsible for the multiplication part, and the **i** variable that keeps incrementing until it reaches the number minus 1 (note that, in the calculation above, the last divider is 37) and will do so within the for loop, serving both as the divider and the controller of the loop.

In order to show to the user each step of the calculation, I created the variable **currSum** that stores the value of the current result before it receives a new value. This way I can show the user how the result was before and how it is with new values added or subtracted. There's also the formula being printed with the numbers used at that moment.

Finally, I realized a pattern in this formula: when the value of the divider is 1 or is an even number, the sign is positive. In any other cases it changes to negative. I applied that rule using two if statements, changing the operation to sum or subtraction according to the conditions.

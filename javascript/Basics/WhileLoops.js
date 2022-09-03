/* "while" loop */
/*
    Syntax for the JavaScript "while" loop is:

        while (condition) {
            // body of loop
        }

    Here,
        1. A while loop evaluates the condition inside the parenthesis ().
        2. If the condition evaluates to true, the code inside the while loop is executed.
        3. The condition is evaluated again.
        4. This process continues until the condition is false.
        5. When the condition evaluates to false, the loop stops.
*/

// program to display numbers from 1 to 5
// initialize the variable
let i = 1;
let n = 5;

// while loop from i = 1 to 5
while (i <= n) {
  console.log(i);
  i += 1;
}

/* "do...while" loop */
/*
    The "do...while" loop is similar to the "while" loop. The only difference 
    is that in do…while loop, the body of loop is executed at least once.

    Syntax for the JavaScript "do...while" loop is:
    
        do {
            // body of loop
        } while(condition)

    Here,
        1. The body of the loop is executed at first. Then the condition is evaluated.
        2. If the condition evaluates to true, the body of the loop inside the do statement is executed again.
        3. The condition is evaluated once again.
        4. If the condition evaluates to true, the body of the loop inside the do statement is executed again.
        5. This process continues until the condition evaluates to false. Then the loop stops.
*/
// program to display numbers
let j = 1;
const m = 5;

// do...while loop from 1 to 5
do {
  console.log(j);
  j++;
} while (j <= m);

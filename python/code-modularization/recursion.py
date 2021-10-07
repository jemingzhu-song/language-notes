# ---------- Recursion ---------- #
# Sometimes, in order to compute the output of a function, you may find you need to use the output of the same 
# function but with a different input. This (very powerful) concept is known as recursion and it is arguably what 
# separates a computer from a simple desktop calculator. 

# In Python (and most programming languages), you can have a function call itself to implement recursion. Writing 
# code recursively has some advantages: it can lead to simpler (easier to maintain) code; and it can highlight the 
# connection between the required solution and the solution of a simpler problem.

# For example, suppose you want to create a function that calculates, for a given number n, the factorial of n, which 
# is 1 × 2 × 3 × ... × n. (For example, the factorial of 6 is 1 × 2 × 3 × 4 × 5 × 6 = 720.)

# You could do this using a loop:
def factorial(n):
	result = 1
	for x in range(1, n+1):
		result *= x
	return result

number = int(input('Enter a number: ')) # Must convert the input to an integer
print('The factorial of', number, 'is', factorial(number))

# An alternative approach would be to observe that the factorial of n can be obtained by multiplying the factorial of 
# (n-1) by n. So if we knew what the factorial of (n-1) was, then we can use that to compute the factorial of n. 
# This is a recursive solution - the output of the function for n can be built up from the output of the function for 
# (n-1). 

# Of course, we can compute the factorial of (n-1) in a similar way [by multiplying the factorial of (n-2) by (n-1)], 
# reducing the problem to computing the factorial of (n-2). And so on, effectively reducing the problem to computing 
# the factorial of 1 and then building the solution up to compute the factorial of n. This leads to the simpler:
def factorial_recursive(n):
    # Base Case
    if n == 1:
        return n
    # Recursion - the function calls itself
    return factorial_recursive(n-1) * n

number = int(input('Enter a number: ')) # Must convert the input to an integer
print('The factorial of', number, 'is', factorial_recursive(number))

# here are some disadvantages to programming recursively. If you are not careful then your program might end 
# up doing a lot of recursion. Python will raise an error if this happens:
def do_it():
	do_it()
do_it()
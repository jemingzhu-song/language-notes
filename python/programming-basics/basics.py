# ---------- Programming Basics ---------- #
# Here is a very simple Python program: 
print('Hello, World!!!')

# ---------- Execution ---------- #
# You can execute the program (i.e. run it) by clicking 'Run'. When you do, the 
# Python interpreter executes each line of the program, one at a time, from beginning to 
# end (in this case there is only one line).

# ---------- Statements ---------- #
# Each line the program is called a statement. Your programs will typically contain 
# many statements. Here is one with two statements:
print('Hello, world!')
print('Goodbye, world!')

# ---------- The print() Function ---------- #
# print() is a Python function, one that you will find yourself using often. 'Hello world!' 
# is an argument of the function - some input that we give to the function. 
# The print() function performs the task of printing the argument.

# Try modifying the program below to make it print your name (you need to use quotation marks):
print()

# If you supply print() with multiple arguments it will print them all, separated by spaces. 
# You will find this very useful: 
print('The value is', 10*2)

# This behaviour can be changed by setting the sep argument to print()
a = 10
print('The value of a', a, sep=' = ')

# print() adds a newline to the end of its output, this behaviour can be changed by setting the end argument
print('hello', end='\t-\t') # \t is a tab character
print('world', end='.\n') # \n is a newline character

# ---------- Getting User Input ---------- #
# Another Python function that you will use often is input(), which you can use to get input from the user. 
# For example:
print(input('What would you like to print? '))
# This program asks the user for some input and then prints it.

# ---------- Syntax Errors ---------- #
# Before executing a program the interpreter first checks that it has correct syntax. If it finds any syntax 
# errors it will tell you, and not run the program. The following program contains a syntax error 
# (it's missing a quotation mark) - try running it:
# print('Hello, world!)

# ---------- Runtime Errors ---------- #
# Sometimes the syntax of a program is fine, but Python raises an error during its execution. 
# These are called runtime errors. When this happens, execution stops, and Python returns some 
# information about the error.

# For example, the following program asks Python to divide a number by zero, which is impossible. 
# It generates a runtime error:
print(10/0)

# ---------- Comments ---------- #
# In Python, anything on the same line after a # will be ignored by the Python interpreter. 
# This allows you to add comments. It is important that the programs you write are easily 
# understandable by someone who reads them. To help with this it can be a good idea to add comments throughout.

# Here is an example from above, with an explanatory comment added:
# Ask the user for input and then print it:
print(input('What would you like to print? '))

# Comments can start anywhere on a line (but use comments on the same line as the code sparingly):
print(input('What would you like to print? ')) # Ask the user for input and then print it

# ---------- Disabling Code ---------- #
# You can also use # to disable one or more lines of code, either because they are not 
# yet finished and will cause an error, or because your program is not working and you 
# are trying to find the cause of the error, or because you are not using them but want to save them 
# just in case you decide to use them again. For example:
print('Hello, world!')
# print('Goodbye, world!')
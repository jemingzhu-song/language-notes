# ---------- Functions ---------- #
# So far you've been using functions that are built-in to Python, such as input() , print(), and len(). 
# Like many other languages, Python allows you to define your own functions. This allows you to write more elegant 
# and powerful programs.

# ---------- Defining a Function ---------- #
# You can define a function using the def keyword:
def say_hello():
    print('Hello')

# Once you have defined the function you can call it like any other function:
say_hello()

# ---------- Naming Functions ---------- #
# The rules for naming functions are the same as for naming variables. Although it is not 
# required, it has become conventional to use lowercase words separated by underscores, 
# e.g, say_hello. You should choose names that help to document your code - naming the above 
# function say_hello, for example, is more explanatory than naming it hello . 

# ---------- Adding Parameters ---------- #
# You can add parameters to a function, to specify that the function should receive one or more arguments when it is called. 
# You do this by adding parameter names in the brackets after the function name:
def say_hello(name):
	print('Hello,', name)
    
say_hello('James')

# When you call a function you must supply it with the right number of arguments - one for 
# each parameter. If the function has no parameters then you must supply no arguments; if 
# the function has one parameter then you must supply exactly one argument; and so on. If you 
# supply the wrong number of arguments then Python will raise an error. The say_hello() function
# defined above has one parameter, so you must supply it with exactly one argument:
def say_hello(name):
	print('Hello,', name)
    
say_hello() # Error - not enough arguments

# ---------- Adding Default Values ---------- #
# You can give parameters default values. If no argument is provided for that parameter then the function 
# will use the default value.
def say_hello(name = 'James'):
	print('Hello,', name)
say_hello() # The default value will be used
say_hello('Sarah') # The default value will not be used
# You can use this feature to make arguments optional - Python won't raise an error if the argument is not supplied, 
# it will just use the default value. If you set the default value to None then you can use this to detect whether an 
# argument was supplied for the parameter:
def say_hello(name = None):
    if name is None:
        print('No name was provided')
    else:
        print('Hello,', name)
        
say_hello()
say_hello('Sarah')

# ---------- Returning Values ---------- #
# You can use a return statement to get the function to return a value.
def sum(x, y):
    return x + y

print(sum(1, 2))

# The function will exit immediately after a return statement, so any further statements in the function 
# block will not be executed.
def sum(x, y):
    return x + y
    print('Test') # Will not be executed
    
print(sum(1, 2))

# You can get the function to return two or more values as a tuple, by separating them by commas:
def ends(string):
    first_char = string[0]
    last_char = string[-1]
    return first_char, last_char
print(ends('Australia'))
print(ends('Australia')[0])
print(ends('Australia')[1])

# ---------- Supplying Arguments by Keyword ---------- #
# If your function has many parameters then it can be difficult to remember the order in which they need to be supplied 
# when you call it, and it can be difficult for someone reading the code to tell which is which:
def divide(numerator, denominator, num_places):
	return round(numerator/denominator, num_places)

# Not clear which number is which, and order matters:
print(divide(5, 6, 3))
print(divide(3, 6, 5)) # Different result

# To make things easier, arguments can be supplied by keyword:
def divide(numerator, denominator, num_places):
	return round(numerator/denominator, num_places)

# Clear which number is which, and order doesn't matter:
print(divide(numerator = 5, denominator = 6, num_places = 3))
print(divide(num_places = 3, denominator = 6, numerator = 5)) # Same result

# ---------- Allowing an Arbitrary Number of Arguments ---------- #
# Suppose you want a function that returns the smallest of a given set of numbers. Suppose also that you want to allow 
# any number of values to be given. One way would be use to single parameter which expects a list. You must provide 
# exactly one argument, a list, but the list can be as long as you like:
def smallest(numbers): # Expects numbers to be a list
    smallest = numbers[0]
    for n in numbers:
        if n < smallest:
            smallest = n
    return smallest
print(smallest([42, 12])) # Provide a single list of 2 numbers
print(smallest([4, 11, 15, 2, 3])) # Provide a single list of 5 numbers

# Another way is to precede the name of the parameter with an asterisk. Then you can provide as many numbers as you 
# like, not together in a single list, but each as a separate argument in its own right. The function will 
# automatically combine them into a list:
def smallest(*numbers):
    smallest = numbers[0]
    for n in numbers:
        if n < smallest:
            smallest = n
    return smallest
print(smallest(42, 12)) # Provide 2 arguments
print(smallest(4, 11, 15, 2, 3)) # Provide 5 arguments

# ---------- Pass ---------- #
# Function definitions cannot be empty, so if you want a function definition with no content then you need to
# use the pass statement to avoid Python raising an error
def my_func():
    pass

# ---------- Variable Scope ---------- #
# If you create a variable inside a function then that variable is only defined inside the function. We say that the 
# variable's scope is limited to the function, or the variable is locally defined. If you try to use a variable 
# outside its scope then Python will raise an error.
def my_func():
    x = 5
# print(x)

# Even if you have used the same variable name outside the function, changes to variables defined inside the 
# function are limited to occurring inside the function. This can be a problem if you use locally defined variables 
# with the same name as globally defined variables (i.e. variables not declared within the scope of a function) - 
# this is known as variable shadowing. 

x = 3 # Globally defined x

def my_func():
    x = 5 # Locally defined x - changes to this x will not be reflected outside the function
    
my_func() # even calling my_func() will not change the global x variable.
print(x) # Calls print on the global x variable.

# If you want to use globally defined variables inside functions, the safest approach is 
# to use the arguments and return values.
x = 3

def my_func(y):  # y is a locally defined variable
    return y+2   # make the changes to y and pass them back as the return value

x = my_func(x) # This will update the globally defined variable x
print(x)
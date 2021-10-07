# ---------- Higher Order Functions ---------- #
# Functions are objects, and you can use them as values just like other values such as 
# numbers, strings, lists, and so on. Just as we might set a variable's value to a number, 
# such as 1, we might also set it to a function, such as len. (Because of this we say that 
# Python functions are first class.)

# This allows you to supply functions as arguments to functions:
def add(x, y):
	return x + y
def subtract(x, y):
	return x - y
def apply(f, x, y):
	return f(x, y)

print(apply(add, 10, 1))
print(apply(subtract, 10, 1))

# Here's another example. In this case we define a function compose, which takes two functions 
# f and g as arguments and returns a function - it returns the composition of f and g, which 
# is the function that takes an argument x and returns f(g(x)):
def add1(x):
	return x + 1
def subtract1(x):
	return x - 1
def compose(f, g):
	return lambda x: f(g(x))

add2 = compose(add1, add1)
print(add2(10))
do_nothing = compose(add1, subtract1)
print(do_nothing(10))
# Functions that take other functions as input as known as higher order functions.

# Another example of this is the pre-defined sort() function, where by passing in a "key", we can
# modify the behaviour of it

# ---------- Sorting with a Function ---------- #
# Suppose you have a list of words and you want to sort them by length. If you use the sort() 
# method then you will get the wrong result - it will sort them alphabetically.

# What you need to do is sort using a function that returns, for each item in the list, a value 
# that you would like to sort the item by. In this case we want to sort by length, so we can use 
# the len() function.
x = ['dog', 'chicken', 'mouse', 'horse', 'goat', 'donkey']
x.sort(key=len)
print(x)
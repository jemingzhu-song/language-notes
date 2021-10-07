# ---------- Expressions ---------- #
# To work with an object you need to refer to it, and to refer to it you use an expression. 

# ---------- Literals ---------- #
# One way of referring to an object is to use a literal. Literals show explicitly 
# which object they refer to. Here are some examples: 
# • Integer literals: 1, 26, -14
# • Floating-point literals: 3.14, 0.06, -9.7
# • String literals: 'Hello', "Goodbye" (you can use single or double quotes, but they must match)
# • Boolean literals: True, False (there are only two)
# • None literal: None (there is only one)

# ---------- Variables ---------- #
# You can also refer to an object using a variable. You have to specify which object the variable refers to, 
# using the assignment operator =. Consider the program below:
message = 'Hello there'
print(message)

# The first line introduces a variable message and assigns it the string object 'Hello there'. 
# The second line uses this variable to print the object.
# Once you introduce a variable you can use it as many times as you like throughout your program:
message = 'Hello there'
print(message)
print(message)
print(message)
print(message)
print(message)

# You can change the value of a variable in a program as often as you like:
message = 'Hello there'
print(message)
message = 3.14
print(message)
message = True
print(message)

# Notice that the variable message in the program refers to different types of object as 
# the program proceeds - first a string, then a floating-point number, then a boolean. 
# Because variables can do this we say that Python has flexible typing.

# You can use variables to define other variables:
message = 'Hello there'
new_message = message
print(new_message)

# Note that assignment associates objects to variables, not variables to variables. 
# If you change the object a variable is assigned to, it does not affect other variables that 
# were assigned to the original object:
message = 'Hello there'
new_message = message
print(new_message)
message = 'Goodbye'
print(new_message)

# You must assign a value to a variable before you use it, otherwise Python will generate an error:
# print(undefinedmessage)

# If you want to introduce a variable without giving it a value then you can assign it the None object:
var = None
print(var)

# You can also assign values to multiple variables at the same time:
hello, goodbye = 'Hello', 'Goodbye'
print(hello)
print(goodbye)

# ---------- Naming Variables ---------- #
# In Python, a variable name can be of any length and contain a sequence of uppercase letters (A-Z), 
# lower case letters (a-z), digits (0-9) and the underscore (_). The first character however, 
# cannot be a digit. As long as you follow these rules you can name your variables whatever you like.

# Note that variables names are case sensitive. The program below generates an error because 
# the variable Message is not given a value before it is used (the variable message is, but 
# that's a different variable):
# message = 'Hello there'
# print(Message)

# It is best to choose names for your variables that make the intention of your program as clear as possible. 
# Consider the following two pieces of code:
# var1 = 10
# var2 = 120
# print(var1 * var2)
# days = 10
# fish_per_day = 120
# print(days * fish_per_day)
# Both pieces of code do the same thing, but the second makes it much clearer what is going on. 
# In effect, by choosing variable names carefully we can use them to help explain the code.
# It is fairly standard to make variable names lowercase, with words separated by 
# underscores, e.g, fish_per_day.

# ---------- Choosing Types ---------- #
# You can get Python to return an object of a certain type by using the functions int(), float(), str(), bool(), 
# list(), tuple(), set(), and dict(). For example, if you would like var to refer to the floating-point 
# number 1 rather than the integer 1 you can use the float() function:
var = 1 # var refers to the integer 1
print(var, type(var))

var = float(1) # var refers to the floating point number 1.0
print(var, type(var))

# You might need to do this when you are getting user input. Python treats user input as a string, 
# so if you are asking the user to enter a number then you will need to convert the input, using int() or float():
# number will be a string:
number = input('Enter a number: ')
print(number, type(number))

# number will be an integer:
number = int(input('Enter a number: '))
print(number, type(number))

# number will be a float:
number = float(input('Enter a number: '))
print(number, type(number))

# Sometimes Python can't return an object of the type you are asking for, and it will raise an error. 
# For example, Python cannot make every string into an integer:
var = int('hello')
print(type(var))

# You can use the same functions to change the type of object a variable refers to after it has been set: 
var = 2 # var refer to the integer 2, by default
print(var, type(var))

var = float(var) # var now refers to the floating-point number 2.0
print(var, type(var))

var = str(var) # var now refers to the string '2.0'
print(var, type(var))

# Note that when it operates on a floating-point number the int() function truncates all decimal places:
print(int(1.2))
print(int(-1.2))

# ---------- Constants ---------- #
# If you intend the value of a variable not to change, then you are using it as a constant. 
# It is conventional to indicate this by naming it using all capital letters, with underscores 
# separating the words, e.g, MAX_INT. One of the main reasons for using constants is to give an indication 
# as to why a particular value is being used (e.g. using the constant HOURS_PER_DAY instead of the literal 24), 
# so again, it's best to use names that help to explain what your program does:
HOURS_PER_DAY = 24
MINUTES_PER_HOUR = 60
num_days = int(input('How many days? '))
num_minutes = num_days * HOURS_PER_DAY * MINUTES_PER_HOUR
print(num_days, 'days is', num_minutes, 'minutes')

# Note that just with any other variable, it is possible for the program to change the value of a constant - 
# it is up to the programmer to ensure that variables that are intended to be constants do not change after 
# they are defined.


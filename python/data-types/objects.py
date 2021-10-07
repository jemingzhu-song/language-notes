# ---------- Objects ---------- #
# When you program with Python (and many other languages) you will work a lot with objects. 
# Objects encapsulate a piece of data (which may be simple, such as a single number; 
# or more complex, such as a collection of smaller objects) and are the building blocks of Python. 
# For example, in the statement print('The value is', 10*2), 'The value is', 10 and 2 are all objects. 
# Indeed, even the print() function is an object. 

# ---------- Types ---------- #
# Every object is of a certain type. The type of an object determines how Python interacts with it, 
# for example it makes sense to add two numbers, but it does not make sense to add functions. 
# In Python, the main types are:

# • Integer (int). A whole number, positive or negative, including zero (i.e. ..., -2, -1, 0, 1, 2, ...).

# • Floating-point number (float). A positive or negative number, not necessarily whole, 
#   including zero (e.g. 3.14, -0.12, 89.56473).
# • String (str). A sequence of characters (e.g. 'Hello', 'we34t&2*'). Used to store text.
# • Boolean (bool). A truth value, either true or false.
# • List (list). An ordered container of objects.
# • Tuple (tuple). An immutable list (i.e. one that cannot be changed).
# • Set (set). An unordered container of unique objects.
# • Dictionary (dict). A set of key-object pairs.
# • Function. A piece of code that can be run by calling it.
# • Class. A user-defined type of object.

# ---------- "None" Type ---------- #
# Python also has a special object, None, which represents the absence of an object. Somewhat paradoxical! 

# ---------- Checking the Type of an Object ---------- #
# You can find out the type of an object by using Python's type() function:
print(type(1))
print(type(3.14))
print(type('Hello'))
print(type(None))
print(type(print))

# You can also use Python's isinstance() function, to check whether an object is of a certain type 
# (so-called because an object is an instance of its type):
print(isinstance(1, int)) # True
print(isinstance(1, float)) # False
print(isinstance(3.14, float)) # True
print(isinstance(3.14, int)) # False
print(isinstance('Hello', str)) # True
print(isinstance('Hello', float)) # False

# ---------- Attributes ---------- #
# Objects have attributes. Attributes are properties that are specific to the object. 
# For example, the string object 'Hello', has an attribute upper(), which is a function that 
# produces an upper-case version of the string. You can access this attribute of the string by 
# using dot notation:
print('Hello'.upper())

# It can be useful to think of '.' as representing " 's " (i.e. apostrophe-s) - the statement 'Hello'.upper() 
# is instructing Python to execute the upper() function of the 'Hello' object.

# When an attribute is a function, like this one is, it is also called a method. 
# Attributes which are not methods are also known as fields.

# Which attributes an object has depends upon what type of object it is. String objects have the upper() 
# attribute (method), but integer objects do not. If you try to access this attribute of an integer you 
# will get an error.

# You will be learning more about the attributes that each type of object has.

# ---------- Other Functions ---------- #
# You can define a function inside another function, and when you do it is called a nested function. 
# The nested function is only available to be called inside the enclosing function.
def acronym(string):
    result = ''
    words = string.split(' ')
    def upper_first(string):
        return string[0].upper()
    for word in words:
        result += upper_first(word)
    return result
print(acronym('World Health Organisation'))

# Sometimes you might want to define a function without giving it a name.

# Suppose, for example, you have a list of names and you want to sort those names by their last letter. You can use 
# the list's sort() method to do this, using a key and function. One way is to define the function you need, give it a 
# name, and then use that name in the sort() method:
def last_letter(name):
    return name[-1]

names = ['Geoff', 'Kim', 'Louise', 'Tam', 'Helen']
names.sort(key=last_letter) # Use the function defined above
print(names)

# Another way is to specify the function directly in the sort() method, by using a lambda function, which is a function 
# without a name:
names = ['Geoff', 'Kim', 'Louise', 'Tam', 'Helen']
names.sort(key=lambda name: name[-1]) # No need to define a function in advance
print(names)

# The syntax of a lambda function is as follows:
# lambda parameter(s): expression

# Lambda functions can have more than one parameter:
lambda a, b: a + b
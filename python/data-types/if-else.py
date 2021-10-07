# ---------- If ---------- #
# ---------- If Statements ---------- #
# In a simple program Python executes the statements of the program one-by-one, from start to finish. 
# However, you will often want Python to execute a certain statement only if a certain condition is 
# satisfied. For this you can use an if statement.

# The following program uses an if statement:
number = int(input('What is your favourite number? '))
if number == 42:
    print('That is my favourite number too!')
print('Good bye')
# If the user enters the number 42 then Python executes line 3, otherwise it skips line 3 and 
# goes straight to line 4.

# ---------- Syntax ---------- #
# The syntax for an if statement is:
# if <expression>:
#     <statement(s)>

# There are two parts to this statement - the part between if and : is called the header of the statement; 
# the rest is called the body of the statement.

# Notice that the body contains one or more statements (as many as you like), so an if statement 
# contains other statements as part of it. Because of this we call it a compound statement. 

# Also notice that body is indented. This is required - if you don't use indentation then Python will 
# issue an error: 
if True:
    print('Hello')

# You can use either the tab character or the space character to create the indentation, but you must 
# use the same character for each line, and the same number of those characters, otherwise Python will 
# issue an error. Each of the following will cause an error:
# if True:
# 	# print('Hello') # Indentation using a tab
#     # print('Hello') # Indentation using 4 spaces
# if True:
#     print('Hello') # Indentation using 4 spaces
#      print('Hello') # Indentation using 5 spaces

# The statement block after if must contain at least one statement. It is common use the pass 
# statement as a placeholder for unfinished code - it is a statement that does nothing:
if True:
	pass # There must be at least one statement in the body

# ---------- Conditions ---------- #
# Any Boolean expression can be used between the if and the : :
if True:
    print('The condition is true')
if 2 > 1:
    print('The condition is true')
if 2 > 1 and 2 < 3:
    print('The condition is true')
if 1 > 2 or 2 > 1:
    print('The condition is true')
if 'cat' == 'cat':
    print('The condition is true')

# ---------- Being Careful with Variables ---------- #
# If you introduce a variable inside the block of an if statement then that variable will 
# only be defined if the block is executed. This might cause you some unexpected errors. For example:
# if False:
#     x = 1
# print(x)
# Since line 2 is not executed the variable x does not get defined, so when it is used in 
# line 3 Python issues an error.

# ---------- Else Clauses ---------- #
# You can add an else clause to an if statement, to tell Python what to do if the 
# condition of the if statement is false:
number = int(input('What is your favourite number? '))
if number == 42:
    print('That is my favourite number too!')
else:
	print('That is not my favourite number.')

# ---------- Elif Clauses ---------- #
# You can add elif clauses (short for 'else if') to chain together multiple conditions:
number = int(input('What is your favourite number? '))
if number == 42:
    print('That is my favourite number too!')
elif number == 21:
    print('That is my second favourite number')
else:
    print('That is neither of my favourite numbers.')


# ---------- Abbreviations ---------- #
number = int(input('What is your favourite number? '))
if number == 42: print('That is my favourite number too!')
elif number == 21: print('That is my second favourite number')
else: print('That is neither of my favourite numbers.')

# ---------- Nesting ---------- #
# Inside the block of an if statement we can have other if statements:
number = int(input('What is your favourite number? '))
if number > 10:
    print('That is a big number')
    if number > 100:
        print('It is bigger than 100')
print('Good bye')

# ---------- Breaking Up Compelx Expressions ---------- #
# Do not try to do too much in one go by building overly complex expressions; code should not 
# be concise at the expense of readability. Consider the following two pieces of code:

# Piece 1:
# if (is_admin and not admin_expired) or (is_person and (has_override or special_override)):
#     call_security()
# else:
#     activate_launch()

# Piece 2:
# if is_admin and not admin_expired:
#     call_security()
# elif is_person and has_override:
#     call_security()
# elif is_person and special_override:
#     call_security()
# else:
#     activate_launch()

# The second piece of code is vastly more clear on the conditions required for a launch.
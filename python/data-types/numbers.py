# ---------- Numbers ---------- #
# ---------- Numbers in Python ---------- #

# Python has 3 builtin types for numbers: 

# • int - representing whole numbers (positive and negative integers) with unlimited precision 
#   (i.e. there is no a priori maximum or minimum value an int object can have)
# • float - representing floating point numbers (non-whole numbers) with a limited precision 
#   (i.e. a float object is limited to a certain number of significant figures)
# • complex - representing complex numbers [not covered in this course]

# While numeric types are largely interchangeable (for example you can add an int to a float), 
# a common source of runtime errors is when objects of the wrong type are being used (for example 
# using a float when an int was expected or vice versa).

# ---------- Operating on Numbers ---------- #
# You can add, subtract, multiply, divide numbers by using the operators +, -, *, /, respectively, 
# and combinations of them:
print(1 + 2)
print(10 - 5)
print(3 * 4)
print(20/4)
print((1 + 2)*(3 + 4))
print(10/(3-1))

# You can raise one number to the power of another number by using the exponentiation operator, **:
print(10**2) # 10 to the power 2
print(2**3)  # 2 to the power 3

# You can divide one number by another number and round down to the nearest whole number 
# by using the integer division operator, //:
print(10//3) # 10 divided by 3 and rounded down

# Note the effect of using // on negative numbers:
print(-10//3) # -10 divided by 3 and rounded down

# You can divide one number by another number and get the remainder by using the modulus operator, %:
print(10 % 3) # The remainder when 10 is divided by 3

# ---------- Order of Operations ---------- #
# Python has an inbuilt precedence with its arithmetic operations: ** will be evaluated before 
# any of *, /, //, % and these will be evaluated before any of +, -. 
# With the exception of ** operations with the same precedence are 
# evaluated left-to-right. ** is evaluated right-to-left. Parentheses can be used to change 
# the inbuilt evaluation order.
print(1+2*3) # Same as 1 + (2*3) 
print(2**3*4) # Same as (2**3) * 4
print(24/6*2) # Same as (24/6) * 2
print(24/6/2) # Same as (24/6) / 2
print(2**2**3) # Same as 2**(2**3)

# ---------- Augmented Assignment Operators ---------- #
# You will often find yourself wanting to operate on a variable and then re-assign the result to the variable. 
# Python provides augmented assignment operators to allow for more concise code: +=, -=, ,*=, /=, //=, and %= .
# • x += 2 is equivalent to x = x + 2
# • x -= 2 is equivalent to x = x - 2
# • x *= 2 is equivalent to x = x * 2
# • x /= 2 is equivalent to x = x / 2
# • x //= 2 is equivalent to x = x // 2
# • x %= 2 is equivalent to x = x % 2
x = 12
x += 2
print(x)

# ---------- Comparing Numbers ---------- #
# Python has a number of comparison operators which you can use to compare numbers:

# • num1 == num2 is True if the value of num1 equals the value of num2, otherwise it is False
# • num1 is num2 is True if the value of num1 equals the value of num2, and num1 and num2 have the same type, 
#   otherwise it is False
# • num1 != num2 is True if the value of num1 does not equal the value of num2, otherwise it is False
# • num1 is not num2 is True if the value of num1 does not equal the value of num2, or num1 and num2 have 
#   different types, otherwise it is False
# • num1 < num2 is True if the value of num1 is less than the value of num2, otherwise it is False
# • num1 <= num2 is True if the value of num1 is less than or equal to the value of num2, otherwise it is False
# • num1 > num2 is True if the value of num1 is greater than the value of num2, otherwise it is False
# • num1 >= num2 is True if the value of num1 is greater than or equal to the value of num2, otherwise it is False
print(1 == 1.0)
print(1 is 1.0)

# ---------- Floating Point Numbers and "==" ---------- #
# Because floating point numbers have limited precision you will experience strange results 
# when attempting to compare them with ==. For example:
print(0.1 + 0.2 == 0.3)
# Why does this comparison return False? Because 0.1 + 0.2 is not what you would expect:
print(0.1 + 0.2) # Should return: 0.30000000000000004

# Note: the round() function implements round half to even:
print(round(4.5,0))
print(round(5.5,0))
print(round(-4.5,0))
print(round(-5.5,0))

# ---------- Numeric Functions ---------- #
# Python has the functions int(), float(), abs(), pow(), round() that you can use to manipulate numbers:
print(int('3') + float('2.0')) # Convert strings to numbers and add them
print(abs(-5)) # Absolute value of -5
print(pow(2, 4)) # 2 to the power of 4.  This is the same as **
print(round(3.567, 2)) # Round 3.567 to 2 decimal placesx
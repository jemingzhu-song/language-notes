# ---------- Strings ---------- #
# ---------- Strings in Python ---------- #
# Strings are ordered sequences of characters, and a character is essentially anything 
# you can type on the keyboard in one keystroke (technically a character is a unicode character, 
# so it does include many other symbols including foreign letters, mathematical symbols and non-printable text).
# As we have seen, you define a string literal with text between either single quotes ' ', or double quotes " ".
literal_one = 'A string'
literal_two = "A string" # These are the same string literals
print(literal_one)
print(literal_two)

# One of the most useful strings is the empty string - a string with 0 characters. This object is 
# different to the None object seen earlier.
empty = ''
none = None
print(empty)
print(none)

# Sometimes you will need to use a string literal that contains quote marks or other special 
# characters that Python will interpret as syntactical elements. You can do this by escaping those 
# special characters, by prefixing them with a backslash \.
# Backslash used to escape a quote mark
print('Penny\'s dog')

# Backslash used to escape a new line symbol
print('This is one line.\nThis is a second line')

# Backslash used to escape a tab symbol
print('Here\tThere')

# You can avoid having to escape single quote marks by enclosing the whole string in double quotes. 
# Similarly, you can avoid having to escape double quote marks by enclosing the whole string in single quotes:
print("Penny's dog")
print('Penny said, "This is my dog".')

# If you like to include line breaks in a string then you can either use \n, as in the example above, 
# or you can use triple quotes around the string:
# Using \n
text = 'This is one line.\nThis is a second line'
print(text)

# Using triple single quotes
text = '''This is one line.
This is a second line.'''
print(text)

# Using triple double quotes
text = """This is one line.
This is a second line."""
print(text)

# ---------- Operating on Strings ---------- #
# You can concatenate strings using the + operator:
first_name = 'Leo'
last_name = 'Tolstoy'
full_name = first_name + ' ' + last_name
print(full_name)

# You can also use the += augmented assignment operator:
name = 'Leo'
name += ' '
name += 'Tolstoy'
print(name)

# You can duplicate a string a given number of times by using the * operator:
print('a' * 10)

# ---------- Comparing Strings ---------- #
# Just as with numbers, Python has a number of builtin comparison operators that allow you to compare strings:
# • str1 == str2 is True if str1 and str2 are the same sequence of characters, otherwise it is False
# • str1 != str2 is True if str1 and str2 are not the same sequence of characters, otherwise it is False
# • str1 in str2 is True if str1 appears as a substring in str2, otherwise it is False
# • str1 not in str2 is True if str1 does not appear as a substring in str2, otherwise it is False
# • str1 < str2 is True if str1 is lexicographically less than (i.e. would appear earlier in the dictionary) 
#   the value of str2, otherwise it is False
# • Similarly we have str1 <= str2, str1 > str2, and str1 >= str2
print('A' < 'B')
print('AA' < 'AB')
print('A' < 'AA')

# ---------- String Functions ---------- #
# We have seen the str() function to convert a non-string object into a string:
num = 3
message = str(num*num)
print(message)
# You can use the len() function to find the length of a string:
print(len('abcde'))

# ---------- String Methods ---------- #
# Many more useful methods for modifying strings can be found as attributes of the string object. 
# For example, you have the following string methods available to use:
# • str.capitalize() - Returns str with the first character uppercase and the rest lowercase
# • str.count() - Returns the number of times a specified value occurs in str
# • str.endswith() - Returns true if str ends with the specified value
# • str.find() - Searches str for a specified value and returns the index at which it is 
#   first found (or -1 if it was not found)
# • str.format() - Returns str formatted as specified
# • str.isalpha() - Returns true if all characters in str are from the alphabet
# • str.isdigit() - Returns true if all characters in str are digits
# • str.islower() - Returns true if all characters in str are lower case
# • str.isspace() - Returns true if all characters in strare whitespace characters (i.e. space, tab, or new line)
# • str.isupper() - Returns true if all characters in str are upper case
# • str.lower() - Returns str converted to lower case
# • str.lstrip() - Returns str with whitespace stripped from the left end 
# • str.replace(old, new) - Returns str with old replaced by new
# • str.rfind() - Searches str for a specified value and returns the index at which it is last found 
#   (or -1 if it was not found)
# • str.rstrip() - Returns str with whitespace stripped from the right end 
# • str.split() - Splits str using a specified delimiter and returns the result as a list
# • str.startsswith() - Returns true if str starts with the specified value
# • str.strip() - Returns str with whitespace stripped from both ends 
# • str.title() - Returns str with the first character of each word in upper case
# • str.upper() - Returns str with every character in upper case
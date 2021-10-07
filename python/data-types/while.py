# ---------- While ---------- #
# ---------- While Statements ---------- #
# Sometimes you might want to repeat a set of statements for as long as a certain condition is true. 
# For this you can use a while statement.

# Here's a program that uses a while statement to print the first 10 positive integers:
n = 1
while n <= 10:
    print(n)
    n = n + 1
print('Finished')

# When Python gets to line 2 it evaluates the condition after while. If the condition is true 
# then it executes the statement block below, in lines 3-4, and then returns to line 2 again. 
# If the condition is false then it skips the block and goes straight to line 5.

# You could achieve the same effect by using 10 different print statements, but using a while 
# statement is more elegant and less repetitive. And if you don't know in advance how many integers 
# to print, for example if you want to ask the user, then it might be impossible to use just print statements.

# ---------- The While Block ---------- #
# The while block can contain any statement(s) you like, including if statements and other while statements. 
# For example, here's a program that prints the even numbers between 1 and 10. It uses an if statement inside 
# the while loop:
n = 1
while n <= 10:
    if n % 2 == 0:
        print(n)
    n = n + 1
print('Finished')

# Here is an example of a while loop used to iterate through a string, counting the number of times 'e' occurs in it.
string = 'The quick brown fox jumped over the lazy dog'
occurrences = 0
i = 0
while i < len(string):
    if string[i] == 'e':
        occurrences += 1
    i += 1
print("The letter 'e' occurs", occurrences, "times")

# ---------- Continuing ---------- #
# You can use a continue statement to skip to the next iteration of a loop:
i = 0
while i < 10:
    i += 1
    if i == 5:
	    continue
    print(i)
print('Finished')

# When the value of i gets to 5 the continue statement is executed, and Python jumps directly back to line 2 and 
# continues. The number 5 does not get printed, but 6 - 10 do. 

# ---------- Breaking ---------- #
# You can use a break statement to break out of a loop entirely:
i = 0
while i < 10:
    i += 1
    if i == 5:
	    break
    print(i)
print('Finished')
# When the value of i gets to 5 the break statement is executed, and Python jumps directly to line 7. 
# The number 5 does not get printed, and nor do 6 - 10.

# ---------- Keep a Program Running ---------- #
# When you run the program below is stops after it gets and prints a name. 
# To run it again you have to click 'Run' again: 
name = input('What is your name? ')
print('Hello', name)

# It can be convenient to have the program keep running - getting it to start again automatically 
# after it does its thing. You can get it to do this by adding a while loop, with a condition that 
# always evaluates to true:
while True:
    name = input('What is your name? ')
    print('Hello', name)

# Now the program will keep running, until you click 'Stop'.
# If you want to get a bit fancier, you could get your program to stop when the user enters a certain value, 
# such as 'x'. Remember to let the user know that they can do this:
while True:
    name = input('What is your name? (Enter x to stop) ')
    if name == 'x':
        break
    print('Hello', name)

    
# ---------- Lists ---------- #
# ---------- List Literals ---------- #
# You can specify a list using a list literal, which is a sequence of expressions, each of which 
# refers to an object, separated by commas, and surrounded by square brackets. For example:
# [2, 4, 6, 8]
# ['cat', 'mouse', 'cat', 'mouse']
# [1, 3.14, 'a', True]
# [] (the empty list)

# Note that the same object can be included more than once in a list.

# ---------- Getting the Length ---------- #
# We can use Python's len() function to find the number of items in a list:
print(len([1, 2, 3])) # 3 items
print(len(['12', '45'])) # 2 items
print(len([1, 3.14, 'hello', True])) # 4 items
print(len([])) # 0 items

# ---------- Accessing Items ---------- #
# Each item in a list has a unique index, starting from 0. So, the first item has index 0, the 
# second item has index 1, and so on.
# You can refer to the items in a list by using the indexing operator []:
x = ['a', 'b', 'c', 'd', 'e']
print(x[-1])
print(x[-2])

# Indexes call also be negative. The last item has index -1, the second last item has index -2, 
# and so on.
x = ['a', 'b', 'c', 'd', 'e']
print(x[-1])
print(x[-2])

# You can also use the indexing operator to get a slice of a list. The syntax for slicing is list[begin:end], 
# where begin is the start index and end is the end index. The end index is non-inclusive.
x = ['a', 'b', 'c', 'd', 'e']
print(x[0:3]) # Prints items from index 0 to less than 3

# Notice that x[0:3] returns items with index 0 to 2, rather than 0 to 3 as you might expect - 
# this can be very confusing!

# You can also use negative indices when slicing:
x = ['a', 'b', 'c', 'd', 'e']
print(x[1:-1])

# If you don't specify a start index then it is assumed to be zero. If you don't specify an end index then it 
# is assumed to be the length of the list (an invalid index, but as it is excluded - this is fine 
# and is the way to include the last element of the list). If you don't specify either then the 
# whole list is returned.
x = ['a', 'b', 'c', 'd', 'e']
print(x[:3])
print(x[1:])
print(x[:])

# Python allows you to add a third parameter to the slice to control the step. This parameter 
# allows you to easily extract every nth element from the list. The syntax for slicing with a 
# step is list[begin:end:step], where step is an integer.
x = ['a', 'b', 'c', 'd', 'e']
print(x[::2]) # Every second element
print(x[::3]) # Every third element
print(x[::-1]) # Every element in reverse
print(x[::-2]) # Every second element in reverse

# ---------- Checking for an Item ---------- #
# You can check whether a list contains a certain value by using the in keyword:
x = ['a', 'b', 'c', 'd', 'e']
x[0] = 'z'
print(x)

# ---------- Adding Items ---------- #
# You can add an item to the end of a list by using the append() method:
x = ['a', 'b', 'c', 'd', 'e']
x.append('f')
print(x)

# You can insert an item at a specified index by using the insert() method:
x = ['a', 'b', 'c', 'd', 'e']
x.insert(2, 'x')
print(x)

# You can extend a list with the items from another list by using the extend() method:
x = ['a', 'b', 'c', 'd', 'e']
y = ['x', 'y', 'z']
x.extend(y)
print(x)

# You can join two lists by using the + operator:
x = ['a', 'b', 'c', 'd', 'e']
y = ['f', 'g', 'h']
print(x + y)

# ---------- Removing Items ---------- #
# You can remove an item by index by using the pop() method, if pop() isn't given an index 
# then the last index will be removed, the removed element will be returned:
x = ['a', 'b', 'c', 'd', 'e']
print(x.pop(2))
print(x)
print(x.pop())
print(x)

# You can remove any item by its index with the del keyword:
x = ['a', 'b', 'c', 'd', 'e']
del x[1]
print(x)

# You can remove the first item with a given value by using the remove() method:
x = ['a', 'b', 'c', 'd', 'e', 'c']
x.remove('c')
print(x)

# You can remove all items from a list by using the clear() method:
x = ['a', 'b', 'c', 'd', 'e']
x.clear()
print(x)

# ---------- Other Methods ---------- #
# You can use the count() method to find the number of times a specified value appears in a list:
x = [1, 3, 7, 8, 7, 5, 4, 6, 8, 5]
print(x.count(7))

# You can use the index() method to find the index of the first occurrence of a value. If the value 
# is not found then Python raises an error.
x = [1, 3, 7, 8, 7, 5, 4, 6, 8, 5]
print(x.index(7))

# ---------- Other Functions ---------- #
# sum() computes the sum of a list:
print(sum([1, 3, 7, 8, 7, 5, 4, 6, 8, 5]))

# all() returns True if all items evaluate to True using the bool() function.
print(all([True, True, True]))
print(all(['a', 'a', 'a']))
print(all(['', 'a', 'b']))

# ---------- Basic Sorting ---------- #
# You can sort the elements of a list by using the sort() method, which orders the items by 
# comparing their values using the < operator.
x = [1, 5, 4, 2, 3]
x.sort()
print(x)

x = ['c', 'a', 'e', 'b', 'd']
x.sort()
print(x)

x = [1, 5, 4, 2, 3]
x.sort(reverse=True)
print(x)

# ---------- Sorting with a Function ---------- #
# Suppose you have a list of words and you want to sort them by length. If you use the sort() 
# method then you will get the wrong result - it will sort them alphabetically.

# What you need to do is sort using a function that returns, for each item in the list, a value 
# that you would like to sort the item by. In this case we want to sort by length, so we can use 
# the len() function.
x = ['dog', 'chicken', 'mouse', 'horse', 'goat', 'donkey']
x.sort(key=len)
print(x)

# ---------- For Loops ---------- #
# It is very common to loop through the items in a list one by one. You could access each element using its index - 
# and use a while statement to go through the whole list:
vowels = ['a', 'e', 'i', 'o', 'u']
i = 0
while i < len(vowels):
    print(vowels[i])
    i += 1

# But it is better to use a for loop, which is custom-made for this kind of thing:
vowels = ['a', 'e', 'i', 'o', 'u']
for v in vowels:
    print(v)

# ---------- Break and Continue ---------- #
# break and continue can also be used inside for loops.
vowels = ['a', 'e', 'i', 'o', 'u']

print('Everything before o:')
for v in vowels:
    if v == 'o':
        break
    print(v)

print('Everything except o:')
for v in vowels:
    if v == 'o':
        continue
    print(v)

# ---------- Enumerating ---------- #
# Sometimes when we loop through a list we need to use the index of an item as well as its value. 
# We can do this by using the enumerate() function.
vowels = ['a', 'e', 'i', 'o', 'u']
for i, v in enumerate(vowels):
	print('The vowel at index', i, 'is', v)

# ---------- Lists of Lists ---------- #
# The items in a list can be of any type. In particular, they can be lists. So it's possible to create lists of lists. 
# They behave just like any other list.
numbers = [[1,2,3],[3,4,5],[6,7,8]]
print(len(numbers))
print(numbers[0])

numbers.reverse()
print(numbers)

# Notice that numbers has length 3 because it contains just 3 items (each of which also happens 
# to be a list of items). Notice that numbers[0] is the first of the three items, which happens 
# to be a list. Notice that the reverse() method reverses the order of the 3 items, but doesn't 
# do anything to the items themselves.

# Since numbers[0] is a list, we can do all of the usual lists things with it:
numbers = [[1,2,3],[3,4,5],[5,6,7]]
print(len(numbers[0]))
print(numbers[0][0])
numbers[0].reverse()
print(numbers[0])

# When we have a list of lists we might end up using nested for loops. Suppose that we want to add up all of the numbers that 
# appear in numbers. We can do this as follows:
numbers = [[1,2,3],[3,4,5],[5,6,7]]
total = 0
for i in numbers:
    for j in i:
        total += j
print(total)
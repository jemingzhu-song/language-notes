# ---------- Unnordered and Unique ---------- #
# The items in a set are unordered, which means that they have no index. If you try to refer to an item in a set 
# by using square brackets notation you will get an error:
x = {'cat', 'mouse', 'dog'}
# print(x[0]) # Error

# Because they are not ordered you can't be sure what order Python will list them in 
# (try running the following snippet multiple times):
vowels = {'a', 'e', 'i', 'o', 'u'}
print(vowels)

# The items are also unique, which means that the same object cannot be included more than once in the set. 
# If you try to include the same object more than once Python will ignore all but the first:
x = {'cat', 'mouse', 'dog', 'cat', 'cat'}
print(x)

# ---------- Counting Items ---------- #
# You can use Python's len() function to get the number of items in a set:
print(len({'a', 'e', 'i', 'o', 'u'}))
print(len({}))

# ---------- Checking for an Item ---------- #
# You can use the "in" keyword word to check whether an item is in a set:
names = {'John', 'Bob', 'Alice'}
print('John' in names)
print('Eve' in names)

# ---------- Adding Items ---------- #
# You can add a single item to a set by using the set's add() method:
vowels = set()
vowels.add('a')
vowels.add('e')
vowels.add('e') # No error, just not added
print(vowels)

# ---------- Removing Items ---------- #
# You can remove items from a set using the set's remove() or discard() methods. If the item is 
# not in the set then using remove() will cause an error, but using discard() will not:
vowels = {'a', 'e', 'i', 'o', 'u'}
vowels.remove('a')
print(vowels)
vowels.discard('f') # No error
print(vowels)
# vowels.remove('f') # Error

# You can remove all items from a set by using the set's clear() method:
vowels = {'a', 'e', 'i', 'o', 'u'}
vowels.clear()
print(vowels)

# ---------- Union & Intersection of Two Sets ---------- #
# The union of two sets is the set of items that belong to either or both sets:
# You can get the union of two sets using either the | operator or the union() method:
evens = {2, 4, 6, 8}
primes = {2, 3, 5, 7}
print(evens | primes)
print(evens.union(primes))
print(primes.union(evens))

evens = {2, 4, 6, 8}
primes = {2, 3, 5, 7}
print(evens & primes)
print(evens.intersection(primes))
print(primes.intersection(evens))

evens = {2, 4, 6, 8}
primes = {2, 3, 5, 7}
# Everything in "Evens" that is NOT in "primes"
print(evens - primes)
print(evens.difference(primes))
# Everything in "Primes" that is NOT in "Evens"
print(primes - evens)
print(primes.difference(evens))
# ---------- Dictionaries ---------- #
# A dictionary is an unordered collection of key-value pairs. e.g. {'name': 'John', 'age': 54}. 
# It represents a mapping from a set of keys to a set of values.

# ---------- Dictionary Literals ---------- #
# Dictionary literals are presented in curly braces like set literals, with key-value pairs 
# separated by commas, and each key and value separated with a colon.
scores = {
	'Alice': 0,
	'Bob': 1,
	'Eve': 2,
	'Mallory': 3,
}
print(scores)

# A key and a value can be any object. Keys do not all have to be the same type, and neither do 
# values; however it is good programming practice to keep the types consistent.
dictionary = {
    1: 'one',
    'two': 2, # Mixing key types is not good practice as it can lead to confusion
    3: 3
}
print(dictionary)

# ---------- Uniqueness of Keys ---------- #
# In a dictionary, values can be duplicated, but keys must be unique. If multiple items with the 
# same key are given, then only the latest value is stored.
scores = {
    'Alice': 1,
    'Bob': 1
}
print(scores)

scores = {
    'Alice': 0,
    'Alice': 1
}
print(scores)


# ---------- Indexing ---------- #
# Items can be retrieved from the dictionary using the indexing operator. Note that indices of a 
# dictionary are key values, which are not necessarily integers.
scores = {
	'Alice': 0,
	'Bob': 1,
	'Eve': 2,
	'Mallory': 3,
}
print(scores['Alice'])

# ---------- Updating ---------- #
# Updating an item in a dictionary is the same as updating an item in a list.
scores = {
	'Alice': 0,
	'Bob': 1,
	'Eve': 2,
	'Mallory': 3,
}
scores['Bob'] = 900
scores['Alice'] += 1
print(scores)

# ---------- Deletion ---------- #
# The del keyword works the same on dictionaries as it does on lists. 
scores = {
	'Alice': 0,
	'Bob': 1,
	'Eve': 2,
	'Mallory': 3,
}
del scores['Bob']
print(scores)

# ---------- Iteration ---------- #
# Iterating a dictionary directly yields only the keys. 
scores = {
	'Alice': 0,
	'Bob': 1,
	'Eve': 2,
	'Mallory': 3,
}
for key in scores:
	print(key)

# Fortunately Python dictionaries provide an easy access function, items(), 
# to get the items as well:
scores = {
	'Alice': 0,
	'Bob': 1,
	'Eve': 2,
	'Mallory': 3,
}
for key, value in scores.items():
	print(key, value)

# ---------- Usage ---------- #
# While lists, tuples and sets represent collections of objects, dictionaries represent a relationship between 
# two collections: a set of keys and a set of values. The relationship is a many-one relationship - multiple 
# keys can be related to the same value, but a single key can only be related to at most one value. This is 
# not too much of a restriction - a reasonably simple way to overcome this if there is a need to map a key 
# to multiple values is to use a list (or set) of items as the value in the key-value pairs.

# A situation that commonly arises, particularly when naively programming with data, is an abundance of lists 
# that all need to align on their indices: for example, the third item in list x corresponds to the third item in 
# list y. If you find yourself in this situation, then you should be working with dictionaries. Dictionaries are 
# a robust and safe way of managing relationships between data items.

# It may appear that lists can be viewed as dictionaries where the list indices are the keys, however there 
# are some notable differences - particularly after items have been removed. In the case of lists, the 
# indices of the items appearing after a removed item will all be changed, whereas for a dictionary the 
# keys are not affected when an item is removed. Each effect has its benefits: from a list perspective, 
# the "next available key" is easy to find, resulting in minimal overhead for adding new items; whereas 
# from a dictionary point of view there is stability between the item and the index it is assigned, as 
# well as a (partial) record of the deletions that have occurred.
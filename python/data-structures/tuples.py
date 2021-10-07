# ---------- Tuples ---------- #
# A tuple is a list that is immutable, which means that it cannot be modified.

# ---------- Tuple Literals ---------- #
# Tuple literals are like list literals, except you use round brackets rather than square brackets:
# • (2, 4, 6, 8)
# • ('cat', 'mouse', dog')
# • (1, 3.14, 'a', True)
# • () (the empty tuple)

# ---------- Immutability ---------- #
# You can mostly work with tuples just like you work with lists:
# Use len() to find the number of items
x = ('a', 'b', 'c', 'd', 'e')
y = (1, 1, 2, 3)
print(len(x))
print(len(y))

# Use "in" to check for an item and count to count the number of occurrences of an item
y = (1, 1, 2, 3, 5, 8)
print(4 in y)
print(y.count(1))

# Join two tuples with +
x = (1, 2, 3)
y = (4, 5, 6)
z = x + y # Note this will give a tuple
print(z) 

# Use for to loop through the items
# Use sum, all, and any to combine items of the appropriate type.
y = (1, 1, 2, 3)
z = (True, False, True)
print(sum(y))
print(all(z))
print(any(z))

# But because tuples are immutable there are various things that you CANNNOT do:
# Change the elements of the tuple:
x = (0, 2, 3)
x[0] = 1

# Add items to the tuple:
x = (1, 2, 3)
x.append(4)

# Remove elements from the tuple:
x = (1, 2, 3)
x.remove(2)

# Sort the tuple:
x = (1, 3, 2)
x.sort()

# ---------- Usage ---------- #
# Tuples can be viewed as multi-dimensional literals, for example a two-dimensional point (1,3), a name-surname 
# pairing: ('John', 'Smith'), or a day-month-year triple representing a date (26,1,2020). The immutability of tuples 
# binds the individual components tightly together - it is not possible for a program to alter one component 
# separately from the others and the order of the elements is important: ('John', 'Smith') and ('Smith', 'John') 
# are fundamentally different objects. So it is more sensible to view a tuple as a single, complex, object, rather 
# than as a collection of smaller objects. This makes tuples ideal for representing data where there is a strong 
# connection between the components and where it should be difficult for a programmer to alter one aspect 
# independently of the others.

# While a list can almost always be used where a tuple can be, by using tuples in the appropriate setting, 
# you are signalling to anyone reviewing your code that the guarantee of immutability of the object 
# is important.
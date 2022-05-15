from sqlalchemy import desc


def binarySearch(nums, low, high, target):
    # Base Case
    if low <= high:
        # Calculate middle index
        mid = int((low + high)/2)

        if target == nums[mid]:
            return mid
        elif target < nums[mid]:
            return binarySearch(nums, low, mid - 1, target)
        else: # target > nums[mid]:
            return binarySearch(nums, mid + 1, high, target)
    else:
        return -1

nums = [-5, -2, 1, 6, 9, 14, 20]
print(binarySearch(nums, 0, len(nums)-1, 5)) # Return -1
print(binarySearch(nums, 0, len(nums)-1, 6)) # Return 3

l = [1,2,3,4,5,6]
# Append a number
l.append(7)
print(l) # l = [1,2,3,4,5,6,7]
# Pop
l.pop() 
print(l) # l = [1,2,3,4,5,6]
l.pop(2)
print(l) # l = [1,2,4,5,6]
l.remove(1)
print(l) # l = [2,4,5,6]
# Index
print(l.index(5)) # l.index(5) = 2
# Insert
l.insert(4, 9) 
print(l) # l = [2,4,5,6,9]
l.insert(2, 333)
print(l) # l = [2,4,333,5,6,9]

dict = {'A': 1, 'B': 2, 'C': 3}

print(dict.keys()) # ['A', 'B', 'C']
print(dict.values()) # [1, 2, 3]
print(dict.items()) # [('A', 1), ('B', 2), ('C', 3)]
print(dict.get('B')) # 2

# Sort dictionary by values
sortedValues = sorted(dict, key=lambda x: dict[x], reverse=True)
print(sortedValues) # ['C', 'B', 'A']

votes = {'A': 1, 'B': 9, 'F': 2, 'D': 4, 'E': 5, 'C': 2}
# Sort votes by most votes to least votes. If votes are equal, sort them alphabetically
sortedCount = sorted(votes, key=lambda vote: votes[vote], reverse=True)
print(sortedCount) # [B, E, D, F, C, A]

unordered = {'G': 1, 'A': 5, 'Z': 2, 'C': 9, 'B': 2}
# Sort votes alphabetically first
ordered = sorted(unordered.keys())
print(ordered) # [A, B, C, G, Z]
# Sort votes descending order
descending = sorted(ordered, key=lambda vote: unordered[vote], reverse=True)
print(descending) # 
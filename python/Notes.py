# List Slicing
numbers = [1,2,3,4,5,6,7]
numbers[start:stop]  # Items begin at "start" through to "stop-1" 
numbers[start:]      # items start through the rest of the array
numbers[:stop]       # items from the beginning through stop-1
numbers[:]           # a copy of the whole array
numbers[start:stop:step] # start through not past stop, by step

# Main Function
if __name__ == "__main__":
    pass

# Modifying Objects
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def myfunc(self):
        print("Hello my name is " + self.name)
p1 = Person("John", 36)
p1.myfunc()

# ---------- Modifying Object Properties ---------- #
# You can modify properties on objects like this:
# Set the age of p1 to 40:
p1.age = 40

# ---------- Delete Object Properties ---------- #
# You can delete properties on objects by using the del keyword:
# Delete the age property from the p1 object:
del p1.age

# ---------- Delete Objects ---------- #
# You can delete objects by using the del keyword:
# Delete the p1 object:
del p1

# Linked List
class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

    # Print the list
    def printList(self):
        listValues = []
        curr = self
        while curr != None:
            listValues.append(curr.val)
            curr = curr.next
        return listValues
            

    # Insert into list (at end)
    def insert(self, val):
        if self.val == None:
            self = Node(val)
        else:
            # Go to end of the list
            curr = self
            while curr.next != None:
                curr = curr.next
            curr.next = Node(val)


# Binary Tree Node
class Node:
    def __init__(self, val):
        self.left = None
        self.right = None
        self.val = val

    # Inserting into Tree
    def insert(self, val):
        if self.val:
            if self.val < val:
                if self.left == None:
                    self.left = Node(val)
                else:
                    self.left.insert(val)
            elif self.val > val:
                if self.right == None:
                    self.right = Node(val)
                else:
                    self.right.insert(val)
        else:
            self.val = val
    
    # Print Tree
    def printTree(self):
        if self.left:
            self.left.PrintTree()
        print(self.val),
        if self.right:
            self.right.PrintTree()
        
root = Node(10)
root.insert(5)
root.insert(7)
root.insert(6)
root.insert(12)
root.insert(15)
root.printTree()
root.insert(15)
root.printTree()


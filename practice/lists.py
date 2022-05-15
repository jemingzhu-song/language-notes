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

    

head = Node(1)
head.insert(2)
head.insert(3)
head.insert(4)
print(head.printList())
        
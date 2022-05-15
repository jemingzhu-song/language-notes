class Node:
    def __init__(self, data):
        self.left = None
        self.right = None
        self.data = data
    
    # Insert into a Tree
    def insert(self, data):
        if self.data != None:
            # Insert into left subtree
            if self.data > data:
                # If left subtree not empty, insert() into self.left
                if self.left != None:
                    self.left.insert(data)
                # If left subtree is empty, insert() here
                else:
                    self.left = Node(data)
            # Insert into right subtree
            elif self.data < data:
                # If right subtree not empty, insert() into self.right
                if self.right != None:
                    self.right.insert(data)
                # If right subtree is empty
                else:
                    self.right = Node(data)
        else:
            self.data = data

    # Print Tree (in order)
    def inOrder(self):
        if self.data != None:
            if self.left != None:
                self.left.inOrder()
            print(self.data)
            if self.right != None:
                self.right.inOrder()

if __name__ == "__main__":
    root = Node(5)
    root.insert(3)
    root.insert(4)
    root.insert(9)
    root.insert(6)
    root.insert(12)
    root.inOrder()

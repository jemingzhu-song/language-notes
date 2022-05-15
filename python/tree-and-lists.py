class ListNode:
    def __init__(self, val):
        self.val = val
        self.next = None

    def printList(self):
        result = []
        curr = self
        while curr != None:
            result.append(curr.val)
            curr = curr.next
        return result
    
head = ListNode(5)

curr = head
for i in range(6):
    curr.next = ListNode(i)
    curr = curr.next

print(head.printList())

class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None
    
    def insert(self, target):
        # Base Case
        if self == None:
            self = TreeNode(target)
        else:
            if target < self.val:
                if self.left == None:
                    self.left = TreeNode(target)
                else:
                    return self.left.insert(target)
            else: # target >= self.val
                if self.right == None:
                    self.right = TreeNode(target)
                else:
                    return self.right.insert(target)
    # Print the tree
    def PrintTree(self):
        if self.left:
            self.left.PrintTree()
        print(self.val),
        if self.right:
            self.right.PrintTree()

    # In-Order Traversal
    # Left -> Root -> Right
    def InorderTraversal(self, root):
        res = []
        if root:
            res = self.InorderTraversal(root.left)
            res.append(root.val)
            res = res + self.InorderTraversal(root.right)
        return res

def inorder(root, result):
    # Base Case
    if root == None:
        return
    
    inorder(root.left, result)
    result.append(root.val)
    inorder(root.right, result)
    return


tree = TreeNode(8)
tree.insert(4)
tree.insert(15)
tree.insert(2)
tree.insert(1)
tree.insert(3)
tree.insert(22)
tree.insert(30)

tree.PrintTree()
print(tree.InorderTraversal(tree))
print(inorder(tree, [])) # [1, 2, 3, 4, 8, 15, 22, 30]
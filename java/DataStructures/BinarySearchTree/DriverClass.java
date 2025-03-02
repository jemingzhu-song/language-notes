package DataStructures.BinarySearchTree;

public class DriverClass {
    public static void main(String [] args) {
        BinarySearchTree tree = new BinarySearchTree();
        BinarySearchTree.TreeNode root = new BinarySearchTree.TreeNode(100);

        // Tree Based off this tree example: https://www.youtube.com/watch?v=DkOswl0k7s4
        tree.insert(root, 100);
        tree.insert(root, 75);
        tree.insert(root, 125);
        tree.insert(root, 65);
        tree.insert(root, 85);
        tree.insert(root, 60);
        tree.insert(root, 70);
        tree.insert(root, 80);
        tree.insert(root, 95);
        tree.insert(root, 115);
        tree.insert(root, 150);
        tree.insert(root, 110);
        tree.insert(root, 120);
        tree.insert(root, 135);
        tree.insert(root, 175);

        tree.levelOrderTraversal(root);

        tree.delete(root, 125);

        // The position of 125 should now be replaced with the min value in the right subtree
        // of where position 125 was, in this case, the min value is 135
//        tree.preOrderTraversal(root);
    }
}

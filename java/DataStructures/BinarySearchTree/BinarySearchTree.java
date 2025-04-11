package DataStructures.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.geeksforgeeks.org/introduction-to-binary-tree/
 */

public class BinarySearchTree {
    // Tree Node
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Insertion into Binary Tree
    public TreeNode insert(TreeNode root, int value) {
        if (root == null) return new TreeNode(value);

        if (value < root.value) { // insert left
            root.left = insert(root.left, value);
        } else if (value > root.value) { // insert right
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Deletion from Binary Search Tree
    public TreeNode delete(TreeNode root, int value) {
        if (root == null) return null;

        if (value < root.value) { // value to delete in left
            root.left = delete(root.left, value);
        } else if (value > root.value) { // value to delete in right
            root.right = delete(root.right, value);
        } else { // root.value == value
            // Case 1 - No Children (Leaf Node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2 - One Child
            if (root.left == null || root.right == null) {
                if (root.left != null) {
                    return root.left;
                }
                if (root.right != null) {
                    return root.right;
                }
            }

            // Case 3 - Both Children
            // Find the smallest value in the right subtree, and assign it in place of the
            // current TreeNode that is to be deleted
            TreeNode curr = root.right;
            while (curr.left != null) {
                curr = curr.left;
            }
            // curr is now at the smallest value
            root.value = curr.value;
            // Now delete the smallest value in the right subtree (which is curr.value)
            root.right = delete(root.right, root.value);
        }
        return root;
    }

    // ========== Depth First Search/Traversal ==========
    // In Order
    public void inOrderTraversal(TreeNode node) {
        // If this was a search, then the base case would be if (node.value == value)
        if (node == null) return;

        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);
    }

    // Pre Order
    public void preOrderTraversal(TreeNode node) {
        if (node == null) return;

        System.out.println(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // Post Order
    public void postOrderTraversal(TreeNode node) {
        if (node == null) return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value);
    }

    // ========== Breadth First Search/Traversal ==========
    // a.k.a. Level Order Traversal
    public void levelOrderTraversal(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();

        // Enqueue the root
        queue.add(root);
        int currentLevel = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode curr = queue.poll();
                System.out.println(curr.value);

                // Enqueue left child
                if (curr.left != null) queue.add(curr.left);

                // Enqueue right child
                if (curr.right != null) queue.add(curr.right);
            }
        }
    }

    // ========== Find Height of Tree ==========
}

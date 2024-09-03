public class BinaryTreeTraversal {

    // Node class representing a node in the binary tree
    public static class Node {
        int value;    // Value stored in the node
        Node left;    // Reference to the left child node
        Node right;   // Reference to the right child node

        // Constructor to initialize a node with a value
        public Node(int value) {
            this.value = value;
            this.left = null;   // Initially, the left child is null
            this.right = null;  // Initially, the right child is null
        }
    }

    // Method for inorder traversal (left-root-right)
    public void inorderTraversal(Node root) {
        // Base case: if the current node is null, return
        if (root == null) {
            return;
        }

        // Recursively traverse the left subtree
        inorderTraversal(root.left);
        // Visit the root node (current node)
        System.out.print(root.value + " ");
        // Recursively traverse the right subtree
        inorderTraversal(root.right);
    }

    // Method for postorder traversal (left-right-root)
    public void postorderTraversal(Node root) {
        // Base case: if the current node is null, return
        if (root == null) {
            return;
        }

        // Recursively traverse the left subtree
        postorderTraversal(root.left);
        // Recursively traverse the right subtree
        postorderTraversal(root.right);
        // Visit the root node (current node)
        System.out.print(root.value + " ");
    }

    // Method for preorder traversal (root-left-right)
    public void preorderTraversal(Node root) {
        // Base case: if the current node is null, return
        if (root == null) {
            return;
        }

        // Visit the root node (current node) first
        System.out.print(root.value + " ");
        // Recursively traverse the left subtree
        preorderTraversal(root.left);
        // Recursively traverse the right subtree
        preorderTraversal(root.right);
    }

    // Main method to test the traversal methods
    public static void main(String[] args) {
        BinaryTreeTraversal traversal = new BinaryTreeTraversal();

        // Creating a binary tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        Node root = new Node(1);            // Root node with value 1
        root.left = new Node(2);            // Left child of root with value 2
        root.right = new Node(3);           // Right child of root with value 3
        root.left.left = new Node(4);       // Left child of node 2 with value 4
        root.left.right = new Node(5);      // Right child of node 2 with value 5

        // Performing inorder traversal
        System.out.println("Inorder Traversal:");
        traversal.inorderTraversal(root); // Expected Output: 4 2 5 1 3

        // Performing postorder traversal
        System.out.println("\nPostorder Traversal:");
        traversal.postorderTraversal(root); // Expected Output: 4 5 2 3 1

        // Performing preorder traversal
        System.out.println("\nPreorder Traversal:");
        traversal.preorderTraversal(root); // Expected Output: 1 2 4 5 3
    }
}

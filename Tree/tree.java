package Tree;
import java.util.*;

// implementing a tree
public class tree {
    Node root;
    // Node class
    static class Node {

        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }

    }
    // constructor
    public tree() {
        root = null;
    }

    // Method to insert a new node with a given key
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive function to insert a new key in the tree
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // Otherwise, recur down the tree
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        // return the (unchanged) node pointer
        return root;
    }


    // method to find the largest element recursively
    static int findLargestElement(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int res = root.key;
        int lres = findLargestElement(root.left);
        int rres = findLargestElement(root.right);
        if (lres > res) {
            res = lres;
        }
        if (rres > res) {
            res = rres;
        }
        return res;
    }
    // method to find the largest element iteratively
    static int findLargestElementIteratively(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int res = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            Node temp = q.poll();
            res = Math.max(res, temp.key);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return res;
    }

    // toString method using postorder traversal
    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key + " ");

    }
    // toString method using preorder traversal
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }
    // toString method using inorder traversal
    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    // main method
    public static void main(String[] args) {
        // Creating a tree
        tree tree = new tree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        Node root = tree.root;


        System.out.println("Tree created");
        System.out.println("Root: "+root.key);
        System.out.println("Root left: "+root.left.key);
        System.out.println("Root right: "+root.right.key);
        System.out.println("Root left left: "+root.left.left.key);
        System.out.println("Root left right: "+root.left.right.key);
        System.out.println("Root right left: "+root.right.left.key);
        System.out.println("Root right right: "+root.right.right.key);


        // Finding largest element in the tree
        System.out.println("Largest element in the tree: "+findLargestElement(root));

        // Finding largest element in the tree iteratively
        System.out.println("Largest element in the tree iteratively: "+findLargestElementIteratively(root));

        // Printing the tree using postorder traversal
        System.out.println("Printing the tree using postorder traversal: " );
        postorder(root);

        // Printing the tree using preorder traversal
        System.out.println("\nPrinting the tree using preorder traversal: " );
        preorder(root);

        // Printing the tree using inorder traversal
        System.out.println("\nPrinting the tree using inorder traversal: " );
        inorder(root);

    }
}

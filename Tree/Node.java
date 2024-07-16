package Tree;

class Node {
    int key;
    Node left, right;
    public Node(int k){
        key = k;
        left = right = null;
    }
}
class BinaryTree{
    Node root;

    BinaryTree(int key){
        root = new Node(key);
    }
    BinaryTree(){
        root = null;
    }
    public static void main(String []args){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);

        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        System.out.print(tree.root.key + " " + tree.root.left.key + " " + tree.root.right.key + " " + tree.root.left.left.key);
    }
}

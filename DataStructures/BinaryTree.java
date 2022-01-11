package java_progs.DataStructures;

class Node {
    public int data;
    public Node left, right;

    Node(int ele) {
        this.data = ele;
        left = right = null;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }
}

class Tree {
    public Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void Inorder(Node root) {
        if (root != null) {
            System.out.println(root.getData());
            Inorder(root.getLeft());
            Inorder(root.getRight());
        }
    }
}

public class BinaryTree {

    public static void main(String[] args) throws Exception {
        Node root = new Node(10);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Tree tree = new Tree(root);
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        tree.Inorder(root);
    }
}

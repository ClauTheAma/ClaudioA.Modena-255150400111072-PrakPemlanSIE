import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    public void add(String data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        root.add(data);
    }

    public void preTraverse(Node node) {
        if (node == null) {
            return;
        }
        System.out.printf("[%s]", node.data);
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(Node node) {
        if (node == null) {
            return;
        }
        inTraverse(node.left);
        System.out.printf("[%s]", node.data);
        inTraverse(node.right);
    }

    public void postTraverse(Node node) {
        if (node == null) {
            return;
        }
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%s]", node.data);
    }

    public int countNodes(Node node) {
    if (node == null) {
        return 0;
    }
    return 1 + countNodes(node.left) + countNodes(node.right);
}

    public int countLeaves(Node node) {
    if (node == null) {
        return 0;
    }
    if (node.left == null && node.right == null) {
        return 1;
    }
    return countLeaves(node.left) + countLeaves(node.right);
}

        public int height(Node node) {
        if (node == null) {
            return 0;
        }
        int tinggiKiri  = height(node.left);
        int tinggiKanan = height(node.right);
        
        if (tinggiKiri > tinggiKanan) {
            return 1 + tinggiKiri;
        } else {
            return 1 + tinggiKanan;
        }
    }

    public void levelTraverse(Node node) {
    if (node == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(node);          // enqueue root

    while (!queue.isEmpty()) {
        Node current = queue.poll();              // dequeue
        System.out.printf("[%s]", current.data); // cetak node

        if (current.left != null) {
            queue.add(current.left);              // enqueue kiri
        }
        if (current.right != null) {
            queue.add(current.right);             // enqueue kanan
        }
    }
}

    public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

        for (int i = 0; i < 10; i++) {
            int nilai = (int) (Math.random() * 100);
            String nilaiString = String.valueOf(nilai); // konversi int ke String
            System.out.printf("Nilai %s dimasukkan.\n", nilaiString);
            tree.add(nilaiString);
        }

    System.out.println();

    // Pre-order traversal (Root -> Left -> Right)
    System.out.print("Pre-order  : ");
    tree.preTraverse(tree.root);
    System.out.println();

    // In-order traversal (Left -> Root -> Right)
    System.out.print("In-order   : ");
    tree.inTraverse(tree.root);
    System.out.println();

    // Post-order traversal (Left -> Right -> Root)
    System.out.print("Post-order : ");
    tree.postTraverse(tree.root);
    System.out.println();

    System.out.print("Level-order: ");
    tree.levelTraverse(tree.root);
    System.out.println();

    System.out.println();
    System.out.printf("Jumlah node: %d\n", tree.countNodes(tree.root));
    System.out.printf("Jumlah daun : %d\n", tree.countLeaves(tree.root));
    System.out.printf("Ketinggian pohon : %d\n", tree.height(tree.root));
}
}
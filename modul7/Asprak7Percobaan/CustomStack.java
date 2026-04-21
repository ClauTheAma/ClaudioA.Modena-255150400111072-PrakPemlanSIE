
public class CustomStack {

    Node top;
    int size = 0;

    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty.");
        }
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty.");
        }
        return top.data;
    }

    public void insertFromBottom(int value, int posFromBottom) {
        CustomStack tempStack = new CustomStack();

        int moveCount = size - posFromBottom;

        for (int i = 0; i < moveCount; i++) {
            tempStack.push(this.pop());
        }

        this.push(value);

        while (!tempStack.isEmpty()) {
            this.push(tempStack.pop());
        }
    }

        public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print("[" + current.data + "]");
            if (current.next != null) System.out.print("");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        CustomStack custom = new CustomStack();
        custom.push(1);
        custom.push(2);
        custom.push(3);
        custom.push(4);

        System.out.println(" Stack Awal ");
        custom.printStack();

        custom.insertFromBottom(5, 1);


        System.out.print("\nCustom Stack: ");
        while (!custom.isEmpty()) {
            System.out.print(custom.pop() + " ");
        }
        System.out.println();
    }
}

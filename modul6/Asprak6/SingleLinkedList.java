

public class SingleLinkedList {

    Node head, tail;
    int size = 0;

    void init() {
        head = null;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
    }

    Node MencariNode(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    Node MencariPosisiNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    void MenghapusNode(int index) {
        if(index < 0 || index >= size) {
            return;
        }
        if(index == 0) {
            head = head.next;
        if(size == 1){
            tail = null;
        }
    } else {
        Node prev = MencariPosisiNode(index - 1);
        prev.next = prev.next.next;
        if (index == size - 1) {
            tail = prev;
        }
    }
    size--;
}

        void MenghapusData(Object data) {
        if(isEmpty()) {
            return;
        }
        if(head.data.equals(data)) {
            head = head.next;
        if(size == 1){
            tail = null;
        }
        size--;
    } 
        Node current = head;
        while (current.next != null) {
            if(current.next.data.equals(data)) {
                current.next = current.next.next;
                if(current.next == null) {
                    tail = current;
                }
                size--;
                return;
            }
            current = current.next;
        } 
        
    }

    void MenambahNode(int index, Node data) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node prev = MencariPosisiNode(index - 1);
            data.next = prev.next;
            prev.next = data;
            size++;
        }
    }

    void MenambahSetelah(Object targetData, Node data) {
        Node targetNode = MencariNode(targetData);
        if(targetNode != null) {
            data.next = targetNode.next;
            targetNode.next = data;
            if(targetNode == tail) {
                tail = data;
            }
            size++;
        }
    }

    void MenambahSebelum(Object targetData, Node data) {
        if(head == null) {
            return;
        }
        if(head.data.equals(targetData)) {
            addFirst(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            if(current.next.data.equals(targetData)) {
                data.next = current.next;
                current.next = data;
                size++;
                return;
            }
            current = current.next;
        }
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        System.out.println("Head: " + list.head);
        System.out.println("Tail: " + list.tail);

        list.addFirst(new Node("A"));
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data);

        list.addFirst(new Node("B"));
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data);

        list.addLast(new Node("C"));
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data);

        list.MencariNode("A");
        System.out.println("Node A: " + list.MencariNode("A").data);

        list.MencariPosisiNode(1);
        System.out.println("Node at position 1: " + list.MencariPosisiNode(1).data);

        list.MenambahNode(3, new Node("D"));
        list.print();

        list.MenambahSetelah("D", new Node("F"));
        list.print();

        list.MenambahSebelum("F", new Node("E"));
        list.print();

        list.MenghapusNode(1);
        list.print();

        list.MenghapusData("D");
        list.print();

    }
}
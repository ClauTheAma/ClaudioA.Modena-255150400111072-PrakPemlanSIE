
public class DoubleLinkedList {

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
            head.prev = data;
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
            data.prev = tail;
            tail = data;
        }
        size++;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void ReversePrint() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    Node Cari(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    Node CariIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    Node DeleteIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        size--;
        return current;
    }

    Node DeleteNilai(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void TambahIndex(int index, Node data) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        } else if (index == size) {
            addLast(data);
            return;
        }
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            data.prev = current.prev;
            data.next = current;
            current.prev.next = data;
            current.prev = data;
            size++;
        }

        void TambahNilaiSetelah(Object key, Node data) {
            Node current = head;
            while (current != null) {
                if (current.data.equals(key)) {
                    data.prev = current;
                    data.next = current.next;
                    if (current.next != null) {
                        current.next.prev = data;
                    } else {
                        tail = data;
                    }
                    current.next = data;
                    size++;
                    return;
                }
                current = current.next;
            }
        }

        void TambahNilaiSebelum(Object key, Node data) {
            Node current = head;
            while (current != null) {
                if (current.data.equals(key)) {
                    data.next = current;
                    data.prev = current.prev;
                    if (current.prev != null) {
                        current.prev.next = data;
                    } else {
                        head = data;
                    }
                    current.prev = data;
                    size++;
                    return;
                }
                current = current.next;
            }
        }

        public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");

        System.out.println("Head: " + list.head);
        System.out.println("Tail: " + list.tail);

        list.addLast(nodeA);
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data);

        list.addLast(nodeB);
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data);

        list.addLast(nodeC);
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data);

        System.out.println("Next of B: " + nodeB.next.data); 
        System.out.println("Prev of B: " + nodeB.prev.data);

        System.out.println("Reverse Print: ");
        list.ReversePrint();

        System.out.println("Mencari");
        Node cariNode = list.Cari("B");
        if (cariNode != null) {
            System.out.println("Node ditemukan: " + cariNode.data);
        } else {
            System.out.println("Node tidak ditemukan");

        }

        System.out.println("Mencari Index");
        Node indexNode = list.CariIndex(1);
        if (indexNode != null) {
            System.out.println("Index ditemukan: " + indexNode.data);
        } else {
            System.out.println("Index tidak ditemukan");
        }

        System.out.println("Delete Index");
        Node deletedNode = list.DeleteIndex(1);
        if (deletedNode != null) {
            System.out.println("Node yang dihapus: " + deletedNode.data);
        } else {
            System.out.println("Index tidak ditemukan");
        }

        System.out.println("Delete Nilai");
        Node deletedNilaiNode = list.DeleteNilai("C");
        if (deletedNilaiNode != null) {
            System.out.println("Node yang dihapus: " + deletedNilaiNode.data);
        } else {
            System.out.println("Nilai tidak ditemukan");
        }

        System.out.println("Tambah Index");
        Node nodeD = new Node("D");
        list.TambahIndex(1, nodeD);
        list.print();

        System.out.println("Tambah Nilai Setelah");
        Node nodeE = new Node("E");
        list.TambahNilaiSetelah("B", nodeE);
        list.print();

        System.out.println("Tambah Nilai Sebelum");
        Node nodeF = new Node("F");
        list.TambahNilaiSebelum("C", nodeF);
        list.print();

    }
}
package les_listes_simples;

public class LinkedList {
    private Node first;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (first == null) {
            first = node;
        } else {
            Node n = first;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public  void show() {
        Node node = first;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
        //System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = first;
        first = node;
    }

   /* public void insertFirstElement(Object o) throws IllegalArgumentException {
        if (o == null) {
            throw new IllegalArgumentException("Impossible");
        } else {
            if (isEmpty()) {
                first = new Node(o, null);
            } else {
                first = new Node(0, first);
            }
            return;
        }
    }*/

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = first;
            for( int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
}



public class MySingleLinkedList<T> {

    public class Node<T> {
        T data; //데이터
        Node<T> next = null; //포인터

        public Node(T data) {
            this.data = data;
        }
    }

    public Node<T> head = null;

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);

            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public static void main(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList<Integer>();
        mySingleLinkedList.addNode(1);
        mySingleLinkedList.addNode(3);
        mySingleLinkedList.addNode(2);
        mySingleLinkedList.addNode(4);
        mySingleLinkedList.addNode(5);

        mySingleLinkedList.addNodeInside(999, 3);
        mySingleLinkedList.addNodeInside(77,5);
        mySingleLinkedList.addNodeInside(8,100);

        mySingleLinkedList.printAll();
    }

}

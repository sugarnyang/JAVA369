public class MySingleLinkedList<T> {

    public class Node<T> {
        T data; //데이터
        Node<T> next = null; //포인터

        public Node(T data) {
            this.data = data;
        }
    }

    public Node<T> head = null;

    public void addNode(T data){
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

            while(node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList<Integer>();
        mySingleLinkedList.addNode(1);
        mySingleLinkedList.addNode(3);
        mySingleLinkedList.addNode(2);
        mySingleLinkedList.addNode(4);
        mySingleLinkedList.addNode(5);

        mySingleLinkedList.printAll();

    }

}

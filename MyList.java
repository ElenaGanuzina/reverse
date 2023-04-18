public class MyList{
    
    static Node head;

    public MyList(){
        head = null;
    }

    static class Node{
        public int value;
        public Node next;
 
        public Node(int value){
            this.value = value;
        }
    }

    public void add(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
        }
    }

    public static Node reverse (Node node, Node previous){
        if (node.next == null){
            head = node;
            node.next = previous;
            return null;
        }
        Node next = node.next;
        node.next = previous;
        reverse(next, node);
        return head;
    }

    public static void printList(Node node){
            while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MyList list = new MyList();
        list.head = new Node(5);
        list.head.next = new Node(7);
        list.head.next.next = new Node(12);
        list.printList(head);
        System.out.println();
        Node result = list.reverse(head, null);
        list.printList(result);
    }
}

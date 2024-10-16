package LinkedList;

public class basicsll {
    public static class Node{
        int data; //value
        Node next; // address of the next node
        Node(int data)
        {
            this.data = data;
        
        }

        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(3);
            Node c = new Node(9);
            Node d = new Node(8);
            Node e = new Node(16);
            // linked list 5->3->9->8->16

            a.next = b; //a ke next me b ka adress store kar rahe hai
            // 5->3
            b.next = c; // 5->3->9
            c.next = d; // 5->3->9->8
            d.next = e;// 5->3->9->8->16
        }
    }
}

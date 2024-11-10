package Trees;

public class traversal {
    public static class Node{
        int value;
        Node left;
        Node right;

        Node(int value)
        {
            this.value = value;
        }

        void preorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.value+" ");
            preorder(root.left);
            preorder(root.right);
        }

        void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
        }

        void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value+" ");
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left  =b;  a.right = c;
        b.left = d;  b.right = e;
        c.left = f;  c.right = g;

        a.preorder(a);
        System.out.println();
        a.inorder(a);
        System.out.println();
        a.postorder(a);

    }
}

package Trees;

import Recursion.sumFrom1toN;

public class imp1 {
    public static class Node{
        int value;
        Node left;
        Node right;

        Node(int value)
        {
            this.value = value;
        }

        //displaying all elements using recursion, only root node will be given
        void print(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.println(root.value+ " ");
            print(root.left);
            print(root.right);
        }

        int sumOfNodes(Node root)
        {
            if(root==null)
            {
                return 0;
            }

            return root.value + sumOfNodes(root.left) + sumOfNodes(root.right);
        }
        int product(Node root)
        {
            if (root==null || root.value==0)
            {
                return 1;
            }
            
            return root.value*product(root.left)*product(root.right);
        }
        

        int max(Node root)
        {
            if(root==null)
            {
                return Integer.MIN_VALUE;// matlab returning loweset integer value in java
            }
            int a = root.value;
            int b = max(root.left);
            int c = max(root.right);

            return Math.max(a, Math.max(b,c));
        }

        int min(Node root)
        {
            if(root==null)
            {
                return Integer.MAX_VALUE;
            }
            int a = root.value;
            int b = min(root.left);
            int c = min(root.right);

            return Math.min(a, Math.min(b,c));
        }

        int size(Node root)
        {
            if(root == null)
            {
                return 0;
            }
            int size = 1 + size(root.left) + size(root.right);
            //sum of 1(root node) + left subtree + right subtree
             return size;
        }

        int level(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lev = 1 + Math.max(level(root.left) ,  level(root.right));
            return lev;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(3);
        Node e = new Node(6);
        Node f = new Node(21);

        //connecting the nodes
        a.left=b;   a.right=c;
        b.left=d;   b.right=e;
        c.right=f;

        //printing the values
       // System.out.println(a.value+" "+a.left.value+" "+a.right.value);
        //a.left.value = b.value    a.right.value = c.value
       // System.out.println(a.left.right.value+ " = " +e.value );

       // a.print(a);
       //System.out.println("the sum is " + a.sumOfNodes(a)); 
        // System.out.println("product is " +a.product(a));

        //System.out.println("max elemenet is "+ a.max(a));

       // System.out.println("minimum el is "+ String.valueOf(a.min(a)));
        //. If an address is being printed, it typically means the code is trying to print an object directly without overriding its toString method.

      //  System.out.println("size is "+ a.size(a));

      System.out.println("no of levels are "+ a.level(a));

    }
}

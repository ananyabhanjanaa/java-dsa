package G4;

import arrays.elementPresent;

public class bst {
    
    public static void main(String[] args) {
        Node root = new Node(54);
        root.left = new Node(25);
        root.right = new Node(75);

        root.left.left = new Node(13);
        root.left.right = new Node(45);

        root.left.right.left = new Node(35);
        root.left.right.right = new Node(53);
      //  inOrder(root);

    //   Node ans = search(root, 845);
    //   System.out.println(ans);

    root=insert(root, 50);
    root=insert(root,100);
    inOrder(root);
    }

    public static void inOrder(Node root){
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val+" ");
        inOrder(root.right);
    }

    public static Node search(Node root, int val)
    {
     if(root==null){return null;} 
     if(root.val==val){return root;}
     if(root.val>val){
        return search(root.left, val);
     }  
     else{
        return search(root.right,val);
     }
    }

    public static Node insert(Node root, int val)
    {
        if(root==null)
        {
            return new Node(val);
        }
        if(root.val>val)
        {
           root.left =  insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

class Node{
    int val;
    Node left;
    Node right;

    Node(int val)
    {
        this.val = val;
    }

    public String toString(){
        return val+" ";
    }
}
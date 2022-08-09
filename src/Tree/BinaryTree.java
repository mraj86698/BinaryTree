package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	 private Node root;

	    /* Constructor */
	    public BinaryTree()
	    {
	        root = null;
	    }
	    /* Function to check if tree is empty */
	    public boolean isEmpty()
	    {
	        return root == null;
	    }
	    /* Functions to insert data */
	    public void insert(int data)
	    {
	        root = insert(root, data);
	    }
	    /* Function to insert data recursively */
	    private Node insert(Node node, int data)
	    {
	        if (node == null)
	            node = new Node(data);
	        else
	        {
	            if (node.getRight() == null)
	                node.right = insert(node.right, data);
	            else
	                node.left = insert(node.left, data);
	        }
	        return node;
	    }
//	    /* Functions to insert data */
//	    public void delete(int data)
//	    {
//	        root = delete(root, data);
//	    }
//	    /* Function to insert data recursively */
//	    private Node delete(Node node, int data)
//	    {
//	    	// Return if the tree is empty
//	        if (node == null)
//	        	return node;
//	        // Find the node to be deleted
//	        if (data < node.data)
//	          root.left = delete(node.left, data);
//	        else if (data > node.data)
//	          root.right = delete(node.right, data);
//	        else {
//	          // If the node is with only one child or no child
//	          if (node.left == null)
//	            return node.right;
//	          else if (node.right == null)
//	            return node.left;
//	          // If the node has two children
//	          // Place the inorder successor in position of the node to be deleted
//	          node.data = minValue(node.right);
//
//	          // Delete the inorder successor
//	          node.right = delete(node.right, root.data);
//	        }
//	        return node;
//	    }
//	    // Find the inorder successor
//	    int minValue(Node node) {
//	      int minv = node.data;
//	      while (node.left != null) {
//	        minv = node.left.data;
//	        node = node.left;
//	      }
//	      return minv;
//	    }
	    static void deleteDeepest(Node root, Node delNode)
	    {
	        Queue<Node> q = new LinkedList<Node>();
	        q.add(root);
	        Node temp = null;
	        // Do level order traversal until last node
	        while (!q.isEmpty())
	        {
	            temp = q.peek();
	            q.remove();

	            if (temp == delNode)
	            {
	                temp = null;
	                return;
	            }
	            if (temp.right!=null)
	            {
	                if (temp.right == delNode)
	                {
	                    temp.right = null;
	                    return;
	            }
	            else
	                q.add(temp.right);
	        }
	        if (temp.left != null)
	        {
	            if (temp.left == delNode)
	            {
	                temp.left = null;
	                return;
	            }
	            else
	                q.add(temp.left);
	        }
	    }
	    }
	    // Function to delete given element
	    // in binary tree
	    static void delete(Node root, int data)
	    {
	        if (root == null)
	            return;

	        if (root.left == null &&
	        root.right == null)
	        {
	            if (root.data == data)
	            {
	                root=null;
	                return;
	            }
	            else
	                return;
	        }
	        Queue<Node> q = new LinkedList<Node>();
	        q.add(root);
	        Node temp = null, keyNode = null;
	        // Do level order traversal until
	        // we find key and last node.
	        while (!q.isEmpty())
	        {
	            temp = q.peek();
	            q.remove();
	            if (temp.data == data)
	                keyNode = temp;
	            if (temp.left != null)
	                q.add(temp.left);
	            if (temp.right != null)
	                q.add(temp.right);
	        }
	        if (keyNode != null)
	        {
	            int x = temp.data;
	            deleteDeepest(root, temp);
	            keyNode.data = x;
	        }
	    }

	    /* Function to count number of nodes */
	    public int countNodes()
	    {
	        return countNodes(root);
	    }
	    /* Function to count number of nodes recursively */
	    private int countNodes(Node r)
	    {
	        if (r == null)
	            return 0;
	        else
	        {
	            int l = 1;
	            l += countNodes(r.getLeft());
	            l += countNodes(r.getRight());
	            return l;
	        }
	    }
	    /* Function to search for an element */
	    public boolean search(int val)
	    {
	        return search(root, val);
	    }
	    /* Function to search for an element recursively */
	    private boolean search(Node r, int val)
	    {
	        if (r.getData() == val)
	            return true;
	        if (r.getLeft() != null)
	            if (search(r.getLeft(), val))
	                return true;
	        if (r.getRight() != null)
	            if (search(r.getRight(), val))
	                return true;
	        return false;
	    }
	    /* Function for inorder traversal */
	    public void inorder()
	    {
	        inorder(root);
	    }
	    private void inorder(Node r)
	    {
	        if (r != null)
	        {
	            inorder(r.getLeft());
	            System.out.print(r.getData() +" ");
	            inorder(r.getRight());
	        }
	    }
	    /* Function for preorder traversal */
	    public void preorder()
	    {
	        preorder(root);
	    }
	    private void preorder(Node r)
	    {
	        if (r != null)
	        {
	            System.out.print(r.getData() +" ");
	            preorder(r.getLeft());
	            preorder(r.getRight());
	        }
	    }
	    /* Function for postorder traversal */
	    public void postorder()
	    {
	        postorder(root);
	    }
	    private void postorder(Node r)
	    {
	        if (r != null)
	        {
	            postorder(r.getLeft());
	            postorder(r.getRight());
	            System.out.print(r.getData() +" ");
	        }
	    }

}

package Tree;

public class Node {

		Node left, right;
	    int data;

	    /* Constructor */
	    public Node()
	    {
	        left = null;
	        right = null;
	        data = 0;
	    }
	    /* Constructor */
	    public Node(int n)
	    {
	        left = null;
	        right = null;
	        data = n;
	    }
	    /* Function to set left node */
	    public void setLeft(Node n)
	    {
	        left = n;
	    }
	    /* Function to set right node */
	    public void setRight(Node n)
	    {
	        right = n;
	    }
	    /* Function to get left node */
	    public Node getLeft()
	    {
	        return left;
	    }
	    /* Function to get right node */
	    public Node getRight()
	    {
	        return right;
	    }
	    /* Function to set data to node */
	    public void setData(int d)
	    {
	        data = d;
	    }
	    /* Function to get data from node */
	    public int getData()
	    {
	        return data;
	    }


}

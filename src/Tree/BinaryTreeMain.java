package Tree;


import java.util.Scanner;
/**
 * This is an BinaryTree
 */
public class BinaryTreeMain
{
    public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       /* Creating object of BinaryTree */
       BinaryTree tree = new BinaryTree();
       /*  Perform tree operations  */
       System.out.println("Binary Tree Test\n");
       while(true)
       {
           System.out.println("\nBinary Tree Operations\n");
           System.out.println("1. Insert ");
           System.out.println("2. Delete");
           System.out.println("3. Search");
           System.out.println("4. Count nodes");
           System.out.println("5. Check empty");


           int choice = scan.nextInt();
           switch (choice)
           {
           case 1 :
               System.out.println("Enter integer element to insert");
               tree.insert( scan.nextInt() );
               break;

           case 2:
        	   System.out.println("Enter integer element to Delete");
               Node node = null;
			tree.delete(node,9 );
               break;
           case 3 :
               System.out.println("Enter integer element to search");
               System.out.println("Search result : "+ tree.search( scan.nextInt() ));
               break;
           case 4 :
               System.out.println("Nodes = "+ tree.countNodes());
               break;
           case 5 :
               System.out.println("Empty status = "+ tree.isEmpty());
               break;

           default :
               System.out.println("Wrong Entry \n ");
               break;
           }
           /*  Display tree  */
           System.out.print("\nPost order : ");
           tree.postorder();
           System.out.print("\nPre order : ");
           tree.preorder();
           System.out.print("\nIn order : ");
           tree.inorder();

       }
   }
}
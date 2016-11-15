import java.util.Scanner;
class Node
{
	Node left;
	Node right;
	int data;
	public Node()
	{
		left = null;
		right = null;
		data = 0;
	}
	public Node(int n)
	{
		left = null;
		right = null;
		data = n;
	}
	public void setLeft(Node n)
	{
		left = n;
	}
	public void setRight(Node n)
	{
		right = n;
	}
	public Node getLeft()
	{
		return left;
	}
	public Node getRight()
	{
		return right;
	}
	public void setData(int d)
	{
		data = d;
	}
	public int getData()
	{
		return data;
	}
}
class BST
{
	private Node root;
	public BST()
	{
		root = null;
	}	
	public boolean isEmpty()
	{
		if(root == null)
			return true;
		else
			return false;
	}
	public void insert(int data)
	{
		root = insert(root,data);
	}	
	private Node insert(Node node,int data)
	{
		if(node == null)
			node = new Node(data);
		else
		{
			if(data <= node.getData())
				node.left = insert(node.left,data);
			else
				node.right = insert(node.right,data);
		}
		return node;
	}
	public void delete(int k)
	{
		if(isEmpty())
			System.out.println("Tree is empty");
		else if(search(k) == false)
			System.out.println(k+" dosen't exist in the tree");
		else
		{
			root = delete(root,k);
			System.out.println(k+" is deleted from the tree");
		}
	}
	private Node delete(Node root,int k)
	{
		Node p,q,n;
		if(root.getData() == k)
		{
			Node lt,rt;
			lt = root.getLeft();
			rt = root.getRight();
			if(lt == null && rt == null)
				return null;
			else if(lt == null)
			{
				p = rt;
				return p;
			}
			else if(rt == null)
			{
				p = lt;
				return p;
			}
			else
			{
				q = rt;
				p = rt;
				while(p.getLeft() != null)
					p = p.getLeft();
				p.setLeft(lt);
				return q;
			}
		}
		if(k < root.getData())
		{
			n = delete(root.getLeft(),k);
			root.setLeft(n);
		}
		else
		{
			n = delete(root.getRight(),k);
			root.setRight(n);
		}
		return root;
	}
	public boolean search(int val)
	{
		return search(root,val);
	}
	private boolean search(Node r,int val)
	{
		boolean found = false;
		while((r != null) && !found)
		{
			int rval = r.getData();
			if(val > rval)
			{
				r = r.getRight();
			}
			else if(val < rval)
			{
				r = r.getLeft();
			}	
			else
			{
				found = true;
				break;
			}
			found = search(r,val);
		}
		return found;
	}
	public void inorder()
	{
		inorder(root);
	}
	private void inorder(Node r)
	{
		if(r != null)
		{
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}
	public void preorder()
	{
		preorder(root);
	}
	private void preorder(Node r)
	{	
		if(r != null)
		{
			System.out.print(r.getData() +" ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}
	public void postorder()
	{
		postorder(root);
	}	
	private void postorder(Node r)
	{
		if(r != null)
		{
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}
	public void display()
	{
		System.out.println("In order: ");
                inorder();
                System.out.println("\nPre order: ");
                preorder();
                System.out.println("\nPost order: ");
                postorder();

	}
}
public class BinarySearchTree
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		BST o = new BST();
		char ch;
		do
		{
			System.out.println("BST operations:");
			System.out.println ("1.insert");
			System.out.println ("2.delete");
			System.out.println ("3.search");
			System.out.println ("4.checkEmpty"); 
	 	 	int choice = scan.nextInt();
			switch(choice)
			{
			case 1 :
				System.out.println("Eneter element to be inserted");
				o.insert(scan.nextInt());
				o.display();
				break;
			case 2 :
				System.out.println ("Enter element to be deleted");
				o.delete(scan.nextInt());
				o.display();
				break;
			case 3 :
				System.out.println("Enter the element to search");
				System.out.println("Search result : " + o.search(scan.nextInt()));
				break;
			case 4 :
				System.out.println("Empty status = "+ o.isEmpty());
				break;
			default :
				System.out.println("Invalid entry");
				break;
			}
			System.out.println ("\nDo you want to continue?(Type y or n)");
			ch = scan.next().charAt(0);
		} while(ch == 'y' || ch == 'Y');
	}
}
				
			

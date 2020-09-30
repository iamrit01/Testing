import java.util.*;
public class Main
{
    class Node 
    {
        int data;
        Node next;
        public Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void add(int d)
    {
        Node newNode = new Node(d);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next= newNode;
            tail = newNode;
        }
    }
    
    public void sort(Node data)
    {
        
    }
    
    public void display()
    {
        Node current = head; 
        if(current == null)
        {
            System.out.println("Empty Node");
        }
        else
        {
            while(current != null)
            {
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args)
	{
		Main ls = new Main();
		Scanner sc = new Scanner(System.in);
		Node data;
		int n = sc.nextInt();
		while(n!=0)
		{
		  data = ls.add(sc.nextInt());
		    n--;
		}
		ls.sort(data);
		ls.display();
	}
}
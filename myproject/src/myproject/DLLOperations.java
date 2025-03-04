package myproject;
import java.util.*;
class DoublyLinkedList
{
	class Node
	{
		int item;
		Node next;
		Node previous;
		public Node(int item)
		{
			this.item = item;
		}
	}
	Node head,tail = null;
	//Adding at start
	public void addAtStart(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}
		else 
		{
			head.previous = newNode;
			newNode.next = head;
			newNode.previous = null;
			head = newNode;
		}
	}
	//add at end
	public void addAtEnd(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}
		else
		{
			Node temp = head;
			while(temp.next!= null)
				temp = temp.next;
			newNode.previous = temp;
			newNode.next = null;
		}
	}
	public void addAtAny(int data,int pos)
	{
		Node newNode = new Node(data);
		newNode.next = null;
		newNode.previous = null;
		if(pos<0)
		{
			System.out.println("No such position");
			return ;
		}
		else if(pos == 0)
		{
			head.previous = newNode;
			newNode.next = head;
			newNode.previous = null;
		}
		else
		{
			Node temp = head;
			for(int i=0;i<pos-1;i++)
			{
				if(temp != null)
					temp = temp.next;
			}
			if(temp != null)
			{
				newNode.next = temp.next;
				newNode.previous = temp;
				temp.next = newNode;
				if(newNode.next!=null)
					newNode.next.previous = newNode;
			}
			else
				System.out.println("Previous node is null");
		}
	}
	public void deleteAtPos(int pos)
	{
		if(head ==null || pos<0)
		{
			System.out.println("Empty");
			return;
		}
		Node temp =head;
		for(int i =0;i<pos &&temp != null;i++)
			temp = temp.next;
		if(temp == null)
		{
			System.out.println("No such pos");
			return;
		}
		if(head == temp)
			head = head.next;
		if(temp.previous != null)
			temp.previous.next = temp.next;
		temp = null;
	}
	public void deleteElement(int data)
	{
		Node temp = head;
		if(temp == null)
		{
			System.out.println("Empty");
			return;
		}
		while(temp != null)
		{
			temp = temp.next;
			if(temp.item == data)
				break;
		}
		if(head == temp)
			head = head.next;
		if(temp.previous != null)
			temp.previous.next = temp.next;
		temp = null;
	}
	//dispaly
	public void display()
	{
		Node temp = head;
		if(head == null)
			System.out.println("Empty");
		else
		{
			while(temp!= null)
			{
				System.out.println(temp.item+" ");
				temp =temp.next;
			}
		}
	}
}
public class DLLOperations 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList dl_List = new DoublyLinkedList();
		int ch;
		System.out.println("Doubly LinkedList Operations");
 		do
		{
			System.out.println("1.Insert at the beginning\n2.Insert at the end\n3.Insert at any position\n4.Delete from a position\n5.Delete an element\n6.Display");
 			System.out.println("Enter an option:");
 			int opt = sc.nextInt();
 			switch(opt)
 			{
 				case 1 :System.out.println("Enter an element to insert:");
					    dl_List.addAtStart(sc.nextInt());
						break;
 				case 2 :System.out.println("Enter an element to insert:");
	 					dl_List.addAtEnd(sc.nextInt());
	 					break;
	 			case 3 :System.out.println("Enter an element to insert and position:");
	 					int d = sc.nextInt();
	 					int p = sc.nextInt();
	 					dl_List.addAtAny(d,p);
						break;
				case 4 :System.out.println("Enter the position to delete:");
						int pos = sc.nextInt();
	 					dl_List.deleteAtPos(pos);
	 					break;
				case 5 :System.out.println("Enter an element to delete:");	
						int e = sc.nextInt();
						dl_List.deleteElement(e);
						break;
				case 6 :System.out.println("Here it is:");
						dl_List.display();
						break;
 			}
 			System.out.println("do you want to continue:");
 			ch = sc.nextInt();
		}while(ch ==1 );
}
}
//OUTPUT
/*Doubly LinkedList Operations
1.Insert at the beginning
2.Insert at the end
3.Insert at any position
4.Delete from a position
5.Delete an element
6.Display
Enter an option:
1
Enter an element to insert:
3
Do you want to continue(1/0)
1
1.Insert at the beginning
2.Insert at the end
3.Insert at any position
4.Delete from a position
5.Delete an element
6.Display
Enter an option:
2
Enter an element to insert:
7
Do you want to continue(1/0)
1
1.Insert at the beginning
2.Insert at the end
3.Insert at any position
4.Delete from a position
5.Delete an element
6.Display
Enter an option:
3
Enter an element to insert and position:
11 1
Do you want to continue(1/0)
1
1.Insert at the beginning
2.Insert at the end
3.Insert at any position
4.Delete from a position
5.Delete an element
6.Display
Enter an option:
6
Doubly LinkedList:
3 11 7 
Do you want to continue(1/0)
1
1.Insert at the beginning
2.Insert at the end
3.Insert at any position
4.Delete from a position
5.Delete an element
6.Display
Enter an option:
5
Enter an element to delete:
7
Do you want to continue(1/0)
1
1.Insert at the beginning
2.Insert at the end
3.Insert at any position
4.Delete from a position
5.Delete an element
6.Display
Enter an option:
6
Doubly LinkedList:
3 11 
Do you want to continue(1/0)
1
1.Insert at the beginning
2.Insert at the end
3.Insert at any position
4.Delete from a position
5.Delete an element
6.Display
Enter an option:
4
Enter the position to delete:
0
Do you want to continue(1/0)
1
1.Insert at the beginning
2.Insert at the end
3.Insert at any position
4.Delete from a position
5.Delete an element
6.Display
Enter an option:
6
Doubly LinkedList:
11 
Do you want to continue(1/0)
0*/

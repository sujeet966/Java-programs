import java.util.Scanner;
import java.io.*;
class Node
{
  int data;
  Node next;
  
  Node(int data)
  {
        this.data=data;
        this.next = null;
     // System.out.print("I am Node Class Cunstructur");
  }
}
class Linkedlist
{
   
   	Node head = null;
    void append(int data)
    {
        Node node = new Node(data);
        Node temp = new Node(0);
       if(head == null)   head= node;
       else
       {
           temp = head;
           while(temp.next!=null)
             temp=temp.next;
       }
       temp.next = node;
      
    }
    void adbeg(int data)
    {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    void delbeg()
    {
        if(head==null)
        {
            System.out.println("Nothing found");
            return ;
        }
        System.out.println(head.data+" Removed");
        head = head.next;
    }
    void delend()
    {
        if(head == null)
        {
            System.out.println("Nothing found");
            
        }
        else if(head.next == null)
        {
          System.out.println(head.data+" Removed");
          head = null;
        }
        else  
        {
            Node temp = head;
            while(temp.next.next!=null||temp.next==null)
            {
                temp = temp.next;
                //System.out.print(temp.data);
            }
            System.out.print(temp.next.data+" Removed");
            temp.next=null;
        }
    }
    void show()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            //System.in.read();
            return ;
        }
        Node temp =head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	 Scanner sc = new Scanner(System.in);
		Linkedlist list = new Linkedlist();
		while(true)
		{
		    
		    //String s= sc.next();
		     BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Press any key...");
            try { input.readLine();}
            catch (Exception e) { e.printStackTrace();}
		     System.out.print("\033[H\033[2J");  
		    System.out.flush();
		    System.out.println("Enter your choice\t");
		    System.out.println("1.Add data at last");
		    System.out.println("2.Add data at Begining");
		    System.out.println("3.Delete last element");
		    System.out.println("4.Delete first element");
		    System.out.println("5.Show Details");
		    System.out.println("9.Exit");
		   
		    int ch = sc.nextInt();
		    switch(ch)
		    {
		        case 1:  System.out.println("Enter data");
		                 int data = sc.nextInt();
		                 list.append(data);
		                 break;
		        case 2:  System.out.println("Enter data");
		                 data = sc.nextInt();
		                list.adbeg(data);
		                break;
		        case 3: list.delend();
		                break;
		        case 4: list.delbeg();
		                break;
		        case 5: list.show();
		                break;
		        case 9: System.exit(0);
		    }
		}
		
	}
}


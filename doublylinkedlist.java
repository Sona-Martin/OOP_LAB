/*F16. Write a Java program for implementing a doubly linked list( elements of the list may be integers).
Make it a menu driven program with following options,
i) Insert (insertion may be at tail end)
ii) Delete (read the element to delete, search it and then delete, print error message if not found)
iii) Display list
iv) Exit
*/
import java.util.Scanner;
class DoublyLinkedList {    
    //A node class for doubly linked list
    class Node{  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    //Initially, heade and tail is set to null
    Node head, tail = null;  
   
    //add a node to the list  
    public void addNode(int item) {  
        //Create a new node  
        Node newNode = new Node(item);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
    
      
    
    
    public void deleteNodeatpos(int n)
    {
        /* if list in NULL or
          invalid position is given */
        if (head == null || n <= 0)
            return;
 
        Node current = head;
        int i;
 
        /*
         traverse up to the node at
          position 'n' from the beginning
        */
        for (i = 1; current != null && i < n; i++)
        {
            current = current.next;
        }
         
        // if 'n' is greater than the number of nodes
        // in the doubly linked list
        if (current == null)
            return;
 
        // delete the node pointed to by 'current'
        //deleteNode(current);
    }
    
    
    
    
     public int searchNode(int value) {  
        int i = 1;  
        boolean flag = false;  
        //Node current will point to head  
        Node current = head;  
  
        //Checks whether the list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            System.exit(0);  
        }  
        while(current != null) {  
            //Compare value to be searched with each node in the list  
            if(current.item == value) {  
                flag = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(flag)  
             return i;  
        else  
             {System.out.println("Node is not present in the list"); 
              return -1;
             }
    } 
   
//print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  
}
class doublylinkedlist{
    public static void main(String[] args) {  
    Scanner sc= new Scanner(System.in);
    
    DoublyLinkedList dl_List = new DoublyLinkedList();  
    
    System.out.println("Choose an option:");  
    System.out.println("1.Insert Node  2.Delete Node  3.Display list  4.Exit");  
    int num=sc.nextInt();
    do{
    switch(num)
    {
        case 1:
          {  
             System.out.println("Enter the item:");  
             int item=sc.nextInt();
             dl_List.addNode(item);  
             break;
          }
        case 2:
        {
             System.out.println("Enter the item:"); 
             int item=sc.nextInt();
             int pos=dl_List.searchNode(item);  
             dl_List.deleteNodeatpos(pos);
             break;
         }
       case 3:
         {
               dl_List.printNodes();  
               break;
         }
       case 4:
         {
           System.exit(0);
         }
    }
      }while(num!=4);  
        
    }  
}  

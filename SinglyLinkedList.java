 
class LinkedListEmptyException extends RuntimeException{
       public LinkedListEmptyException(){
         super();
       }
      
     public LinkedListEmptyException(String message){
         super(message);
       }  
}
 

class Node {
    public int data; // data in Node.
    public Node next; // points to next Node in list.
 
    
    public Node(int data){
           this.data = data;
    }
 
  
    public void displayNode() {
           System.out.print( data + " ");
    }
}
 
 

class LinkedList {
    private Node first; // ref to first link on list
 
    /**
     * LinkedList constructor
     */
    public LinkedList(){
           first = null;
    }
 
    
    /**
     * Inserts new Node at last of Singly LinkedList.
     */
    public void insertLast(int data){
           Node newNode = new Node(data); //Creation of New Node.
           
           if(first==null){  //means LinkedList is empty, make first point to new Node.
                  first=newNode;    //first ---> newNode
                  return;
           }
           
           Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
           while(tempNode.next!=null){ //Executes until we don't find last Node of LinkedList.
                                                           //If next of some Node is pointing to null, that means it's a last Node.
                  tempNode=tempNode.next; //move to next Node.
           }
           tempNode.next=newNode;  //make last's Node next point to new Node
    }
 
    /**
     * Deletes last Node from Singly LinkedList
     */
    public Node deleteLast(){
           
           //Case1: when there is no element in LinkedList
           if(first==null){  //means LinkedList in empty, throw exception.              
                  throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
           }
           
           //Case2: when there is only one element in LinkedList
           if(first.next==null){   //means LinkedList consists of only one element, delete that.
                  Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
                  first=first.next; // delete firstNode (make first point to secondNode)
                  return tempNode;  //return deleted Node.
           }
           
           //Case3: when there are atLeast two elements in LinkedList
           Node previous=null; 
           Node current=first;
           
           while(current.next!=null){//Executes until we don't find last Node of LinkedList.
                                             //If next of some Node is pointing to null, that means it's a last Node.
                  previous=current;
                  current=current.next;   //move to next node.
           }
           
           previous.next=null;     //Now, previous is pointing to second last Node of LinkiedList,
                                                    //make it point to null [it byPasses current Node(last Node of LinkedList) which was in between]
           return current;
    }
    
    /**
     * Display LinkedList
     */
    public void displayLinkedList() {
           System.out.print("Displaying LinkedList [first--->last]: ");
           Node tempDisplay = first; // start at the beginning of linkedList
           while (tempDisplay != null){ // Executes until we don't find end of list.
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println();
           
    }
 
}
 
  
  
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
/**
 * Main class - To test Singly LinkedList.
 */
public class SinglyLinkedList{
    public static void main(String[] args) {
           LinkedList linkedList = new LinkedList(); // creation of Linked List
           
           linkedList.insertLast(11);
           linkedList.insertLast(21);
           linkedList.insertLast(59);
           linkedList.insertLast(14);
           linkedList.insertLast(39);
 
           linkedList.displayLinkedList(); // display LinkedList
           
           System.out.print("Deleted Nodes: ");
           Node deletedNode = linkedList.deleteLast();  //delete Node
           deletedNode.displayNode();                                 //display deleted Node.
           deletedNode = linkedList.deleteLast();   //delete Node
           deletedNode.displayNode();                                 //display deleted Node.
           
           System.out.println();// sysout used to format output
           linkedList.displayLinkedList(); //Again display LinkedList
           *************************
                   Scanner scan = new Scanner(System.in);

        /* Creating object of class linkedList */

        linkedList list = new linkedList(); 

        System.out.println("Singly Linked List Test\n");          

        char ch;

      

        do

        {

            System.out.println("\nSingly Linked List Operations\n");

            System.out.println("1. insert at begining");

            System.out.println("2. insert at end");

            System.out.println("3. insert at position");

            System.out.println("4. delete at position");

            System.out.println("5. check empty");

            System.out.println("6. get size");            

            int choice = scan.nextInt();            

            switch (choice)

            {

          
            case 2 : /*insert at the end*/

                System.out.println("Enter integer element to insert");

                list.insertAtEnd( scan.nextInt() );                     

                break;                         
                                       

            case 4 : /*delete at pos*/

                System.out.println("Enter position");

                int p = scan.nextInt() ;

                if (p < 1 || p > list.getSize() )

                    System.out.println("Invalid position\n");

                else

                    list.deleteAtPos(p);

                break;
                       

             default : 

                System.out.println("Wrong Entry \n ");

                break;   

            }

            /*  Display List  */ 

            list.display();

            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);                        

        } while (ch == 'Y'|| ch == 'y');               
           
           
           
           
    }
}
 


public class LinkedList{
  
  private Node head;
  private Node tail;
  private int size; 
  
  public LinkedList() {
    size = 0;
  }
  
  private class Node { 
    String E;
    Node next;
    Node prev;
    
    public Node(String E, Node next, Node prev){
      this.E = E; 
      this.next = next;
      this.prev = prev; 
    }
  }
}
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  /** static Node head = null;
  class Node 
  {
    int number;
    Node next, prev;
    
    Node(int n) {
            number = n;
            next = prev = null;
        }
    */
   

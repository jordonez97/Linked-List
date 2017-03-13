
public class LinkedList <E>{
  
  private Node head;
  private Node tail;
  private int size; 
  
  public LinkedList() {
    size = 0;
  }
  
  private class Node { 
    E element;
    Node next;
    Node prev;
    
    public Node(E element, Node next, Node prev){
      this.element = element; 
      this.next = next;
      this.prev = prev; 
    }
  }
 
  public int size(){
    return size;
}
  public boolean isEmpty() {
    return size == 0;
  }
  
  public void addFirst(E element){
    Node tmp = new Node(element, head, null);
    if (head != null) {
      head.prev = tmp;
    }
    head = tmp;
    if(tail == null) {
      tail = tmp;
    }
    size++;
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
   

public class MyLinkedList{
  private int size;
  private Node start;
  private Node end;

  public MyLinkedList(){
    start = new Node(null);
    end = new Node(null);
    start.getNext = end;
    end.getPrev = start;
  }

  public void add(Integer input){
    Node toAdd = new Node(input);
    end.getPrev().setnext(toAdd);
    toAdd.getNext().setnext(end);
  }


private class Node{
  private Integer data;
  private Node next, prev;

  public Node(Integer input){
    this.data = input;
  }

  Node getNext(){
    return this.next;
  }

  Node getPrev(){
    return this.prev;
  }

  void setNext(Node input){
    this.next = input;
  }

  void setPrev(Node input){
    this.prev = input;
  }



}
}

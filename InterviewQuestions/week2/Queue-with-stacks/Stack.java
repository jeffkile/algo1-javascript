class Node {
  public String data;
  public Node next;

  public Node(String d) {
    data = d;
    next = null;
  }
}


public class Stack {

  private Node top;

  public boolean empty() {
    if(top == null) {
      return true;
    }
    return false;
  }

  public void push(Node n) {
    n.next = top;
    top = n;
  }

  public void push(String s) {
    Node n = new Node(s);
    n.next = top;
    top = n;
  }

  public Node pop() {
    Node retMe = top;
    top = top.next;
    return retMe;
  }

  public String toString() {
    if (top == null) {
      return "Stack is empty";
    }
    String retMe = "";
    Node currNode = top;
    
    retMe += currNode.data + " ";
    while (currNode.next != null) {
      currNode = currNode.next;
      retMe += currNode.data + " ";
    }

    return retMe;
  }

}    


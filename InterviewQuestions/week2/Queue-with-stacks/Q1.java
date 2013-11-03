class Queue {
  public Stack in = new Stack();
  public Stack out = new Stack();

  void enqueue(String value) {
    while (!out.empty()) {
      in.push(out.pop());
    }
    in.push(value);
  }

  Node dequeue() {
    while (!in.empty()) {
      out.push(in.pop()); 
    }
    return out.pop();
    
  }
}

public class Q1 {
  public static void main(String[] args) {
    
    Queue q = new Queue();

    
    System.out.println("enqueue " +"Hello");
    System.out.println("enqueue " +"World");
    System.out.println("enqueue " +"Foo");
    System.out.println("enqueue " +"Bar");
    System.out.println("enqueue " +"Java!");
    
    q.enqueue("Hello");
    q.enqueue("World");
    q.enqueue("Foo");
    q.enqueue("Bar");
    q.enqueue("Java!");
   
    System.out.println("in " + q.in.toString());
    System.out.println("out " + q.out.toString());
    System.out.println("dequeue " +q.dequeue().data.toString());
    System.out.println("in " + q.in.toString());
    System.out.println("out " + q.out.toString());
    System.out.println("dequeue " +q.dequeue().data.toString());
    System.out.println("in " + q.in.toString());
    System.out.println("out " + q.out.toString());
    System.out.println("enqueue " + "Saturn");
    q.enqueue("Saturn");
    System.out.println("in " + q.in.toString());
    System.out.println("out " + q.out.toString());
    System.out.println("dequeue " +q.dequeue().data.toString());
    System.out.println("in " + q.in.toString());
    System.out.println("out " + q.out.toString());
    System.out.println("enqueue " + "Jupiter");
    q.enqueue("Jupiter");
    System.out.println("in " + q.in.toString());
    System.out.println("out " + q.out.toString());
    System.out.println("dequeue " +q.dequeue().data.toString());
    System.out.println("in " + q.in.toString());
    System.out.println("out " + q.out.toString());

  }
}


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

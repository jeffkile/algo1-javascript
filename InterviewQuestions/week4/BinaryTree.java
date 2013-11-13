class Heap {

  BinaryTree myTree = new BinaryTree();

}

class Node {
  public Object key;
  public Node left;
  public Node right;
}


class BinaryTree {
  Node head;

  public BinaryTree() {
    head = new Node();
  }

  public void addNode(Node addMe) {
    Node followMe = head;

    while(followMe != null) {

      if (addMe.key <= followMe.key) {
        if (followMe.left == null) {
          followMe.left = addMe;
          return;
        }
        followMe = followMe.left;
      }
      else if (addMe.key > followMe.key) {
        if (followMe.right == null) {
          followMe.right = addMe;
          return;
        }

        followMe = followMe.right;
      }

    }

    followMe = addMe;

  }

}

import java.util.*;


class Solution {
  public static void main(String[] args) {
    Integer[] fixMe = new Integer[] {1,2,3,2,4,4};

    HashSet<Integer> myVals = new HashSet<Integer>();

    for(int i=0; i<fixMe.length; i++) {
      myVals.add(fixMe[i]);
    }

    for(int val : myVals) {
      System.out.print(val + " ");
    }
  }
}

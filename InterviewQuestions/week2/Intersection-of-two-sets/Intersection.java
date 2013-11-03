import java.util.*;

class Intersection {
  public static void main(String[] args) {
    int[] a = {1,3,4,2,5,6, 8, 12, 4, -5, 1, 2, 5, 77, 5, 34, 2, 5, 74, 4, 34, 23, 3, 4, 6, 6, 4, 34, 5, 34, 2, 1, 4 ,6, 4, 8};
    int[] b = {5, 6, 8, 3, 2, 3, 4, 1, 35, 33, 23, 1, 4, 5, 6,7, 12, 34, 2, 74, 4, 5, -2, -1, -4};
    ShellSort.sort( a );
    ShellSort.sort( b );

    int i=0, j=0;
    LinkedList<Integer> intersection = new LinkedList<Integer>();
    while( i<a.length && j<b.length) {

      if(a[i] == b[j]) {
        intersection.push(new Integer(a[i]));
        i++;
        j++;
      }
      else if(a[i] < b[j]) {
        i++;
      }
      else {
        j++;
      }

    }

    while(!intersection.isEmpty()) {
      System.out.print(intersection.pop().toString() + " "); 
    }

  }
}

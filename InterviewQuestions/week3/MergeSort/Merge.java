public class Merge {

  public static char[] sort(char[] a) {
    System.out.println(prettyPrint(a));
    char[] aux = new char[a.length];

    sort(a, aux, 0, a.length-1);
    System.out.println(prettyPrint(a));
    return a;
  }

  public static void sort (char[] a, char[] aux, int lo, int hi) {

    if(hi <= lo) return;
    int mid = lo + (hi-lo) / 2;
    System.out.println(mid);
    sort(a, aux, lo, mid);
    sort(a, aux, mid+1, hi);
    merge(a, aux, lo, mid, hi);

  }
 
  public static void merge(char[] a, char[] aux, int lo, int mid, int hi) {
    System.out.println(lo + " " + mid + " " + hi);


    for(int k=lo; k<=mid; k++) {
      aux[k] = a[k];
    }

    int i=lo, j=mid+1;
    for (int k=lo; k<=hi; k++) {
      
      if (i > mid) {
        a[k] = a[j];
        j++;
      }
      else if (j > hi) {
        a[k] = aux[i];
        i++;
      }
      else if (a[j] < a[i]) {
        a[k] = a[j];
        j++;
      } 
      else {
        a[k] = aux[i];
        i++;
      }
    }

    
    System.out.println("a: " + prettyPrint(a));
    System.out.println("aux: " + prettyPrint(aux));
  }

  private static String prettyPrint(char[] printMe) {
    String retMe = "";

    for(int i=0; i<printMe.length; i++) {
      retMe += printMe[i] + " ";
    }
    return retMe;
  }

}

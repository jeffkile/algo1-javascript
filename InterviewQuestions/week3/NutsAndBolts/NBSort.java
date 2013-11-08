class QuickSort {

  private static int partition(int[] nuts, char bolt, int lo, int hi) {

    int i = lo, j = hi+1, pivot = lo, tmp;

    while(i<j) {

      while (a[++i] < bolt)
        if (i == hi)
          break;

      while (a[--j] > bolt)
        if (j == lo)
          break;


      if (i<j) {
        System.out.println("swapping" + a[i] + a[j]);
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
      }

    }

//     tmp = a[pivot];
//     a[pivot] = a[j];
//     a[j] = tmp;

    return j;

  }


  public static void sort(int[] a) {
    if(a.length <= 1)
      return;

    //shuffle(a);

    sort(a, 0, a.length-1 );
  }

  private static void sort(int[] a, int lo, int hi) {

    prettyPrint(a);
    if(lo>=hi) return;

    int pivot = partition(a, lo, hi);
    sort(a, lo, pivot-1);
    sort(a, pivot+1, hi);

  }

  private static void prettyPrint(int[] printMe) {
    for(int i=0; i<printMe.length; i++) {
      System.out.print(printMe[i] + " ");
    }
      System.out.println(" ");
  }

}


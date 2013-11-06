class QuickSort {

  private static int Partition(int[] a, int pivot, int lo, int hi) {


    int i = lo, j = hi, tmp;

    while(i<j) {

      while (a[i] <= a[pivot] ) 
        if (i>=hi) 
          break;

      while (a[j] >= a[pivot] ) 
        if (j <= lo)
          break;


      if (i<j) {
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
      }

    }

    tmp = a[j];
    a[j] = a[i];
    a[i] = tmp;

    return j;

  }

}


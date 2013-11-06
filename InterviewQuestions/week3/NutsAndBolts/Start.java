class Start {
  public static void main (String [] args) {
    int[] sortMe = new int[] {1,3,4,2,5,3,2,5,6,8,6,7,4,3,6,9,9,0,2};
    QuickSort.sort(sortMe);
    prettyPrint(sortMe);
  }

  private static void prettyPrint(int[] printMe) {
    for(int i=0; i<printMe.length; i++) {
      System.out.print(printMe[i] + " ");
    }
  }
}





// B E D C A

// 5 2 3 1 4


// D

// Fits 5
// Bigger 1 4
// Smaller 2 3



// char[] nuts = new char[] {'B', 'E', 'D', 'C', 'A'};
// int[] bolts = new int[] {5, 2, 3, 1, 4};

// for (int j=0; j<bolts.length; j++) {

//   if(bigger(
//           for (int i=0; i<nuts.length; i++) {


// public static void 

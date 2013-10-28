var numbers = [-9,-7,-6,-4,-3,-1,0,2,3,4,5,6,7,8],
    count = 0,
    i = 0,
    j = 0,
    k = 0,
    N = 0,
    sum = 0;

for (i=0; i<numbers.length; i++) {
   
  k = numbers.length-1;
  j = 0;
  while (j<k) {
    sum = numbers[i] + numbers[j] + numbers[k];
    if (sum === 0) {
      console.log( numbers[i] + numbers[j] + numbers[k]);
      j += 1;
    }
    else if ( sum > 0 ) {
      k -= 1;
    }
    else {
      j += 1;
    }
  }
}
   

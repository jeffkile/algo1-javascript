//http://www.careercup.com/question?id=24532662

import java.util.*;

class Person {
  public int height;
  public int pplInFront;

  public Person(int height, int pplInFront) {
    this.height = height;
    this.pplInFront = pplInFront;
  }
}

class ComparePersonHeight implements Comparator<Person> {
  public int compare(Person person1, Person person2) {
    if(person1.height < person2.height)
      return -1;
    else if(person1.height == person2.height)
      return 0;
    else 
      return 1;
  }
}
class ComparePersonPplInFront implements Comparator<Person> {
  public int compare(Person person1, Person person2) {
    if(person1.pplInFront < person2.pplInFront)
      return -1;
    else if(person1.pplInFront == person2.pplInFront)
      return 0;
    else 
      return 1;
  }
}

class Solution {
  public static void main(String[] args) {

    Person[] ppl = new Person[3];
    ppl[0] = new Person(3, 0);
    ppl[1] = new Person(2, 1);
    ppl[2] = new Person(1, 1);
    
    print(ppl);
    
    Arrays.sort(ppl, 0, ppl.length-1, new ComparePersonPplInFront());

    int i=0; 
    int count=0;
    int start=0;
    while(i < ppl.length) {
      while(i < ppl.length && ppl[i].pplInFront-count == 0 ) {
        i++;
      }
      
      Arrays.sort(ppl, start, i, new ComparePersonHeight());

      start=i;
      count++;
    }
     
    print(ppl);
  }

  private static void print(Person[] ppl) {
    for(int p=0; p<ppl.length; p++) {
      System.out.print(ppl[p].height + ",");
      System.out.print(ppl[p].pplInFront+ "  ");
    }
    System.out.println();
  }
}

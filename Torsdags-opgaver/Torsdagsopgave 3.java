//TASK 1

class Palindrome {

public static String isPalindrom(String word) {

     String reverseStr = "";
    
    int wordLength = word.length();

    for (int i = (wordLength - 1); i >=0; --i) {
      reverseStr = reverseStr + word.charAt(i);
    }

    if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
     // System.out.println(word + " is a Palindrome String.");
      return word + " is a Palindrome String.";
    }
    else {
     // System.out.println(word + " is not a Palindrome String.");
      return word + " is not a Palindrome String.";
    }
  }

//Man kan evt lave en ny tab og putte det her i, og kalde det fra "main".
  public static void main(String[] args) {
 String text = isPalindrom("DenLaksSkalNeds");
 System.out.println(text);
  }
} 

// TASK 2

public class Substring{    
 public static void main(String args[]){    
 String i="København";    
 System.out.println("Original String: " + i);  
 System.out.println("Substring starting from index 0: " +i.substring(0));//K    
 System.out.println("Substring starting from index 1 to 4: "+i.substring(1,4)); //Øben  
 }  
}    

// TASK 3

import java.util.Random

class MathWork {
public static void main (String[] args) {
    int numbers = 100;
    int divisible = 12;
    int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

    for (int i = 1; i <= numbers; i++) {
        if(i%divisible==0){
            System.out.print(i + " ");
        }


    }
System.out.println();
System.out.println(getRandom(arr));
printNum(5);
}
public static int getRandom(int[]arr) {
    int rnd = new Random().nextInt(arr.length);
    return arr[rnd];
}
public static void printNum( int num){
    System.out.println(num);
    num = num -1
    Systen.out.println(num);
}
} 

// TASK 4 

class FibonacciExample2{
 static int n1=0,n2=1,n3=0;  
 static void printFibonacci(int count){  
    if(count>0){  
         n3 = n1 + n2;  
         n1 = n2;  
         n2 = n3;  
         System.out.print(" "+n3); 
         printFibonacci(count-1);  
     }  
 }  
 public static void main(String args[]){  
  int count=17;  
  System.out.print(n1+" "+n2);
  printFibonacci(count-2);
 }
}

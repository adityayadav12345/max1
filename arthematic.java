/*Design the following classes:

A class named Arithmetic with a method named add that takes  2 integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be be public . Test your program by calling the add method on an Adder object and passing it 2 integer parameters.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic{
    public int add(int a, int b){
        int sum = a + b; 
        return sum;
    }
}

class Adder extends Arithmetic{  
    public int callAdd(int a, int b){
        return add(a, b);
    }
}

public class Main{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println( a.getClass().getSuperclass().getName());  
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(" " +a.add(13,20));
     }
}

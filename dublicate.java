/*Write a method that removes the duplicate elements from an array list of integers using the following header:*/

import java.util.Scanner;
import java.util.ArrayList;
public class Main{
  public static void main(String[] args) {
   
    ArrayList<Integer> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      list.add(input.nextInt());
    }
    removeDuplicate(list);
     
    
    for (int i = 0; i < list.size(); i++)
    {
        
        System.out.print(list.get(i) + " ");
    }
      
  }
  public static void removeDuplicate(ArrayList<Integer> list) {
    ArrayList<Integer> temp = new ArrayList<>();
    for (int i = 0; i < list.size(); i++)
      if (!temp.contains(list.get(i)))
        temp.add(list.get(i));
    list.clear();
    for (int i = 0; i < temp.size(); i++)
      list.add(temp.get(i));
  }
}

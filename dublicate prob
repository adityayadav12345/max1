/*Problem Description

Write a method that removes the duplicate elements from an array list of integers using the following header:

public static void removeDuplicate(ArrayList<Integer> list)

Write a test program that prompts the user to enter n integers to a list and displays the distinct integers separated by exactly one space.

Input Format

First line contains the number of integers, n

Second line takes n integers separated by exactly one space.

Output Format

A single line contains the distinct integers separated by exactly one space.*/
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for (int i = 0; i < n; i++) {
      list.add(input.nextInt());
    }
    removeDuplicate(list);

    for (int i = 0; i < list.size(); i++)
      System.out.print(list.get(i) + " ");
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

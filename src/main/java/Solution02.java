import java.util.Scanner;
 /*
  *  UCF COP3330 Fall 2021 Assignment 1 Solution
  *  Copyright 2021 Federico Abreu Seymour
  */

 public class Solution02 {

     /*
     print "What is the input string"
     add scanner string name = input
     print name + "has" string.length "characters."

      */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String name = input.nextLine();
        System.out.print(name + " has " + name.length() + " characters.");


    }
}

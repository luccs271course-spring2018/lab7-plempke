package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {

    LinkedStack<String> stack = new LinkedStack<String>();
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }
    
  private static void printReverse(final Scanner input) {
    String temp = input.nextLine();
    Stack<String> stack = new Stack<>;
    stack.push(temp);
    System.out.println(temp);
    
    if(input.hasNext()) {
      printReverse(input);
    }
    else {
      return;
    }
    System.out.println(stack.pop());
  }
  }
}

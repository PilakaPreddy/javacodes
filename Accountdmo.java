//Problem 1 Demo class
package labweek4codes;

import java.util.Scanner;

public class Accountdmo {

  public static void main(String[] args) {
    Account a1=new Account();     //1st customer
    Scanner s=new Scanner(System.in);
    int num,cash;
    boolean check;
    System.out.println("Enter 2nd customer id and cash");
    num=s.nextInt();
    cash=s.nextInt();
    Account a2=new Account(num,cash);
    Account a3=new Account();
    System.out.println("Enter 3rd customer id and cash");
    num=s.nextInt();
    cash=s.nextInt();
    check=a3.setId(num);
    if(check==false)
      System.out.println("Invalid ID");
    check=a3.setbalance(cash);
    if(check==false)
      System.out.println("Invalid cash");
    System.out.println("Enter amount to be deposited");
    cash=s.nextInt();
    a3.deposit(cash);
    System.out.println("Enter amount to withdraw");
    cash=s.nextInt();
    a3.withdraw(cash);
    System.out.println("Customer details");
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    s.close();
  }

}
package inp;
import java.util.*;
 class input{
  public static void main(String args[])
  {
    Scanner objScanner=new Scanner(System.in);

    System.out.println("enter a integer");

    int a=objScanner.nextInt(); 

    System.out.println("enter a character:");
    Character b=objScanner.next().charAt(0);

    System.out.println("enter  Float:");
    Float f=objScanner.nextFloat();

    System.out.println("enter double:");
    Double d=objScanner.nextDouble();

    objScanner.nextLine();
    
    System.out.println("enter string");
    String s=objScanner.nextLine();

    System.out.println(a+" "+b+" "+f+" "+d+" "+s);
  }
};
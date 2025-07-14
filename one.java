// class one
// {
//     public static void main(String[] args){

//         int a = 10;
//         int b =20;

//         System.out.println(a+b);
//     }
// };


import java.util.Scanner;    
// class one
// {
//   public static void main(String args[])
//   {
//     Scanner obj=new Scanner(System.in);
//     int a;
//     System.out.println("enter a number");
//     a=obj.nextInt();
//     System.out.println(a);  
//   }
//

 class one{
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
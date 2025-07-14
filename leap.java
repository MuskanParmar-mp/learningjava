import java.util.Scanner;

class leap
{
    public static void main( String arr[])
    {
    Scanner obj=new Scanner(System.in);
    int year=obj.nextInt();

    if((year%4==0 && year%100!=0) ||(year%400==0))  System.out.print("leap year");

    else System.out.print("not a leap year");
    }
    
}
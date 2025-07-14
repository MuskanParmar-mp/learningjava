import java.util.Scanner;

class month
{
    public static void main( String arr[])
    {
    Scanner obj=new Scanner(System.in);
    int month=obj.nextInt();

    if(month==1 || month==3 ||  month==5 ||  month==7 ||  month==8 ||month==10 ||month==12 );
    System.out.print("31 days");

    else (month==2 || month==4 || month==6 || month==9 ||month==11 );
    System.out.print("30 Days");

    }
}
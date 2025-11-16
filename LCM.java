import java.util.Scanner;

public class LCM
{
    public static void main (String [] arr)  {
      Scanner sc = new Scanner(System.in);

      int n1=36;
      int n2=6;

      for(int i=36; ; i=i+n2){
        if(i%n1==0  && i%n2==0 ){
            LCM=i;
            System.out.println(i);
            break;
        }
      }

      

    }
}
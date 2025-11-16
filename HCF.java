import java.util.Scanner;

public class HCF
{
    public static void main (String [] arr)  {
      Scanner sc = new Scanner(System.in);

      int n1=36;
      int n2=6;
      int hcf=0;

      for(int i=1; i<=n2; ++i){
        if(n1%i==0 && n2%i==0){
            hcf=1;
        }
      }

      System.out.println(hcf);

    }
}
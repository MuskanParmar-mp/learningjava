import java.util.Scanner;

class fibo
{
    static int fibo()
    {
        int n=6;
        int fi=1;
        int se=2;
        int i=1;
        while(i<n)
        {
            if(i==1){
                System.out.println(fi);
                ++i;
                continue;
            }
            if(i==2){
                System.out.println(se);
                ++i;
                continue;
            }
            int next=fi+se;
            System.out.println(next);
            fi=se;
            se=next;
            ++i;
        }
        return 0;
    }
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);
        fibo();
    }
}
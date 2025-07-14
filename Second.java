import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("give me number between 10 to 20  :");
        int num = sc.nextInt();

        if(num>=10 &&num<=20){
            if(num%2==0  && num%3==0){
                System.out.print(num);
                System.out.print("Valid");
                    
                }else{
                    System.out.print("invalid");
                }

            }



    
    }
}
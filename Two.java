
class Two
{
    int balance;
    int pin;
    void showbal(int pin)
    {
        if(pin==1234)
        {
            balance=1200;
            System.out.println(balance);
        }
    }
    void add(int amount){
        balance+=amount;
        System.out.println(balance);
    }
    void withdrawal(int amount){
        balance-=amount;
        System.out.println(balance);
    }

    public static void main(
        Two obj= new Two();
        obj.showbal(1234);
        obj.add(2300);
        obj.withdrawal(1300);
    )
}
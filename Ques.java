import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter one-way distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time spent in restaurant (hours): ");
        double time = sc.nextDouble();

        double oneWayCost = 0;
        double kmLeft = distance;

        
        if (kmLeft > 0) {
            if (kmLeft >= 10) {
                oneWayCost += 10 * 10; // 10 Rs/km
                kmLeft -= 10;
            } else {
                oneWayCost += kmLeft * 10;
                kmLeft = 0;
            }
        }

        
        if (kmLeft > 0) {
            if (kmLeft >= 10) {
                oneWayCost += 10 * 15; // 15 Rs/km
                kmLeft -= 10;
            } else {
                oneWayCost += kmLeft * 15;
                kmLeft = 0;
            }
        }

        
        if (kmLeft > 0) {
            if (kmLeft >= 10) {
                oneWayCost += 10 * 20; // 20 Rs/km
                kmLeft -= 10;
            } else {
                oneWayCost += kmLeft * 20;
                kmLeft = 0;
            }
        }

        
        if (kmLeft > 0) {
            oneWayCost += kmLeft * 25; // 25 Rs/km
        } else {
            // Kuch nahi karna agar kmLeft = 0
        }

        
        double roundTripCost = oneWayCost * 2;

        
        double hourlyCost = time * 200;

        
        double total = roundTripCost + hourlyCost;

        
        if (distance * 2 > 30) {
            total -= 100;
            System.out.println("Discount of Rs 100 applied.");
        } else {
            System.out.println("No discount applied.");
        }

        
        System.out.println("One-way cost: Rs " + oneWayCost);
        System.out.println("Round trip cost: Rs " + roundTripCost);
        System.out.println("Hourly cost: Rs " + hourlyCost);
        System.out.println("Total cost to pay: Rs " + total);
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double height, weight, bodyIndex;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height (as meter): ");
        height = scanner.nextDouble();

        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();

        bodyIndex = weight / (height * height);
        System.out.println("Your body-mass index is: " + bodyIndex);

    }

}

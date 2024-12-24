package Charan;
import java.util.ArrayList;
import java.util.List;

public class PrimeNum{

    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        System.out.println("The first 17 prime numbers between 1 and 300 are:");

        while (count < 17 && num <= 300) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

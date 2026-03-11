package Week6;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age (Seperate it by spaces): ");
        String input = scanner.nextLine();
        String[] ages = input.split(" ");

        Queue<String> AllowedQueue = new PriorityQueue<>();
        Queue<String> NotAllowedQueue = new PriorityQueue<>();
        for (String age : ages) {
            if (Integer.parseInt(age) >= 28 && Integer.parseInt(age) <= 118) {
                AllowedQueue.add(age);
            } else {
                NotAllowedQueue.add(age);
            }
        }
        System.out.println("Allowed Queue: " + AllowedQueue);
        System.out.println("Not Allowed Queue: " + NotAllowedQueue);
        scanner.close();
    }
}

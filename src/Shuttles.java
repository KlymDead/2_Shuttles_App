import java.util.Random;

public class Shuttles {
    public static void main(String[] args) {
        Random random = new Random();
        int[] shuttlesNumbers = new int[101];
        int min = 0, max = random.nextInt();
        int shuttlesCount = 1;
        while (shuttlesCount <= 100){
            shuttlesNumbers[shuttlesCount] = min + Math.abs(random.nextInt()) % (max - min + 1);
            String shuttleArray = Integer.toString(shuttlesNumbers[shuttlesCount]);
            if (shuttleArray.contains("4")) continue;
            else if (shuttleArray.contains("9")) continue;
            System.out.println("Shuttle " + shuttlesCount + " with number " + shuttleArray + " goes to Mars!");
            shuttlesCount++;

        }
    }
}
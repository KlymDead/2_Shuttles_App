public class Shuttles2 {
    public static void main(String[] args) {
        int shuttle = 0;
        System.out.println("Unlucky numbers in Japan are 4 and 9! We don't have shuttles with this numbers!");
        for (int i = 1; shuttle < 100; i++){
            String shuttles = Integer.toString(i);;
            if (shuttles.contains("4")) continue;
            else if (shuttles.contains("9")) continue;
            shuttle++;
            System.out.println("Shuttle "+ shuttle + " with number " + i + " prepare to go to Mars!" );
        }

    }
}
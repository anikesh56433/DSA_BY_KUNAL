package recursion;

public class LoveYouBaby {
    public static void main(String[] args) {
        String message = "I love you baby sorryy";
        int repeatCount = 1000000;

        for (int i = 1; i <= repeatCount; i++) {
            System.out.println(i + ". " + message);
        }
    }
}

package StringSolution;

import java.util.Random;

public class PasswordGenerate {

    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%";
        String password = "";

        Random rand = new Random();


        for (int i = 0; i < 8; i++) {  // Fixed 8-character password
            int index = rand.nextInt(chars.length());
            password += chars.charAt(index);
        }

        System.out.println("Generated Password: " + password);
    }

}

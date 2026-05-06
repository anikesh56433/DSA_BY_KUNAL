package Ab_DigiFlex.array;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153;
        int temp = number;

        int sum = 0 ;

        while(number!=0){


            int r = number%10 ;
            sum = sum + (r*r*r);
            number = number/10 ;

        }

        if(sum ==temp)

        {
            System.out.println(temp+ "  Number is Armstrong Number");
        }
        else {
            System.out.println(temp+"  Number is not a armstring number");
        }

    }
}

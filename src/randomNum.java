import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        Random random = new Random();

        //int number1,number2,number3;

        /*
        number1 = random.nextInt(1,7);
        number2 = random.nextInt(1,100);
        number3 = random.nextInt(1,50);

        double number;
         number = random.nextDouble();
         */

        boolean isHead;
        isHead = random.nextBoolean();

        if(isHead){
            System.out.println("HEAD");
        }else{
            System.out.println("TAILS");
        }


       /* System.out.println(number);
         System.out.println(number2);
        System.out.println(number3);
        */

    }
}

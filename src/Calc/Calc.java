package Calc;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by christiancampbell on 10/10/16.
 */
public class Calc {


    public static ArrayList<Integer> nums = new ArrayList<>();
    public static void Calculator(){
        while(true){





            System.out.println("Please Input Your First Number");
            Scanner num1 = new Scanner (System.in);
            int number1 = num1.nextInt();
            System.out.println("Please Input Your Second Number");
            Scanner num2 = new Scanner (System.in);
            int number2 = num2.nextInt();
            System.out.println("Please Input Your Operator");
            Scanner sign = new Scanner (System.in);
            String operator = sign.nextLine();

            if (operator.equals("+")){
                int sum;
                sum = number1 + number2;
                nums.add(sum);
                System.out.println (sum);
            }
            else if (operator.equals("-")){
                int difference;
                difference = number1 - number2;
                nums.add(difference);
                System.out.println (difference);
            }
            else if (operator.equals("*")){
                int product;
                product = number1 * number2;
                nums.add(product);
                System.out.println (product);
            }
            else if (operator.equals("/")){
                int quotient;
                quotient = number1 / number2;
                nums.add(quotient);
                System.out.print (quotient);
            }

            System.out.println("History: " + number1 + operator + number2 + nums);

            System.out.println("Would you like to do some more math? y/n");
            Scanner decision = new Scanner (System.in);
            String decision1 = decision.nextLine();
            if (decision1.equals("n")){
                break;
            }







        }

    }
}

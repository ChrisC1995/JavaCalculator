package Calc;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Created by christiancampbell on 10/10/16.
 */
public class Calc {




    public static ArrayList<String> nums = new ArrayList<>();
    public static void Calculator(){
        while(true) {
            System.out.println("Please Choose a Number" + "\n" + "Press 1 for Calculator" + "\n" + "Press 2 for Tip Calculator" + "\n" + "Press 3 For Help" + "\n" + "Press 4 to end");
            Scanner option = new Scanner(System.in);
            int options = option.nextInt();


            if (options == 1) {
                System.out.println("Please Input Your First Number");
                Scanner num1 = new Scanner(System.in);
                double number1 = num1.nextDouble();
                System.out.println("Please Input Your Second Number");
                Scanner num2 = new Scanner(System.in);
                double number2 = num2.nextDouble();
                System.out.println("Please Input Your Operator");
                Scanner sign = new Scanner(System.in);
                String operator = sign.nextLine();

                if (operator.equals("+")) {
                    double sum;
                    sum = Math.round((number1 + number2) * 100.00) / 100.00;
                    nums.add(number1 + "+" + number2 + "=" + sum);
                    System.out.println(sum);
                } else if (operator.equals("-")) {
                    double difference;
                    difference = Math.round((number1 - number2) * 100.00) / 100.00;
                    nums.add(number1 + "-" + number2 + "=" + difference);
                    System.out.println(difference);
                } else if (operator.equals("*")) {
                    double product;
                    product = Math.round((number1 * number2) * 100.00) / 100.00;
                    nums.add(number1 + "*" + number2 + "=" + product);
                    System.out.println(product);
                } else if (operator.equals("/")) {
                    double quotient;
                    quotient = Math.round((number1 / number2) * 100.00) / 100.00;
                    nums.add(number1 + "/" + number2 + "=" + quotient);
                    System.out.print(quotient);
                }

                System.out.println(nums);

                System.out.println("Would you like to do some more math? y/n");
                Scanner decision = new Scanner(System.in);
                String decision1 = decision.nextLine();
                if (decision1.equals("n")) {
                    break;
                }


            }
            else if (options == 2){
                System.out.println("Please input the amount of your bill");
                Scanner bill1 = new Scanner (System.in);
                double bill = bill1.nextDouble();
                System.out.println("Please input your tip amount (0.25 for 25%)");
                Scanner tip1 = new Scanner (System.in);
                double tip = tip1.nextDouble();
                double totalBill;
                totalBill = Math.round(bill + (bill * tip * 100.00))/100.00;
                System.out.println("Your total bill is: " + totalBill);

            }
            else if (options == 3){
                System.out.println("Press a button to select a function. Calculator is a standard calculator that adds/multiplies/subtracts/divides. Tip Calculator is a calculator that calculates the tip. Help displays this information. End ends the program.");
            }
            else if(options == 4){
                System.out.println("Thank you for using this app!");
                break;
            }
        }

    }
}

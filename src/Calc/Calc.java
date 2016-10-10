package Calc;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by christiancampbell on 10/10/16.
 */
public class Calc {




    public static ArrayList<String> nums = new ArrayList<>();
    public static void Calculator() throws IOException{
        String fileName = "CalcHistory.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
        while(true) {
            System.out.println("*********************"+ "\n" + "Please Choose a Number" + "\n" + "Press 1 for Calculator" + "\n" + "Press 2 for Tip Calculator" + "\n" + "Press 3 For Help" + "\n" + "Press 4 to clear history" + "\n" + "Press 5 to add grocery tax" + "\n" + "Press 6 to end" + "\n" +  "*********************");
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
                nums.add("Bill: " + bill+ "& " + "Tip: " + totalBill);
                System.out.println("Your total tip is: " + totalBill);
                System.out.println(nums);

            }
            else if (options == 3){
                System.out.println("Press a button to select a function. Calculator is a standard calculator that adds/multiplies/subtracts/divides. Tip Calculator is a calculator that calculates the tip. Help displays this information. End ends the program." + "\n" + "Clear clears the history");
            }
            else if(options == 6){
                System.out.println("Thank you for using this app!");
                outFile.println(nums);
                outFile.close();
                break;
            }
            else if(options == 4){
                nums.clear();
            }

            else if (options == 5){
                System.out.println("Please input the amount of your grocery bill");
                Scanner bill3 = new Scanner (System.in);
                double bills = bill3.nextDouble();
                System.out.println("Please enter your state text. (0.06 for KY)");
                Scanner stateTax = new Scanner (System.in);
                double state = stateTax.nextDouble();
                double groceryTax;
                groceryTax = Math.round((bills * state)*100.00)/100.00;
                nums.add("Tax: " + groceryTax);
                System.out.println("Your tax amount is: " + groceryTax);
                System.out.println(nums);

            }
        }

    }
}

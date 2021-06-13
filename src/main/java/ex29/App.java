/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex29;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
public class App
{
    public static void main( String[] args )
    {
        int years = evaluateYears();
        System.out.println("It will take " + years + " years to double your initial investment.");
    }

    public static int evaluateYears() {
        Scanner input = new Scanner(System.in);
        int years = 0;

        while(true) {
            try{
                System.out.print("What is the rate of return? ");
                int rate_of_return = parseInt(input.nextLine());

                if(rate_of_return == 0) {
                    System.out.println("Sorry. 0 is not a valid number.");
                    continue;
                }

                years = 72 / rate_of_return;

                return years;

            }catch(NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
    }
}
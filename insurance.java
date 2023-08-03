/*
 * If employee is married then he/she is eligible for Insurance
 * If employee is unmarried (Male) and his age is 30 and above he is eligible for Insurance
 * If employee is unmarried (Female) and her age is 25 and above he is eligible for Insurance
 */

import java.util.Scanner;

public class insurance
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Employee's Marital-status (M/U) :");
        char marital_status = input.next().charAt(0);   

        if (marital_status=='U'||marital_status=='u')
        {
            System.out.println("Enter Employee's Sex (M/F) :");
            char sex = input.next().charAt(0);
            System.out.println("Enter Employee's Age :");
            int age = input.nextInt();

            if ((sex=='M'||sex=='m') && age>=30)
            {
                System.out.println("Eligible for Insurance");
            }
            else if ((sex=='F'||sex=='f') && age>=25)
            {
                System.out.println("Eligible for Insurance");
            }
            else
            {
                System.out.println("Not Eligible for Insurance");
            }
        }
        else if (marital_status=='M')
        {
            System.out.println("Eligible for Insurance");
        }
        else
        {
            System.out.println("Alert: Invalid input!!! Please Enter Valid input");
        }
    }
}

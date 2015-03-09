# First

package b;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Hello, enter X (*/-+) Y");
            double firstNum;
            firstNum = sc.nextDouble();
            String s1 = sc.next();
            double secondNum;
            secondNum = sc.nextDouble();

            if ((firstNum == 0) && (s1.equals("/"))) {
                System.err.println("Error! You enter *0*, please enter an another number ");
                continue;}
             else
                if ((firstNum < 1.7e-308) || (firstNum > 1.7e308) && (secondNum < 1.7e-308) || (secondNum > 1.7e308)) {
                    System.err.println("Error! Take a new information! You enter a number that is not included in the limit");
                    continue;
                    }

            if (s1.equals("+")) {
                System.out.println("a+b =" + add(firstNum, secondNum));
            }
            if (s1.equals("-")) {
                System.out.println("a-b =" + sub(firstNum, secondNum));
            }
            if (s1.equals("*")) {
                System.out.println("a*b =" + mul(firstNum, secondNum));
            }
            if (s1.equals("/")) {
                System.out.println("a/b =" + div(firstNum, secondNum));
            }
            if (s1.equals("%")) {
                System.out.println("a%b =" + mod(firstNum, secondNum));
            }
            System.out.println("Would you like to start over? (yes/no)");
            String s2 = sc.next();
            if ("no".equals(s2)) {
                System.out.println("-------------Bye---------------");
                break;}
            else
                if("yes".equals(s2)){
                }
            else System.err.println("Error! Enter again!");
        }
    }
    public static double add(double a, double b)
    {
        return a + b;
    }

    public static double mul(double a, double b)
    {
        return a * b;
    }
    public static double div(double a, double b)
    {
        return a/b;
    }
    public static double sub(double a, double b)
    {
        return a - b;
    }
    public static double mod(double a, double b)
    {
        return a%b;
    }

}

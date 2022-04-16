package calculator;

import java.util.Scanner;
import static java.lang.System.exit;

public class calculator{
    public calculator(){}

    public double sqroot(double n){
        return Math.sqrt(n);
    }
    public double fact(double n){
        if(n<0) return Double.NaN;
        double result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }

    public double logarithm(double n){
        return Math.log(n);
    }

    public double power(double n, double x){
        return Math.pow(n,x);
    }

    public static void main(String[] args){
        calculator mycalc=new calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("       WELCOME TO THE CALCULATOR      ");
        while(true){
            System.out.println("Please enter your choice of operation");
            System.out.println("1-Square root");
            System.out.println("2-Factorial");
            System.out.println("3-Natural logarithm");
            System.out.println("4-Power");
            System.out.println("Any other number to exit");
            int choice=sc.nextInt();
            double x,n,result;
            switch(choice){
                case 1:
                    System.out.println("SQUARE ROOT - Enter a number---");
                    n=sc.nextDouble();
                    result=mycalc.sqroot(n);
                    System.out.println("Square root of "+n+" is "+result);
                    break;
                case 2:
                    System.out.println("FACTORIAL - Enter a number---");
                    n=sc.nextDouble();
                    result=mycalc.fact(n);
                    System.out.println("Factorial of "+n+" is "+result);
                    break;
                case 3:
                    System.out.println("NATURAL LOGARITHM - Enter a number---");
                    n=sc.nextDouble();
                    result=mycalc.logarithm(n);
                    System.out.println("Natural logarithm of "+n+" is "+result);
                    break;
                case 4:
                    System.out.println("POWER - Enter a number---");
                    n=sc.nextDouble();
                    System.out.println("Enter the power---");
                    x=sc.nextDouble();
                    result=mycalc.power(n,x);
                    System.out.println(n+" to the power of "+x+" is "+result);
                    break;
                default:
                    System.out.println("        EXITING       ");
                    exit(0);
            }
        }
    }
}
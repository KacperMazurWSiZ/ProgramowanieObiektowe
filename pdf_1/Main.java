import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner getArgument = new Scanner(System.in);
        System.out.println("Select a task (0-7)");
        int temp = getArgument.nextInt();
            switch(temp) {
                case 1:
                    System.out.println(getNameAndAge());
                    break;
                case 2:
                    double firstArgument = getArgument.nextDouble();
                    System.out.println("Enter second argument: ");
                    double secondArgument = getArgument.nextDouble();
                    twoArgumentSumDifferenceProduct(firstArgument, secondArgument);
                    break;
                case 3:
                    System.out.println("Enter your number to check even: ");
                    System.out.println(isEvenNumber(getArgument.nextInt()));
                    break;
                case 4:
                    System.out.println("Enter your number to check divisibility (3 and 5)");
                    System.out.println(isDivisibilityByThreeAndFive(getArgument.nextInt()));
                    break;
                case 5:
                    System.out.println("Enter your number to power of three: ");
                    System.out.println(powerOfThree(getArgument.nextDouble()));
                    break;
                case 6:
                    System.out.println("Enter your number to extract a root from: ");
                    System.out.println(sqrt(getArgument.nextDouble()));
                    break;
                case 7:
                    System.out.println("Enter your beginning of range: ");
                    int minRange = getArgument.nextInt();
                    System.out.println("Enter your end of range: ");
                    int maxRange = getArgument.nextInt();
                    System.out.println(checkTriangle(numberGenerator(maxRange,minRange),numberGenerator(maxRange,minRange),numberGenerator(maxRange,minRange)));
                    break;
                default:
                    System.out.println("Enter correct data");
            }
    }

    public static String getNameAndAge(){
        return "Name: Kacper, Age: " + 21;
    }

    public static void twoArgumentSumDifferenceProduct(double firstArgument, double secondArgument){
        System.out.println(firstArgument + secondArgument);
        System.out.println(firstArgument - secondArgument);
        System.out.println(firstArgument * secondArgument);
    }

    public static boolean isEvenNumber(int a){
        return a%2==0 ? true : false;
    }

    public static boolean isDivisibilityByThreeAndFive(int a){
        return a%15==0 ? true : false;
    }

    public static double powerOfThree(double a){
       return Math.pow(a,3);
    }

    public static double sqrt(double a){
        return Math.sqrt(a);
    }

    public static int numberGenerator(int max, int min){
        return new Random().nextInt((max - min) + 1) + min;
    }

    public static boolean checkTriangle(double a, double b, double c){
        if(a>c){
            double temp = c;
            c = a;
            a = temp;
        } else if (b>c) {
            double temp2 = c;
            c = b;
            b = temp2;
        }

        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
            return true;
        }
        else{
            return false;
        }
    }
}

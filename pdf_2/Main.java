import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;




public class Main {
    public static void main(String[] args){
        //quadraticEquation();
        //functionValue();
        minMax();
        //weatherBus();
        //bonusCar();
        //calculator();
    }

    public static double getDouble(){return new Scanner(System.in).nextDouble();}
    public static int getInt(){return new Scanner(System.in).nextInt();}
    public static boolean getBoolean(){return new Scanner(System.in).nextBoolean();}

    public static void quadraticEquation() {
        double a, b, c;
        System.out.println("Enter a: ");
        a = getDouble();
        System.out.println("Enter b: ");
        b = getDouble();
        System.out.println("Enter c: ");
        c = getDouble();

        double delta = (Math.pow(b,2) - 4*a*c);

        if(delta<0){
            System.out.println("No solutions");
        }
        else if (delta == 0) {
            System.out.println("One solution: " + ((-b)/(2*a)));
        }
        else{
            System.out.println("First solution: " +  (((-b) + Math.sqrt(delta)) / (2*a)));
            System.out.println("Second solution: " + (((-b) - Math.sqrt(delta)) / (2*a)));
        }
    }

    public static void functionValue(){
        System.out.println("Enter x: ");
        double x = getDouble();

        double temp1 = x, temp2 = x, temp3 = x;

        if(temp1>0){
            System.out.println("Result of first function: " + (2*temp1));
        }
        else if (temp1 == 0) {
            System.out.println("Result of first function: " + (0*temp1));
        }
        else{
            System.out.println("Result of first function: " + ((-3)*temp1));
        }

        if(temp2 >= 1){
            System.out.println("Result of second function: " + Math.pow(temp2,2));
        }
        else {
            System.out.println("Result of second function: " + temp2);
        }

        if(temp3 > 2){
            System.out.println("Result of third function: " + (2+temp3));
        }
        else if (temp3 == 2) {
            System.out.println("Result of third function: " + 8);
        }
        else {
            System.out.println("Result of third function: " + (temp3-4));
        }
    }

    public static void minMax(){
        System.out.println("Enter first number: ");
        double firstNumber = getDouble();
        System.out.println("Enter second number: ");
        double secondNumber = getDouble();
        System.out.println("Enter third number: ");
        double thirdNumber = getDouble();

        double array[] = {firstNumber,secondNumber,thirdNumber};

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }

    public static void weatherBus(){
        System.out.println("Is it raining: (true - yes/ false - no ");
        boolean rainStatus = getBoolean();
        System.out.println("Is there a bus: (true - yes/ false - no ");
        boolean busStatus = getBoolean();

        if(rainStatus && busStatus){
            System.out.println("Weź parasol, Dostaniesz się na uczelnie");
        }
        else if (rainStatus && (!busStatus)) {
            System.out.println("Nie dostaniesz się na uczelnie");
        }
        else if (!rainStatus && busStatus) {
            System.out.println("Dostaniesz się na uczelnie, miłego dnia");
        }

    }

    public static void bonusCar(){
        System.out.println("Is there a discount: (true - yes/ false - no ");
        boolean discountStatus = getBoolean();
        System.out.println("Do you have bonuses: (true - yes/ false - no ");
        boolean bonusStatus = getBoolean();

        if(!discountStatus || bonusStatus){
            System.out.println("„Możesz kupić samochód, Zniżki na samochód nie ma”");
        }
        else if (!discountStatus || !bonusStatus) {
            System.out.println("Zakup samochód trzeba odłożyć na później...”, „Zniżki na samochód nie ma”");
        }
        else if (discountStatus || bonusStatus){
            System.out.println("„Możesz kupić samochód!");
        }
    }

    public static void calculator(){
        System.out.println("Enter a: ");
        double a = getDouble();
        System.out.println("Enter b: ");
        double b = getDouble();
        System.out.println("Enter 1(+), 2(-), 3(/), 4(*), 5(%) ");

        int menu = getInt();

        switch(menu) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a*b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Enter correct data!");
        }



    }
}

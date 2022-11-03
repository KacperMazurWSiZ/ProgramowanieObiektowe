import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.lang.String;
public class Main {

    public static void main(String[] args){
       // System.out.println("Enter number of student: ");
       // int numberOfStudents = getInt();
       // System.out.println(avgStudentPoints(numberOfStudents));
       // taskTwo();
       // taskThree();
       // taskFour();
        taskFive();

    }
    public static int getInt(){return new Scanner(System.in).nextInt();}
    public static float avgStudentPoints(int numberOfStudents){
        int suma = 0, points = 0, i = numberOfStudents;
        while(i>0){
            System.out.println("Enter number of student: ");
            points = getInt();
            suma += points;
            i--;
        }
        float avg = suma/numberOfStudents;
        return avg;
    }

    public static void taskTwo(){
        int[] anArray = new int[10];
        int sumOfPositiveNumber = 0, sumOfNegativeNumber = 0, numberOfPositiveNumber = 0, numberOfNegativeNumber = 0;
        for(int i= 0; i<10; i++){
            System.out.println("Enter number: ");
            anArray[i] = getInt();
        }
        for(int i= 0; i<10; i++){
           if(anArray[i]>=0){
            sumOfPositiveNumber += anArray[i];
            numberOfPositiveNumber++;
           }
           else if (anArray[i]<0) {
               sumOfNegativeNumber += anArray[i];
               numberOfNegativeNumber++;
           }
        }
        System.out.println("Sum of positive number: " +sumOfPositiveNumber+ " number of positive number: " + numberOfPositiveNumber);
        System.out.println("Sum of negative number: " +sumOfNegativeNumber+ " number of positive number: " + numberOfNegativeNumber);
    }

    public static void taskThree(){
        int suma = 0;
        System.out.println("Enter end of range: ");
        int endOfRange = getInt();
        int[] Array = new int[endOfRange];
        for(int i= 0; i<endOfRange; i++){
            System.out.println("Enter number: ");
            Array[i] = getInt();
        }

        for(int i= 0; i<endOfRange; i++){
            if(Array[i]%2==0){
                suma += Array[i];
            }
        }
        System.out.println("Sum: " + suma);
    }

    public static void taskFour(){
        Random rand = new Random();
        int suma = 0, randomNumber = 0;
        System.out.println("Enter length: ");
        int numbers = getInt();

        for(int i=0; i<numbers; i++){
            randomNumber = rand.nextInt(56)-10;
            System.out.println(randomNumber);
            if(randomNumber%2==0){
                suma += randomNumber;
            }
        }
        System.out.println("Sum: " + suma);
    }

    public static void taskFive(){
        System.out.println("Enter word: ");
        String word = new Scanner(System.in).nextLine();
        String newWord = "";
        char wordChar;
        for(int k=0; k< word.length(); k++){
            wordChar = word.charAt(k);
            newWord = wordChar + newWord;
        }
        if(word.compareTo(newWord)==0){
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Nie palindrom");
        }

    }
}

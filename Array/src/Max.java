import java.util.Scanner;

public class Max {

public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    double[] number = new double[5];  // declaration of array
    double sum = 0;

    System.out.print("please Enter 5 numbers:");

    for (int i = 0; i < number.length; i++) {
        number[i] = input.nextDouble();

    }
    for (int i = 0; i <number.length ; i++) {
        sum = sum + number[i];

    }

    double avg = sum / number.length;
    System.out.println("The sum is:" +sum);
    System.out.println("Average is "+ avg);


    //maximum bar korar jonno logic

   double max = number[0];
    double min = number[0];

    for (int i = 0; i <5 ; i++) {


        if(max<number[i]){
            max = number[i];
        }
        if(min>number[i]){
            min = number[i];
        }
    }
    System.out.println("Maximum = "+max);
    System.out.println("Minimum "+min);

}
}


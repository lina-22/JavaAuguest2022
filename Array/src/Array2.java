import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      double[] number = new double[5];
      double sum =0;
        System.out.print("please enter 5 numbers:");

        for (int i = 0; i <5 ; i++) {
           number[i] = input.nextDouble();
        }

        sum = number[0] + number[2] + number[3] + number[4];
        System.out.println("The sum is "+sum);
    }
}



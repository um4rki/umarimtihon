package lesson1.Task2;

import java.util.Scanner;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 12:25 PM
 */
public class Test {

    public static void main(String[] args) throws NoFoundNumberException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }


        System.out.println("Enter numbers: ");
        int n = sc.nextInt();
        if(n<0||n>arr.length){
            throw new NoFoundNumberException("Not found number exeptions");
        }else {
            System.out.println(arr[n]);
        }
    }


}



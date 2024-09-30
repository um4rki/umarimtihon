/*
package lesson1.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.print("1 dan 10 gacha son kiriting: ");
        int input = sc.nextInt();
        try {

            if (input < 0 || input > 10) {
                throw new NoFoundNumberException("Xato son kiritdingiz");
            } else {
                System.out.println("Son to'g'ri");
            }
        }catch (NoFoundNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
*/

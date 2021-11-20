package com.pb.enot.test;/*

         |\ _ /|
        /  @  @ \
       (  > * <  )
       '>>>>X<<<<'
       /    O    \

 */
import java.util.Random;

class Exercise11 {



        public static void main(String[] args) {
            Random random = new Random();
            int[][] arr = new int[10][10];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = random.nextInt(101);
                }
            }
            for (int[] anArr : arr) {
                for (int anAnArr : anArr) {
                    System.out.print(anAnArr + " ");
                }
                System.out.println();
            }
        }





}

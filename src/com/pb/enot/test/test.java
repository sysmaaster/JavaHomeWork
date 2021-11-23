package com.pb.enot.test;
/*

         |\ _ /|
        /  @  @ \
       (  > * <  )
       '>>>>X<<<<'
       /    O    \

 */

import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;


class Exercise11 {

    public static void main(String[] args) throws Exception {

        //  createNumbersFile();
        createOddNumbersFile();
    }


    public static void createNumbersFile() throws Exception {

        try (FileWriter writer = new FileWriter("numbers.txt", false)) {
            int[][] arr = new int[10][10];
            Random random = new Random();
            System.out.println("File created: ");
            writer.append('\n');
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = random.nextInt(100);
                    writer.write(arr[i][j] + " ");
                }
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("Щось пішло не так!");
            e.printStackTrace();
        }
    }

    public static void createOddNumbersFile() throws Exception {
        File file = new File("D:/IdeaProjects/JavaHomeWork/numbers.txt");
        String[][] value = new String[11][10];
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        int row = 0;
        int col = 0;

        while ((line = br.readLine()) != null) {
            StringTokenizer s = new StringTokenizer(line, " ");
            while (s.hasMoreTokens()) {
                System.out.println(s.nextToken());
                value[row][col] = s.nextToken();
                if (col != 10) {
                    col++;
                } else {
                    break;
                }
            }
            col = 0;
            row++;
        }
    }


}





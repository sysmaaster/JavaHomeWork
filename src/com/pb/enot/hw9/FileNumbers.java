package com.pb.enot.hw9;

import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

public class FileNumbers {
    public static void main(String[] args) throws Exception {

        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() throws Exception {

        try (FileWriter writer = new FileWriter("numbers.txt", false)) {
            int[][] arr = new int[10][10];
            Random random = new Random();
            System.out.println("File created: ");

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = random.nextInt(100);
                     writer.write(arr[i][j] + " ");
                 }
                 writer.append('\n');
             }
             writer.flush();
         } catch (IOException e) {
             System.out.println("Шота сломалось :(");
             e.printStackTrace();
         }
     }

    public static void createOddNumbersFile() throws IOException {
        File file = new File("D:/IdeaProjects/JavaHomeWork/numbers.txt");
        int[][] odd = new int[10][10];
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        int row = 0;
        int col = 0;
        int n = odd.length;
        try {
            FileWriter writer = new FileWriter("odd-numbers.txt", false);
            while ((line = br.readLine()) != null) {
                StringTokenizer s = new StringTokenizer(line, " ");
                while (s.hasMoreTokens()) {
                    int di = Integer.parseInt(s.nextToken());
                    if ((di % 2) == 0) {
                        di = 0;
                        writer.write(di + " ");
                    } else if ((di % 1) == 0) {
                        writer.write(di + " ");
                    }
                    col++;
                }
                writer.append('\n');
                col = 0;
                row++;
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Шота сломалось :(");
            e.printStackTrace();
        }

    }
}
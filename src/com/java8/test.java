package com.java8;

import java.util.Scanner;

public class test {
    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] dataToSearch = new char[size][size];
        for (int i = 0; i < size; i++) {
            String input = scanner.nextLine();
            input = input.replaceAll("#", "");
            char[] chararray = input.toCharArray();
            for (int j = 0; j < chararray.length; j++) {
                dataToSearch[i][j] = chararray[j];
            }
        }

        String search = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                count += logic(i, j, size, search, dataToSearch);
            }
        }
        System.out.print(count);

    }

    static int logic(int row, int column, int size, String search, char[][] dataToSearch) {
        int count = 0;
        if (column == 0) {
            if (row == 0) {
                //can move in right,
                int i = 0;
                for (; i < size; i++) {
                    char c = search.charAt(i);
                    if (c == dataToSearch[row][i]) {

                    } else {
                        break;
                    }
                }
                if (i == size) count++;
                i = 0;
                //down,
                for (; i < size; i++) {
                    char c = search.charAt(i);
                    if (c == dataToSearch[i][0]) {

                    } else {
                        break;
                    }
                }
                if (i == size) count++;
                i = 0;
                //dignaol
                for (; i < size; i++) {
                    char c = search.charAt(i);
                    if (c == dataToSearch[i][i]) {

                    } else {
                        break;
                    }
                }
                if (i == size) count++;

            } else if (row == size - 1) {
                //move up,
                int i = size - 1;
                int j = 0;
                for (; i >= 0; i--, j++) {
                    char c = search.charAt(j);
                    if (c == dataToSearch[i][0]) {

                    } else {
                        break;
                    }
                }
                if (i == -1) count++;
                i = size - 1;
                j = 0;
                //digonal,
                for (; i >= 0; i--, j++) {
                    char c = search.charAt(j);
                    if (c == dataToSearch[i][j]) {

                    } else {
                        break;
                    }
                }
                if (i == -1) count++;
                //right
                i = 0;
                for (; i < size; i++) {
                    char c = search.charAt(i);
                    if (c == dataToSearch[row][i]) {

                    } else {
                        break;
                    }
                }
                if (i == size) count++;
            } else {
                //only right
                int i = 0;
                for (; i < size; i++) {
                    char c = search.charAt(i);
                    if (c == dataToSearch[row][i]) {

                    } else {
                        break;
                    }
                }
                if (i == size) count++;
            }
        } else {
            if (row == 0) {
                int i = row;
                for (; i < size; i++) {
                    char c = search.charAt(i);
                    if (c == dataToSearch[i][column]) {

                    } else {
                        break;
                    }
                }
                if (i == size) count++;
            }else if(row==size-1){
                //up
                int i=row;
                int j=0;
                for (; i >=0; i--,j++) {
                    char c = search.charAt(j);
                    if (c == dataToSearch[i][column]) {

                    } else {
                        break;
                    }
                }
                if (i == -1) count++;
            }
        }
        return count;
    }
}

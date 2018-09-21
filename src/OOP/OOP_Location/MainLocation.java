package OOP.OOP_Location;

import java.util.Scanner;

public class MainLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row,col;
        System.out.println("nhap so dong:");
        row = scanner.nextInt();
        System.out.println("nhap so cot:");
        col = scanner.nextInt();

        double [][]arr = new double [row][col];
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
        Location location = new Location();
        location= Location.locateLargest(arr);
        System.out.println("max value is:"+location.maxValue);
        System.out.println("in :{"+location.row+","+location.column+")");

    }
}

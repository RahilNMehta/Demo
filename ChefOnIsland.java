package com.Java;
import java.util.Scanner;

public class ChefOnIsland {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- > 0){
            String a[] = s.nextLine().split(" ");

            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            int xr = Integer.parseInt(a[2]);
            int yr = Integer.parseInt(a[3]);
            int d = Integer.parseInt(a[4]);

            double x1 = x/xr;
            double y1 = y/yr;

            if(x1<d || y1<d)
                System.out.println("NO");
            else
                System.out.println("YES");

        }
    }
}

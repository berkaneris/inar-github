package week_02;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       int x , y;

        x = 3; y = 3;
        switch (x + 3) {
            case 6: y = 1;
            default: y += 1;
        }
        System.out.println(x + " + " + y);
    }
}


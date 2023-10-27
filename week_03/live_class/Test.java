package week_03.live_class;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
// kullanıcıdan numara al.
// numara üret
// kıyaslama ifadeleri
// çıktıyı göster
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock(1), paper(2): ");
        int user = input.nextInt();
        int computer = (int)(Math.random() * 3); // 0,1,2 generated

        if (user == 0 && computer == 0){
            System.out.println("The computer is scissor. You are a scissor too.it is a draw");
        } else if (user == 0 && computer == 1) {
            System.out.println("The computer is rock. You are scissor.Computer won ");
        } else if (user == 0 && computer ==2) {
            System.out.println("The computer is paper. You are scissor.You won ");
        }else if (user == 1 && computer == 0){
            System.out.println("The computer is scissor. You are a rock. You won");
        } else if (user == 1 && computer == 1) {
            System.out.println("The computer is rock. You are rock.It is a draw ");
        } else if (user == 1 && computer ==2) {
            System.out.println("The computer is paper. You are rock.Computer won ");
        }else if (user == 2 && computer == 0){
            System.out.println("The computer is scissor. You are a paper.Computer won");
        } else if (user == 2 && computer == 1) {
            System.out.println("The computer is rock. You are paper.You won ");
        } else if (user == 2 && computer ==2) {
            System.out.println("The computer is paper. You are paper.It is a draw ");
        }else {
            System.out.println("The input is invalid.");
        }


    }
}

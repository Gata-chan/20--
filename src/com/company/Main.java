package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AI ai = new AI();
        kolvospichek spichkii = new kolvospichek();
        cheihod hod = new cheihod();
        Scanner sc = new Scanner(System.in);
        Player Player = new Player();
        int number = 0;
        System.out.println("Игра началась");
	    while (spichkii.getSpichki() >= 1){
	        if (hod.getHod() == true && spichkii.getSpichki() == 1){
                System.out.println("Вы проиграли");
                System.out.println("Игра окончена");
                break;
            } else {
                if (hod.getHod()) {
                    System.out.println("Ходит игрок:");
                    number = sc.nextInt();
                    ai.setIgrokVsal(number);
                    Player.Hod(number, spichkii);
                    if (number > 3 || number <= 0){
                        hod.setHod(true);
                        continue;
                    } else {
                        System.out.println("На остале осталось " + spichkii.getSpichki() + " спичек");
                        hod.setHod(false);
                    }
                } else {
                    ai.AIHod(hod, spichkii);
                    System.out.println("Ходит ИИ:");
                    System.out.println("На столе осталось " + spichkii.getSpichki() + " спичек");
                    hod.setHod(true);
                }
            }
        }
    }
}

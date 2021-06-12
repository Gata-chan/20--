package com.company;

public class kolvospichek {
    private int spichki = 20;

    public int getSpichki() {
        return spichki;
    }

    public void changeSpichki (int chislo){
        switch (chislo) {
            case  (1):
                spichki -= 1;
                break;
            case (2):
                spichki -= 2;
                break;
            case (3):
                spichki -=3;
                break;
            default:
                System.out.println("Неверное число, повторите ввод");
                break;
        }
    }
}

package com.company;


public class Player {

    public void Hod (int chislo, kolvospichek spichki) {
        switch (chislo) {
            case (1):
                spichki.changeSpichki(1) ;
                break;
            case (2):
                spichki.changeSpichki(2) ;
                break;
            case (3):
                if ((spichki.getSpichki() - chislo) > 0){
                    spichki.changeSpichki(3) ;
                } else if ((spichki.getSpichki() - chislo) == 0) {
                    System.out.println("Неверное число");
                } else if ((spichki.getSpichki() - chislo) < 0) {
                System.out.println("Неверное число");
                }
                break;
            default:
                System.out.println("Неверное число, повторите ввод");
                break;
        }
    }
}

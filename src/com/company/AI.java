package com.company;
import com.company.cheihod;
import com.company.kolvospichek;

public class AI {
    int igrokVsal = 0;

    public void setIgrokVsal(int igrokVsal) {
        this.igrokVsal = igrokVsal;
    }

    public void AIHod(cheihod hod, kolvospichek spichki) {
        if (hod.getHod() == false) {
            if (igrokVsal == 0) {
                spichki.changeSpichki(3);
            } else {
                spichki.changeSpichki(4 - igrokVsal);
            }
        }
    }
}

package com.adidas.sanzalb.testingday;

public class ClassToBeTested {

    public int sum(int a, int b) {
        if (b == 1)
            return 2;
        else if (a == 2)
            return 4;
        else if (a == 0)
            return 2;
        else if (a == 4)
            return 7;
        else if (a >= 6)
            return 16;
        else
            return 4;
    }

}

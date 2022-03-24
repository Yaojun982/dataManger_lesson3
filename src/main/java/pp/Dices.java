package pp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Dices {
    public static void main(String[] args) {

        Random random= new Random();


        int[] a=new int[++n];

        int dice_no = 5;
        int dice = 6;
        int n = dice*dice_no; int max_test = 100000;
        for (int i = 0; i < max_test; i++) {
            int k=0;
            for (int j = 0; j < dice_no; j++) {
                k+= random.nextInt(dice)+1;

            }
            a[k]++;
        }
        for (int i = dice_no; i < n; i++) {
            System.out.println(String.join("", Collections.nCopies(a[i]/2000,"*")));
        }
    }


}
/*
    public static void main(String[] args) {
        Random random = new Random();
        int[] dices = new int[6];

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(6) + 1;
            System.out.println(num);
            dices[num - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            int max = 0;
            int point = 0;
            if (dices[i] > max) {
                max = dices[i];
                point = i + 1;
                System.out.println((i+1) + " -> " + dices[i] + " times");
            }
            //System.out.println((i+1) + " -> " + dices[i] + " times");

        }
    }
*/
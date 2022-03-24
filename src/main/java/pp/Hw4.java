package pp;

import java.util.Arrays;
import java.util.Random;

public class Hw4 {
    public static void main(String[] args) {
        Random random = new Random();
        int m=100000;
        int a[]=new  int[7];
        ///////////
        for (int i = 0; i < m; i++) {
            int d = random.nextInt(6)+1;
            a[d]++;
            //////////one dice
        }
        int d1 = random.nextInt(6)+1;
        int d2 = random.nextInt(6)+1;
        int d3 = random.nextInt(6)+1;
        int d4 = random.nextInt(6)+1;
        int d5 = random.nextInt(6)+1;
        int d6 = random.nextInt(6)+1;


        for (int i = 0; i < 1000; i++) {
            int d = random.nextInt(6)+1;
            if (d==1){
                d1++;
        }
            if (d==2){
                d2++;
            }
            if (d==3){
                d3++;
            }
            if (d==4){
                d4++;
            }
            if (d==5){
                d5++;
            }
            if (d==6){
                d6++;
            }
        }
        System.out.println(Arrays.toString(a));

        /////////////////////////////////
        System.out.println("d1 = "+d1);
        System.out.println("pro1="+(double)d1/1000);
        System.out.println("d2 = "+d2);
        System.out.println("pro2="+(double)d2/1000);
        System.out.println("d3 = "+d3);
        System.out.println("pro3="+(double)d3/1000);
        System.out.println("d4 = "+d4);
        System.out.println("pro4="+(double)d4/1000);
        System.out.println("d5 = "+d5);
        System.out.println("pro5="+(double)d5/1000);
        System.out.println("d6 = "+d6);
        System.out.println("pro6="+(double)d6/1000);

    }
    }


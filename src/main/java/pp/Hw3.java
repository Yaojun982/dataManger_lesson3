package pp;


import java.util.Arrays;

public class Hw3 {
    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        for (int i = 0; i <n; i++) {
            a[i]=i+1;


        }
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=a[i];
        }

        System.out.println("sum="+sum);

    }


}


/*
物件的東西java初始化

 */
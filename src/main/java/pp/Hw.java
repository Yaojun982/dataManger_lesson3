package pp;

import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        int icm;
        int im;
        int ikm;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter (cm) :");
        int duck =scanner.nextInt();
        String strMoney = String.valueOf(duck);
        String[] aryStr = strMoney.split("\\.");
            ikm=duck/100000;
            im=(duck/100)%1000;
            icm=(duck%100000)%100;
            System.out.println(strMoney+"cm = "+ikm+" km "+im+" m "+icm+" cm ");
    }
}



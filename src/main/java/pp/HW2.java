package pp;

public class HW2 {
    public static void main(String[] args) {
        int[] a = {2,1,4,3,8};
        int n =a.length;
        for (int i = 0; i <n ; i++) {
            System.out.println("a["+i+"]"+a[i]);
        }
        System.out.println("a[n-1]"+a[n-1]);
        System.out.println("a[n+2]"+a[n-2]);
    }
}

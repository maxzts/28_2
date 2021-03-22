package maxim;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a+" "+b+" ");
        for(int i = 3; i <= 11; i++){
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }
}
package by.epam.learn.main;

//2. Найти max{min(a, b), min(c, d)}.

public class Ramification2 {
    public static void main(String[] args) {
        int a=7;
        int b=11;
        int c=-8;
        int d=12;
        int max;
        int min1;
        int min2;
        min1=(a<=b)?a:b;
        min2=(c<=d)?c:d;
        max=(min1>=min2)?min1:min2;
        System.out.println(max);
    }
}

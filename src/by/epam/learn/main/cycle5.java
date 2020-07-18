package by.epam.learn.main;

//5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид: (формула)

import java.util.Scanner;

public class cycle5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=console.nextInt();
        System.out.println("Enter e:");
        double e=console.nextDouble();
        double sum=0;
        int i=1;
        double a;
        while(i<=n){
            a=1/Math.pow(2,n)+1/Math.pow(3,n);
            if(Math.abs(a)>=e){
                sum+=a;
            }
            i++;
        }
        System.out.println(sum);
    }
}

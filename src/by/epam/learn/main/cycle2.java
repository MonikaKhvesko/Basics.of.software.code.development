package by.epam.learn.main;

//2. Вычислить значения функции на отрезке [а,b] c шагом h: (формула)

import java.util.Scanner;

public class cycle2 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=console.nextInt();
        System.out.println("Enter b:");
        int b=console.nextInt();
        System.out.println("Enter h:");
        int h=console.nextInt();
        double result;
        while(a<=b){
            if(a>2){
              result=a;
            }else{
result=-a;
            }
            System.out.println(result);
            a+=h;
        }
    }
}

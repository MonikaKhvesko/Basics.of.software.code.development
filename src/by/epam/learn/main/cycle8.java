package by.epam.learn.main;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class cycle8 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int  numb1=console.nextInt();
        System.out.println("Enter the second number:");
        int numb2=console.nextInt();
        int a;
        int b;
        int c;
        while(numb1!=0){
            a=numb1%10;
            b=numb2;
            while(b!=0){
                 c=b%10;
                if(a==c){
                    System.out.println(a);
                }
                b/=10;
            }
            numb1/=10;
        }

    }
}

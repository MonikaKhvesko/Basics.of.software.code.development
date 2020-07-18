package by.epam.learn.main;

//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;
public class cycle7 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        System.out.println("Enter m:");
        int m=console.nextInt();
        System.out.println("Enter n:");
        int n=console.nextInt();

        while(m<=n){
            int a=2;
            System.out.printf(m+" : ");
            while(a<=m/2){
                if(m%a==0) {
                    System.out.printf(a+" ");
                }
                a++;
            }
            System.out.printf("\n");
            m++;
        }

        }
    }

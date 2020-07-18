package by.epam.learn.main;

//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class cycle1 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int number=console.nextInt();
        double sum=0;
        while(number>=1){
            sum+=1;
            number--;
        }
        System.out.println(sum);
    }
}

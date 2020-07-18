package by.epam.learn.main;

//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class cycle4 {
    public static void main(String[] args) {
        int a=1;
        int b=200;
        int result=1;
        while(a<=b){
            result*=Math.pow(a,2);
            a++;
        }
        System.out.println(result);
    }
}

package by.epam.learn.main;

//3. Найти сумму квадратов первых ста чисел.

public class cycle3 {
    public static void main(String[] args) {
        int a=1;
        int b=100;
        int sum=0;
        while(a<=b){
            sum+=Math.pow(a,2);
            a++;
        }
        System.out.println(sum);
    }
}

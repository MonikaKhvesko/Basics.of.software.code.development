package by.epam.learn.main;

//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏 + √𝑏2 + 4𝑎𝑐 2𝑎 − 𝑎3𝑐 + 𝑏−2

public class LineProgram2 {
    public static void main(String[] args){
        int a=1;
        int b=4;
        int c=77;
        double k=((b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a-Math.pow(a,3)*c+Math.pow(b,-2));
        System.out.println(k);
    }
}

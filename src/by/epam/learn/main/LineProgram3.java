package by.epam.learn.main;

//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦 𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦 ∗ 𝑡𝑔 𝑥𝑦

public class LineProgram3 {
    public static void main(String[] args) {
        int x=30;
        int y=90;
        double z=((Math.sin(Math.toRadians(x))+Math.cos(Math.toRadians(y)))/(Math.cos(Math.toRadians(x))-Math.sin(Math.toRadians(y))))*Math.tan(Math.toRadians(x*y));
        System.out.println(z);
    }
}

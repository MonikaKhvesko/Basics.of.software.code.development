package by.epam.learn.main;

//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Ramification4 {
    public static void main(String[] args) {
        int A=5;
        int B=7;
        int x=5;
        int y=4;
        int z=9;
        boolean flag=false;
if(A>x&&B>y){flag=true;}
if(A>y&&B>x){flag=true;}
if(A>z&&B>y){flag=true;}
if(A>y&&B>z){flag=true;}
if(A>x&&B>z){flag=true;}
if(A>z&&B>x){flag=true;}
        System.out.println(flag);
    }
}

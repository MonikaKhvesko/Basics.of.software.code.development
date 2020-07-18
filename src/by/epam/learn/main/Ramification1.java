package by.epam.learn.main;

//1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Ramification1 {
    public static void main(String[] args) {
        int angle1=130;
        int angle2=60;
        int angle3=180-angle1-angle2;
        boolean triangle=false;
        if(angle3>0){
           triangle=true;
        }
        System.out.println("triangle "+triangle);
        if(angle3==90){
            System.out.println("rectangular");
        }
    }
}

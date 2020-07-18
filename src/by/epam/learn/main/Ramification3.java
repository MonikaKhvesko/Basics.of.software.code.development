package by.epam.learn.main;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Ramification3 {
    public static void main(String[] args) {
        int x1=3,x2=6,x3=9;
        int y1=1,y2=2,y3=3;
        boolean flag=false;
        if((y1==y2)&&(y2==y3)||(x1==x2)&&(x2==x3)||(y1/x1==y2/x2)&&(y2/x2==y3/x3)){
            flag=true;
        }
        System.out.println("1 line "+flag);
    }
}

package by.epam.learn.main;

//5. Вычислить значение функции: (формула)

public class Ramification5 {
    public static void main(String[] args) {
        int x=2;
        double result;
        if(x<=3){
            result=Math.pow(x,2)-3*x+9;
        }else{result=1/(Math.pow(x,3)+6);}
        System.out.println(result);
    }
}
